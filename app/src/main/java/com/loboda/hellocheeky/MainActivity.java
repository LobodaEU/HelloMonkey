package com.loboda.hellocheeky;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button3;
    Button button4;
    Button button5;
    ImageView imageView;
    public String filename = "";
    public String imageName = "hello_cheeky_pc";

    public MediaPlayer mPlayer;
    AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        imageView = (ImageView) findViewById(R.id.imageView);


//        InputStream imageStream = this.getResources().openRawResource(R.raw.hello_cheeky_pc);
//        Bitmap bitmap = BitmapFactory.decodeStream(imageStream);
//        imageView.setImageBitmap(bitmap);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.raw.hello_cheeky_pc));

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onClick(@NonNull View View) {

//
                switch (View.getId()) {
                    case R.id.button:

                        filename = "hello_mz";
                        Song();
//                        if(mPlayer.isPlaying()){
//                            mPlayer.stop();
//                        }
                        mPlayer.start();
                        imageView.setImageResource(R.raw.hello_pc);
                        
                        break;
                    case R.id.button3:

                        filename = "monkey_mz";
                        Song();
//                        if(mPlayer.isPlaying()){
//                            mPlayer.stop();
//                        }
                        mPlayer.start();
                        imageView.setImageResource(R.raw.monkey_pc);
                        break;
                    case R.id.button4:

                        filename = "love_mz";
                        Song();
//                        if(mPlayer.isPlaying()){
//                            mPlayer.stop();
//                        }
                        mPlayer.start();
                        imageView.setImageResource(R.raw.love_pc);
                        break;
                    case R.id.button5:

                        filename = "kiss_mz";
                        Song();
//                        if(mPlayer.isPlaying()){
//                            mPlayer.stop();
//                        }
                        mPlayer.start();
                        imageView.setImageResource(R.raw.kiss_pc);
                        break;
                    case R.id.button6:

                        filename = "full";
                        Song();
//                        if(mPlayer.isPlaying()){
//                            try {
//                                mPlayer.prepare();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            mPlayer.stop();
//                        }
                        mPlayer.start();
                        imageView.setImageResource(R.raw.hello_cheeky_pc);
                        break;
                }

            }


        };
        button.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);

    }
    public  void Song( ) {
        int sound_id = getResources().getIdentifier(filename, "raw",
                getPackageName());

         mPlayer= MediaPlayer.create(this, sound_id);
    };
}