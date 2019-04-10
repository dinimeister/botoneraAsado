package com.example.botoneraasado;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sonido0;
    MediaPlayer sonido1;
    MediaPlayer sonido2;
    MediaPlayer sonido3;


    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonido0 =MediaPlayer.create(this,R.raw.sonido0);
        sonido1 =MediaPlayer.create(this,R.raw.sonido1);
        sonido2 =MediaPlayer.create(this,R.raw.sonido2);
        sonido3 =MediaPlayer.create(this,R.raw.sonido3);


        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido0.start();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido1.start();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido2.start();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if (!sonido1.isPlaying()){
                 sonido3.start();

             }
else{
    sonido0.pause();
             }


            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido2.start();

            }
        });
    }
}
