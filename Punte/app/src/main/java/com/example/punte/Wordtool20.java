package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordtool20 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordtool20);
        word2= MediaPlayer.create(Wordtool20.this,R.raw.wordtool20);
    }
    public void Playargor(View v){
        word2.start();
    }
}