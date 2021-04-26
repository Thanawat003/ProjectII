package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GameStart extends AppCompatActivity {
    ImageButton quiz01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        quiz01 = (ImageButton) findViewById(R.id.imageButton2);
        quiz01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent game1 = new Intent(GameStart.this,Game.class);
                startActivity(game1);
            }
        });
    }
}