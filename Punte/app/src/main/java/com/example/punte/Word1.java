package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Word1 extends AppCompatActivity {
    MediaPlayer argor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word1);
        argor= MediaPlayer.create(Word1.this,R.raw.argor);
    }
    public void Playargor(View v){
        argor.start();
    }
}
