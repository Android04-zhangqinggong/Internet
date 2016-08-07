package com.example.recycleviewdemo;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/5.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<ItemBean> mArrayList;

    public RecycleAdapter(Context context, ArrayList<ItemBean> arrayList) {
        mContext = context;
        mArrayList = arrayList;
    }

    /**
     * 创建View holder
     * 1. 需要找到自定义的 item.xml
     * 2. inflate
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_recycle, parent, false);
        //实例化ViewHolder返回,
        return new MyViewHolder(view);
    }

    /**
     * 给Item传参数
     * getView的事儿
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ItemBean itemBean = mArrayList.get(position);
        Picasso.with(mContext)
                .load(itemBean.img)
                .into(holder.mImageView);
    }


    @Override
    public int getItemCount() {
        if(mArrayList != null){
            return mArrayList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public ImageView mImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.cv);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_cardview);
        }
    }



}
