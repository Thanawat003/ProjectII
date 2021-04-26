package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordtool6 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordtool6);
        word2= MediaPlayer.create(Wordtool6.this,R.raw.wordtool6);
    }
    public void Playargor(View v){
        word2.start();
    }
}