package com.jaylerrs.squad.utility.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.jaylerrs.squad.splash.SplashActivity;


/**
 * Created by jaylerr on 07-Jun-17.
 */

public class ApplicationManager {
    private Activity activity;
    private Context context;

    public ApplicationManager(Context context) {
        this.context = context;
        this.activity = (Activity) context;

    }

    public void restartApplication(){
        Intent intent = new Intent(activity, SplashActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
