package com.martin.partysoundboard.vandroid;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    public static Activity Context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);


        ImageButton horn1 = (ImageButton) findViewById(R.id.horn1);

        horn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.horn_long);
                mp.start();
            }
        });

        ImageButton rickRoss = (ImageButton) findViewById(R.id.rickross);

        rickRoss.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.rickross);
                mp2.start();
            }
        });

        ImageButton djIntro = (ImageButton) findViewById(R.id.djintro);

        djIntro.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp3 = MediaPlayer.create(getApplicationContext(), R.raw.djintro);
                mp3.start();
            }
        });

        ImageButton horn2 = (ImageButton) findViewById(R.id.horn2);

        horn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp4 = MediaPlayer.create(getApplicationContext(), R.raw.horn_short);
                mp4.start();
            }
        });

        ImageButton countDown = (ImageButton) findViewById(R.id.countdown);

        countDown.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp5 = MediaPlayer.create(getApplicationContext(), R.raw.count_normal);
                mp5.start();
            }
        });

        ImageButton scratch = (ImageButton) findViewById(R.id.scratch);

        scratch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp6 = MediaPlayer.create(getApplicationContext(), R.raw.scratch);
                mp6.start();
            }
        });

        ImageButton getWeird = (ImageButton) findViewById(R.id.get_crunk);

        getWeird.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp7 = MediaPlayer.create(getApplicationContext(), R.raw.get_started);
                mp7.start();
            }
        });

        ImageButton what = (ImageButton) findViewById(R.id.what);

        what.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp8 = MediaPlayer.create(getApplicationContext(), R.raw.what);
                mp8.start();
            }
        });

        ImageButton okay = (ImageButton) findViewById(R.id.okay);

        okay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp9 = MediaPlayer.create(getApplicationContext(), R.raw.okay);
                mp9.start();
            }
        });

        ImageButton yeah = (ImageButton) findViewById(R.id.yeah);

        yeah.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp10 = MediaPlayer.create(getApplicationContext(), R.raw.yeah);
                mp10.start();
            }
        });

        ImageButton yup = (ImageButton) findViewById(R.id.yup);

        yup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp11 = MediaPlayer.create(getApplicationContext(), R.raw.yupsound);
                mp11.start();
            }
        });

        ImageButton nope = (ImageButton) findViewById(R.id.nope);

        nope.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                MediaPlayer mp12 = MediaPlayer.create(getApplicationContext(), R.raw.nopesound);
                mp12.start();
            }
        });

    }
}