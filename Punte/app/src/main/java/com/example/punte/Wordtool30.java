package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordtool30 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordtool30);
        word2= MediaPlayer.create(Wordtool30.this,R.raw.wordtool30);
    }
    public void Playargor(View v){
        word2.start();
    }
}