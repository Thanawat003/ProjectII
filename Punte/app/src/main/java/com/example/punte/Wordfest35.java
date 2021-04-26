package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordfest35 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfest35);
        word2= MediaPlayer.create(Wordfest35.this,R.raw.wordfest35);
    }
    public void Playargor(View v){
        word2.start();
    }
}