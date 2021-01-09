package com.lockscreenamongus;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;
import com.flurry.android.FlurryAgent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AudienceNetworkAds.initialize(this);

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "PCT54XJ3ZCNFYD4C95TH");

    }
}
