package com.sano.k.forzaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;







    private ImageView imageseries,imageintro,imageguide,imagetopten,imageone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       imageseries =(ImageView) findViewById(R.id.imageseries);
        imageintro=(ImageView) findViewById(R.id.imageintro);
        imageguide=(ImageView) findViewById(R.id.imageguide);
        imagetopten=(ImageView) findViewById(R.id.imagetopten);
        imageone=(ImageView) findViewById(R.id.imageone);

        initAdmobad();








        // first btn introduction

        imageintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityintro();
            }

            private void moveToActivityintro() {

                Intent intent = new Intent(MainActivity.this, Activityintro.class);
                startActivity(intent);





            }
        });





        imageseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityseries();
            }
        });

        //3 topten

        imagetopten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitytopten();
            }

            private void moveToActivitytopten() {

                Intent intent = new Intent(MainActivity.this, Activitytopten.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }




            }
        });

        //4guide

        imageguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityguide();
            }

            private void moveToActivityguide() {
                Intent intent = new Intent(MainActivity.this, Activityguide.class);
                startActivity(intent);
            }
        });

        //last one or best
        imageone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityone();
            }

            private void moveToActivityone() {

                Intent intent = new Intent(MainActivity.this, Activityone.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }

            }
        });






    }

    private void initAdmobad() {
        mInterstitialAd = new InterstitialAd(this);
       // my admob adunits mInterstitialAd.setAdUnitId("ca-app-pub-6165143774808397/3491454348");

        mInterstitialAd.setAdUnitId("ca-app-pub-1601739538962474/8597143038");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        //banner
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1601739538962474/6354123070");
// TODO: Add adView to your view hierarchy.
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    // next activity
    private void moveToActivityseries(){
        Intent intent = new Intent(MainActivity.this, Activityseries.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }


    }














}
