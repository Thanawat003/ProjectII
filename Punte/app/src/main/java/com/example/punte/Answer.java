package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class Answer extends AppCompatActivity {
    TextView tv, tv2, tv3, tv4;
    Button btnRestart,btquit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        tv4 = (TextView)findViewById(R.id.nama);
        btnRestart = (Button) findViewById(R.id.btnRestart);
        btquit = (Button) findViewById(R.id.quit);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + Quiz1.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + Quiz1.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + Quiz1.correct + "\n");
        StringBuffer sb4 = new StringBuffer();
        sb4.append( Quiz1.name );
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        tv4.setText(sb4);
        Quiz1.correct=0;
        Quiz1.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Quiz1.class);
                startActivity(in);
            }
        });
        btquit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Gamemain.class);
                startActivity(in);
            }
        });
    }

}
