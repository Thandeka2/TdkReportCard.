package com.example.andriod.tdkreportcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

    public void run() {
        // This method will be executed once the timer is over
        // Start your app main activity
        Intent i = new Intent(SplashActivity.this, StudentMainActivity.class);
        startActivity(i);

        // close this activity
        finish();
    }
        }, SPLASH_TIME_OUT);

    }
}
