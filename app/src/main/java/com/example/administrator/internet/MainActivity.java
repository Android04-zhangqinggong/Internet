package com.example.administrator.internet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //点击按键加载图片
    public void openImage(View view) {
        Intent intent = new Intent(this,ImageActivity.class);
        startActivity(intent);
    }
    //点击按钮,调到加载进度条的界面
    public void openprogress(View view) {
         Intent intent = new Intent(this,ProgressActivity.class);
        startActivity(intent);
    }
}
