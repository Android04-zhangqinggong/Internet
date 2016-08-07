package com.example.weather;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/2.
 */
public class WeatherAdapter extends BaseAdapter{
    ArrayList<WeatherInfo> mArrayList;
    Context mContext;

    public WeatherAdapter(ArrayList<WeatherInfo> arrayList, Context context) {
        mArrayList = arrayList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;
        if(convertView == null){
            mViewHolder =new ViewHolder();
            convertView = View.inflate(mContext,R.layout.item_weather,null);
            mViewHolder.mTextView1 = (TextView) convertView.findViewById(R.id.tv_date);
            mViewHolder.mTextView2 = (TextView) convertView.findViewById(R.id.tv_nongli);
            mViewHolder.mTextView3 = (TextView) convertView.findViewById(R.id.tv_week);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mTextView1.setText(mArrayList.get(position).getDate().trim());
        mViewHolder.mTextView2.setText(mArrayList.get(position).getNongli().trim());
        mViewHolder.mTextView3.setText(mArrayList.get(position).getWeek().trim());
        return convertView;
    }
    public static class ViewHolder{
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
    }

}
