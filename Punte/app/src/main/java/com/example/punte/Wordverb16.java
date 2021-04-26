package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordverb16 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordverb16);
        word2= MediaPlayer.create(Wordverb16.this,R.raw.wordverb16);
    }
    public void Playargor(View v){
        word2.start();
    }
}