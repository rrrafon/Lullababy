package com.quinzel.lullababy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;


public class MainActivity extends AppCompatActivity  {


    private Button bsound1 = null; //lullaby
    private Button bsound2 = null; //rain
    private Button bsound3 = null; //storm
    private Button bsound4 = null; //night
    private Button bsound5 = null; //seaside
    private Button bsound6 = null; //water
    private Button bsound7 = null; //city
    private Button bsound8 = null; //shhh
    private Button credits = null;
    private Button timerB = null;
    private TextView timerText = null;

    private CountDownTimer countDownTimer;
    private long timeCountInMilliSeconds = 600000;//10 minutes
    private boolean timerOn;

    private boolean btn_pressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mpsound1 = MediaPlayer.create(this, R.raw.brahms);
        final MediaPlayer mpsound2 = MediaPlayer.create(this, R.raw.rain);
        final MediaPlayer mpsound3 = MediaPlayer.create(this, R.raw.storm);
        final MediaPlayer mpsound4 = MediaPlayer.create(this, R.raw.night);
        final MediaPlayer mpsound5 = MediaPlayer.create(this, R.raw.seaside);
        final MediaPlayer mpsound6 = MediaPlayer.create(this, R.raw.water);
        final MediaPlayer mpsound7 = MediaPlayer.create(this, R.raw.city);
        final MediaPlayer mpsound8 = MediaPlayer.create(this, R.raw.shh);

        mpsound1.setLooping(true);
        mpsound2.setLooping(true);
        mpsound3.setLooping(true);
        mpsound4.setLooping(true);
        mpsound5.setLooping(true);
        mpsound6.setLooping(true);
        mpsound7.setLooping(true);
        mpsound8.setLooping(true);

        bsound1 = (Button)findViewById(R.id.button_brahms);
        bsound2 = (Button)findViewById(R.id.button_rain);
        bsound3 = (Button)findViewById(R.id.button_storm);
        bsound4 = (Button)findViewById(R.id.button_night);
        bsound5 = (Button)findViewById(R.id.button_seaside);
        bsound6 = (Button)findViewById(R.id.button_water);
        bsound7 = (Button)findViewById(R.id.button_city);
        bsound8 = (Button)findViewById(R.id.button_shh);
        credits = (Button)findViewById(R.id.button_credits);


        bsound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;
                startCountDownTimer();

                if (mpsound1.isPlaying()) {
                    mpsound1.stop();
                    bsound1.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound1.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound1.start();
                    bsound1.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });


        bsound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound2.isPlaying()) {

                    mpsound2.stop();
                    bsound2.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound2.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound2.start();
                    bsound2.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound3.isPlaying()) {
                    mpsound3.stop();
                    bsound3.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound3.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound3.start();
                    bsound3.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound4.isPlaying()) {
                    mpsound4.stop();
                    bsound4.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound4.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound4.start();
                    bsound4.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound5.isPlaying()) {
                    mpsound5.stop();
                    bsound5.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound5.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound5.start();
                    bsound5.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound6.isPlaying()) {
                    mpsound6.stop();
                    bsound6.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound6.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound6.start();
                    bsound6.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound7.isPlaying()) {
                    mpsound7.stop();
                    bsound7.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound7.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound7.start();
                    bsound7.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });

        bsound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_pressed = true;

                if (mpsound8.isPlaying()) {
                    mpsound8.stop();
                    bsound8.setBackgroundResource(R.drawable.btn_def);

                    try {
                        mpsound8.prepare();//get the mediaplayer reeady for playback
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else{
                    mpsound8.start();
                    bsound8.setBackgroundResource(R.drawable.btn_prs);

                }
            }
        });


        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, credits.class);
                startActivity(i);
            }
        });



    }



    private void startCountDownTimer() {

        countDownTimer = new CountDownTimer(timeCountInMilliSeconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeCountInMilliSeconds = millisUntilFinished;
                updateTimerButton();
            }

            @Override
            public void onFinish() {
                stopCountDownTimer();

            }
        }.start();
        timerOn = true;
    }



    private void stopCountDownTimer() {
        countDownTimer.cancel();
        timerOn = false;
    }

    private void updateTimerButton() {

        timerText  = (TextView)findViewById(R.id.timer_text);

        int min = (int) timeCountInMilliSeconds / 60000;
        int sec = (int) timeCountInMilliSeconds % 60000 / 1000;


        String timeLeft = "";

        timeLeft = "[ "+min;
        timeLeft += "] : [";

        if (sec < 10) {
            timeLeft += "0" + sec;
        }

        timeLeft +=  sec + " ]";
        timerText.setText(timeLeft);


    }



}
