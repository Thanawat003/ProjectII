package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class knowmain extends AppCompatActivity {
    ImageButton ibb2, ibb3, ibb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowmain);
        ibb2 = (ImageButton) findViewById(R.id.ib2);
        ibb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib2 = new Intent(knowmain.this, tradition.class);
                startActivity(ib2);
            }
        });
        ibb3 = (ImageButton) findViewById(R.id.ib3);
        ibb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib3 = new Intent(knowmain.this, Place.class);
                startActivity(ib3);
            }
        });


        }}


