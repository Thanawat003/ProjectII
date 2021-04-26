package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Quizmain extends AppCompatActivity {
    Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmain);
        Button startbutton=(Button)findViewById(R.id.button);
        quit = (Button) findViewById(R.id.btt01);
        final EditText nametext=(EditText)findViewById(R.id.editName);


        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Quiz1.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Gamemain.class);
                startActivity(in);
            }
        });

    }
}
