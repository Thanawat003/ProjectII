package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Word9 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word9);
        word2= MediaPlayer.create(Word9.this,R.raw.word9);
    }
    public void Playargor(View v){
        word2.start();
    }
}
