package com.sano.k.forzaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class Activityguide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityguide);

        initAdmobad();
    }

    private void initAdmobad() {
        //banner
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        //  my admob  adView.setAdUnitId("ca-app-pub-6165143774808397/6236843665");
        adView.setAdUnitId("ca-app-pub-1601739538962474/6354123070");
// TODO: Add adView to your view hierarchy.
        AdView  mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
