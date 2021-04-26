package com.example.punte;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game2 extends AppCompatActivity {
    Button button;
    TextView text;

    Button howto;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        button = (Button) findViewById(R.id.start);
        text = (TextView) findViewById(R.id.gamename);



        /* button to start the game*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game2.this,Level_one.class);
                startActivity(intent);
            }
        });

       /* howto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Game_help.class);
                startActivity(intent);
                finish();
            }
        });*/


    }

    /* wil finish the activity if pressed back button*/
    @Override
    public void onBackPressed() {
        finish();
    }
}

