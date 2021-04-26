package com.example.punte;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

import org.jetbrains.annotations.Nullable;


public class DisplayResult extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finallayout);

        TextView your_name = (TextView) findViewById(R.id.lastd);
        TextView your_score = (TextView) findViewById(R.id.score);



        Intent mint = getIntent();

        String value =  mint.getStringExtra("total");
        String s = mint.getStringExtra("user_name");


        your_name.setText(s);
        your_score.setText("Your Total Score is " + value);
        //Log.d("last",s);

    }
}
