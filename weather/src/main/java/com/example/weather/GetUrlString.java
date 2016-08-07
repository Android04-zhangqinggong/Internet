package com.example.weather;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/8/7.
 */
public class GetUrlString {
    static OkHttpClient mCliment = new OkHttpClient();
    static String urlAddress = "http://op.juhe.cn/onebox/weather/query?cityname=";
    static String key = "&key=47b6953bb67bd7b7ac0f73885826be04";
    private static String mString;

    public static String getString(String urlString) {
    /*
    Okhttp方式,比HttpURLConnection简单
     */
        //request阶段
        Request request = new Request.Builder().url(urlAddress + urlString + key).build();
        //response阶段
        try {
            Response response = mCliment.newCall(request).execute();
            if(response.isSuccessful()){
                mString = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mString;
    }
}
