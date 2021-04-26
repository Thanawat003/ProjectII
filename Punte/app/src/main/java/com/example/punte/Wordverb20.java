package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordverb20 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordverb20);
        word2= MediaPlayer.create(Wordverb20.this,R.raw.wordverb20);
    }
    public void Playargor(View v){
        word2.start();
    }
}