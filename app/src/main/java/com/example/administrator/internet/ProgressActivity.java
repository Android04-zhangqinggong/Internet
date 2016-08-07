package com.example.administrator.internet;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {
    ProgressBar mProgressBar;
    private AsyncProgress mAsync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        mProgressBar = (ProgressBar) findViewById(R.id.pb);

        mAsync = new AsyncProgress();
        mAsync.execute();
    }

    @Override
    protected void onPause() {
        super.onPause();
        AsyncTask.Status status = mAsync.getStatus();
        if (mAsync != null && status == AsyncTask.Status.RUNNING){
            mAsync.cancel(true);
        }
    }

    /*
        如果此Async没有执行完就退出这个activity,仍在后台执行,所以需要在activity的onpause()方法里
        让async取消,并在doInBackground方法里或者去这个状态,不再执行
         */
    private class AsyncProgress extends AsyncTask<Void,Integer,Void>{
        @Override
        protected Void doInBackground(Void... params) {
            for (int i = 0; i < 100; i++) {
                //如果取消,终止循环
                if(isCancelled()){
                    break;
                }

                //利用此方法执行onProgressUpdate()方法,更新进度条
                publishProgress(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //更新进度条
            mProgressBar.setProgress(values[0]);
        }
    }
}
