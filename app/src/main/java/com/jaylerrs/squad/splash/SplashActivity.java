package com.jaylerrs.squad.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jaylerrs.squad.R;

import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

    }
}