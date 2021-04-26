package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Wordfest1 extends AppCompatActivity {
    MediaPlayer wordfest1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfest1);
        wordfest1= MediaPlayer.create(Wordfest1.this,R.raw.wordfest1);
    }
    public void Playargor(View v){
        wordfest1.start();
    }
}