package com.example.networkdemo;

import android.app.usage.NetworkStatsManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTv;
    private EditText mEditText;
    private InputStream mInputStream;
    private String mStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.btn_get);
        mTv = (TextView) findViewById(R.id.tv_get);
        mEditText = (EditText) findViewById(R.id.et_get);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mEditText.getText().toString().trim();
                doGet(url);
            }
        });
    }

    private void doGet(final String urlString) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    URL url = new URL(urlString);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    // 设置请求方式 需要写出来 大写 GET
                    connection.setRequestMethod("GET");
                    //设置超时时间
                    connection.setConnectTimeout(3000);
                    //设置返回的状态码
                    int responseCode = connection.getResponseCode();
                    if(responseCode == 200){
                        // 获取的数据以流的形式 返回回来
                        mInputStream = connection.getInputStream();
                        // 解析流数据
                        mStream = NetworkUtils.readStream(mInputStream);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        mTv.setText(mStream);

    }
}
