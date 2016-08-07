package com.example.weather;

import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/7.
 */
public class ParseJsonUtils {
    static ArrayList<WeatherInfo> mArrayList = new ArrayList<>();
    private static StringBuffer mBuffer;

    /*
    利用GSON解析
     */


    public static StringBuffer getTodayWeatherInfo(String str){
        Gson mGson = new Gson();
        GSONBean gsonBean = mGson.fromJson(str, GSONBean.class);
        StringBuffer buffer = new StringBuffer();
        buffer.append("时间:" + gsonBean.getResult().getData().getLife().getDate()+"\n");
        buffer.append("穿衣指数:"+gsonBean.getResult().getData().getLife().getInfo().getChuanyi().get(1)+"\n");
        buffer.append("感冒指数:"+gsonBean.getResult().getData().getLife().getInfo().getGanmao().get(1)+"\n");
        buffer.append("空调指数:"+gsonBean.getResult().getData().getLife().getInfo().getKongtiao().get(1)+"\n");
        buffer.append("污染指数:"+gsonBean.getResult().getData().getLife().getInfo().getWuran().get(1)+"\n");
        buffer.append("洗车指数:"+gsonBean.getResult().getData().getLife().getInfo().getXiche().get(1)+"\n");
        buffer.append("运动指数:"+gsonBean.getResult().getData().getLife().getInfo().getYundong().get(1)+"\n");
        buffer.append("紫 外 线:"+gsonBean.getResult().getData().getLife().getInfo().getZiwaixian().get(1));
        return buffer;
    }










    /*
    JSON解析
     */
    public static StringBuffer parseJson(String str) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(str);
            String reason = jsonObject.getString("reason");
            if (reason.equals("successed!")){
                JSONObject result = jsonObject.getJSONObject("result");
                //获得data对象
                JSONObject data = result.getJSONObject("data");
                //调用getTodayWeather方法,解析life对象对象里的数据
                mBuffer = getTodayWeather(data);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mBuffer;

    }
    public static ArrayList<WeatherInfo> getWeather(String str) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(str);
            String reason = jsonObject.getString("reason");
            if (reason.equals("successed!")){
                JSONObject result = jsonObject.getJSONObject("result");
                //获得data对象
                JSONObject data = result.getJSONObject("data");
                JSONArray weather = data.getJSONArray("weather");
                for (int i = 0; i < weather.length(); i++) {
                    WeatherInfo weatherInfo = new WeatherInfo();
                    //获取数组里的对象用get(),不能用getISONObject()
                    JSONObject jsonObject1 = (JSONObject) weather.get(i);
                    weatherInfo.setDate(jsonObject1.getString("date").trim());
                    weatherInfo.setNongli(jsonObject1.getString("nongli").trim());
                    weatherInfo.setWeek("星期" + jsonObject1.getString("week").trim());
                    mArrayList.add(weatherInfo);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mArrayList;
    }

    /*
        获取data对象里的数据
         */
    @NonNull
    private static StringBuffer getTodayWeather(JSONObject data) throws JSONException {
        //获得life对象
        JSONObject life = data.getJSONObject("life");
        //获得date
        String date = life.getString("date");
        //获得info对象
        JSONObject info = life.getJSONObject("info");
        //获得info对象里的数组
        JSONArray chuanyi = info.getJSONArray("chuanyi");
        StringBuffer buffer = new StringBuffer();
        buffer.append(chuanyi.getString(0) + "," + "\r\n" + chuanyi.getString(1) + "\r\n" );

        JSONArray ganmao = info.getJSONArray("ganmao");
        buffer.append(ganmao.getString(0)+ "," + "\r\n" + ganmao.getString(1) + "\r\n");

        JSONArray kongtiao = info.getJSONArray("kongtiao");
        buffer.append(kongtiao.getString(0)+ "," + "\r\n" + kongtiao.getString(1) + "\r\n");

        JSONArray wuran = info.getJSONArray("wuran");
        buffer.append(wuran.getString(0)+ "," + "\r\n" + wuran.getString(1) + "\r\n");

        JSONArray xiche = info.getJSONArray("xiche");
        buffer.append(xiche.getString(0)+ "," + "\r\n" + xiche.getString(1) + "\r\n");
        JSONArray yundong = info.getJSONArray("yundong");
        buffer.append(yundong.getString(0)+ "," + "\r\n" + yundong.getString(1) + "\r\n");

        JSONArray ziwaixian = info.getJSONArray("ziwaixian");
        buffer.append(ziwaixian.getString(0)+ "," + "\r\n" + ziwaixian.getString(1) + "\r\n");
        return buffer;
    }
}
