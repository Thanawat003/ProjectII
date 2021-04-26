package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordfood1 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfood1);
        word2= MediaPlayer.create(Wordfood1.this,R.raw.wordfood1);
    }
    public void Playargor(View v){
        word2.start();
    }
}