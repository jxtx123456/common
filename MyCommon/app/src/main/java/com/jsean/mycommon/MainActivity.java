package com.jsean.mycommon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jsean.lib_common.utils.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.d("ddd");
    }
}