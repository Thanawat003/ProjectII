package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homeactivity extends AppCompatActivity {
ImageButton mode1;
ImageButton mode2;
ImageButton mode3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        mode1 = (ImageButton) findViewById(R.id.mod1);
        mode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mod1 = new Intent(Homeactivity.this,Wordmain.class);
                startActivity(mod1);
            }
        });
        mode2 = (ImageButton) findViewById(R.id.mod2);
        mode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mod2 = new Intent(Homeactivity.this,Gamemain.class);
                startActivity(mod2);
            }
        });
        mode3 = (ImageButton) findViewById(R.id.mod3);
        mode3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mod3 = new Intent(Homeactivity.this,knowmain.class);
                startActivity(mod3);
            }
        });
    }
}
