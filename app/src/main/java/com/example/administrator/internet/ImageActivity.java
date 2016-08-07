package com.example.administrator.internet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ImageActivity extends AppCompatActivity {
    ProgressBar mProgressBar;
    ImageView mImageView;
    public static final String url = "http://g.hiphotos.baidu.com/baike/pic/item/cdbf6c81800a19d8aafd3f753bfa828ba71e46c7.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        mProgressBar = (ProgressBar) findViewById(R.id.pb);
        mImageView = (ImageView) findViewById(R.id.iv);

        imageAsync async = new imageAsync();
        async.execute(url);

    }

    /*
    第一个参数:接收的对象,url
    第二个参数:进度条
    第三个参数:返回的对象,bitmap
     */
    private class imageAsync extends AsyncTask<String,Void,Bitmap>{
        /*
        实现联网功能
         */
        @Override
        protected Bitmap doInBackground(String... params) {
            String url = params[0];
            Bitmap bitmap = null;

            HttpURLConnection connection;
            InputStream is;

            try {
                connection = (HttpURLConnection) new URL(url).openConnection();
                is = connection.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //加载图片
                bitmap = BitmapFactory.decodeStream(bis);
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //加载图片前先让进度条可见
            mProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            //加载完成后进度条消失
            mProgressBar.setVisibility(View.GONE);
            //加载完成后显示到imageBView上
            mImageView.setImageBitmap(bitmap);

        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }
}
