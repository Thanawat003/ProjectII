package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordfest37 extends AppCompatActivity {
    MediaPlayer word2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfest37);
        word2= MediaPlayer.create(Wordfest37.this,R.raw.wordfest37);
    }
    public void Playargor(View v){
        word2.start();
    }
}