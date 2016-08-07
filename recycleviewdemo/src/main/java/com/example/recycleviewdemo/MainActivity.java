package com.example.recycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.HideReturnsTransformationMethod;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<ItemBean> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setHasFixedSize(true);
        //设置recycleView以什么形式展示出来
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(manager);

        mArrayList = new ArrayList<>();

        mRecyclerView.setAdapter(new RecycleAdapter(this,mArrayList));

    }
    public ArrayList<ItemBean> getArrayList(String str){
        Gson gson = new Gson();

        GsonBean gsonBean = gson.fromJson(str, GsonBean.class);


        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                ItemBean bean = new ItemBean();
                bean.img = "http://ww1.sinaimg.cn/mw600/6200e46agw1f69h2p2i60j20ri0ic77h.jpg";
                mArrayList.add(bean);
            } else {
                ItemBean bean = new ItemBean();
                bean.img = "http://ww3.sinaimg.cn/mw600/6e5b2895gw1f6gaadswpxj20c80icwf1.jpg";
                mArrayList.add(bean);
            }
        }
        return mArrayList;
    }
}
