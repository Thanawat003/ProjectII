package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Gamemain extends AppCompatActivity {
    ImageButton quiz01,quiz02;
    Button hom1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamemain);
        quiz01 = (ImageButton) findViewById(R.id.game1);
        quiz01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent game1 = new Intent(Gamemain.this,Quizmain.class);
                startActivity(game1);
            }
        });
        quiz02 = (ImageButton) findViewById(R.id.game2);
        quiz02.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent game1 = new Intent(Gamemain.this,GameStart.class);
                startActivity(game1);
            }
        });


        hom1 = (Button)findViewById(R.id.hhome);
        hom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Homeactivity.class);
                startActivity(in);
            }
        });

    }
}
