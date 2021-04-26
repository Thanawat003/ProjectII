package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Wordmain extends AppCompatActivity {
    ImageButton wm1, wm2, wm3, wm4, wm5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordmain);
        wm1 = (ImageButton) findViewById(R.id.wmod1);
        wm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wmod1 = new Intent(Wordmain.this, Relativeword.class);
                startActivity(wmod1);
            }
        });
        wm2 = (ImageButton) findViewById(R.id.wmod2);
        wm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wmod2 = new Intent(Wordmain.this, Toolword.class);
                startActivity(wmod2);
            }
        });

        wm3 = (ImageButton) findViewById(R.id.wmod3);
        wm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wmod3 = new Intent(Wordmain.this, Festivalword.class);
                startActivity(wmod3);
            }
        });
        wm4 = (ImageButton) findViewById(R.id.wmod4);
        wm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wmod4 = new Intent(Wordmain.this, Foodword.class);
                startActivity(wmod4);
            }
        });
        wm5 = (ImageButton) findViewById(R.id.wmod5);
        wm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wmod5 = new Intent(Wordmain.this, Verbword.class);
                startActivity(wmod5);
            }
        });
    }}