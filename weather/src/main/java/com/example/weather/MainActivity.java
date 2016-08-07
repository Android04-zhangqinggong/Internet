package com.example.weather;

import android.os.AsyncTask;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Button mBtnGet;
    TextView mTextView;
    TextView mHeader;
    ListView mListView;
    EditText mCity;
    ArrayList<WeatherInfo> mArrayList;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    String cityName;
    private static final String TAG = "MainActivity";
    private StringBuffer mBuffer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mBtnGet = (Button) findViewById(R.id.btn_get);
        mListView = (ListView) findViewById(R.id.lv_wheather);
        mCity = (EditText) findViewById(R.id.et_city);
        mHeader = (TextView) findViewById(R.id.tv_header);
        mArrayList = new ArrayList<>();
        mBtnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    cityName = mCity.getText().toString().trim();
                    //将汉字格式的城市进行编码
                    String url = URLEncoder.encode(cityName, "UTF-8");
                    WeatherAsync async = new WeatherAsync();
                    async.execute(url);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nv);
        //actionbar
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.start,R.string.end);
        //关联actionbar和DrawerLayout
        mDrawerLayout.addDrawerListener(mToggle);
        //同步
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //设置navagationview里的item的点击事件
        navigationView.setNavigationItemSelectedListener(this);
    }

    /*
     navigation:里面item的点击事件
     */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (item.getItemId()){
            case R.id.item_1:
                Toast.makeText(MainActivity.this, "点击了item1", Toast.LENGTH_SHORT).show();
                TodayInfoFragment fragment = new TodayInfoFragment();
                Bundle bundle = new Bundle();
                bundle.putString("text",mBuffer.toString().trim());
                fragment.setArguments(bundle);
                transaction.replace(R.id.ll_insertfragment,fragment).addToBackStack(null).
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();

                break;
            case R.id.item_2:
                Toast.makeText(MainActivity.this, "点击了item2", Toast.LENGTH_SHORT).show();
                break;
        }
        //如果navigation(抽屉)拉出来,点击时关闭
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        return false;
    }
    /*
     navigation:按下返回键时,若抽屉打开,先关闭抽屉,再次按则退出程序
     */

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    /*
    navigation:左上角菜单键设置
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    /*
    利用AsyncTask,让联网在后台运行
     */
    private class WeatherAsync extends AsyncTask<String,Void,String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if (mArrayList != null){
                for (int i = mArrayList.size()-1; i >=0 ; i--) {
                    mArrayList.remove(i);
                }
            }
        }

        @Override
        protected String doInBackground(String... params) {
            String urlString = params[0];
            //调用GetUrlString类里的getString()方法,返回一个字符串,用于GSON/JSON解析
            return GetUrlString.getString(urlString);
        }
        /*
        更新UI不能在doInBackground()方法里,只能在onPostExecute()方法里
         */
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //后台传过来的String,调用parseJson方法进行JSON解析,并展示在页面上
            Log.d(TAG, "onPostExecute: " + s);
            mBuffer = ParseJsonUtils.getTodayWeatherInfo(s);
            //mTextView.setText(mBuffer.toString().trim());


            mArrayList = ParseJsonUtils.getWeather(s);
            //调用getWeather方法,解析weather数组里的数据
            mListView.setAdapter(new WeatherAdapter(mArrayList,MainActivity.this));
        }
    }



}
