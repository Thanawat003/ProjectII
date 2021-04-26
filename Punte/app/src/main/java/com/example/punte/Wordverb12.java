package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordverb12 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordverb12);
        word2= MediaPlayer.create(Wordverb12.this,R.raw.wordverb12);
    }
    public void Playargor(View v){
        word2.start();
    }
}