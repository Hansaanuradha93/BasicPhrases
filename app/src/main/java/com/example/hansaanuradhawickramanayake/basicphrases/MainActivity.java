package com.example.hansaanuradhawickramanayake.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    Button buttonPhrase;

    public void translateToFrench(View view) {

        buttonPhrase = (Button) view;

        Log.i("tapped counter" , buttonPhrase.getTag().toString());

        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPhrase.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();

        buttonPhrase.animate().rotation(360).setDuration(300);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
