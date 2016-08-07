package com.example.navigationviewdemo;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.dl);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nv);
        //actionbar
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,null, R.string.start,R.string.start);
        //关联actionbar和DrawerLayout
        mDrawerLayout.addDrawerListener(mToggle);
        //同步
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //设置navagationview里的item的点击事件
        navigationView.setNavigationItemSelectedListener(this);


        //fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_1:
                Toast.makeText(MainActivity.this, "点击了item1", Toast.LENGTH_SHORT).show();
            case R.id.item_2:
                Toast.makeText(MainActivity.this, "点击了item2", Toast.LENGTH_SHORT).show();
        }
        //如果navigation(抽屉)拉出来,点击时关闭
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        return false;
    }
    /*
    按下返回键时,若抽屉打开,先关闭抽屉,再次按则退出程序
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
    左上角菜单键设置
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
