package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordverb11 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordverb11);
        word2= MediaPlayer.create(Wordverb11.this,R.raw.wordverb11);
    }
    public void Playargor(View v){
        word2.start();
    }
}