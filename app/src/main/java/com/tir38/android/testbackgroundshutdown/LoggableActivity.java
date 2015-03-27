package com.tir38.android.testbackgroundshutdown;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public abstract class LoggableActivity extends ActionBarActivity {

    public abstract String getTag();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getTag(), "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getTag(), "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getTag(), "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getTag(), "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(getTag(), "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getTag(), "onDestroy()");
    }
}
