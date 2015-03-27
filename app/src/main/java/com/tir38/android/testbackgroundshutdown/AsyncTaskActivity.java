package com.tir38.android.testbackgroundshutdown;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class AsyncTaskActivity extends LoggableActivity {

    private static final String TAG = AsyncTaskActivity.class.getSimpleName();

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();
    }

    private class MyAsyncTask extends AsyncTask {

        private final String TAG = MyAsyncTask.class.getSimpleName();

        protected Object doInBackground(Object[] params) {

            // loop for forever
            int i = 0;
            while (i == 0) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.d(TAG, "MyAsyncTask still running");
                Log.d(TAG, "status is: " + getStatus().toString());

            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute()");
            Log.d(TAG, "status is: " + getStatus().toString());
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            Log.d(TAG, "onPostExecute()");
            Log.d(TAG, "status is: " + getStatus().toString());
        }

        @Override
        protected void onProgressUpdate(Object[] values) {
            super.onProgressUpdate(values);
            Log.d(TAG, "onProgressUpdate()");
            Log.d(TAG, "status is: " + getStatus().toString());
        }

        @Override
        protected void onCancelled(Object o) {
            super.onCancelled(o);
            Log.d(TAG, "onCancelled(Object o)");
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            Log.d(TAG, "onCancelled()");
            Log.d(TAG, "status is: " + getStatus().toString());
        }
    }
}