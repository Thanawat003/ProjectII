package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseAnswer extends AppCompatActivity implements View.OnClickListener {

    ImageView img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_answer);

        img_1=(ImageView)findViewById(R.id.image_1);
        img_1.setTag(R.drawable.wordfest1);
        img_1.setOnClickListener(this);

        img_2=(ImageView)findViewById(R.id.image_2);
        img_2.setTag(R.drawable.wordfest4);
        img_2.setOnClickListener(this);

        img_3=(ImageView)findViewById(R.id.image_3);
        img_3.setTag(R.drawable.wordfest22);
        img_3.setOnClickListener(this);

        img_4=(ImageView)findViewById(R.id.image_4);
        img_4.setTag(R.drawable.wordfood21);
        img_4.setOnClickListener(this);

        img_5=(ImageView)findViewById(R.id.image_5);
        img_5.setTag(R.drawable.wordfood25);
        img_5.setOnClickListener(this);

        img_6=(ImageView)findViewById(R.id.image_6);
        img_6.setTag(R.drawable.wordfood10);
        img_6.setOnClickListener(this);

        img_7=(ImageView)findViewById(R.id.image_7);
        img_7.setTag(R.drawable.wordtool4);
        img_7.setOnClickListener(this);

        img_8=(ImageView)findViewById(R.id.image_8);
        img_8.setTag(R.drawable.wordtool9);
        img_8.setOnClickListener(this);

        img_9=(ImageView)findViewById(R.id.image_9);
        img_9.setTag(R.drawable.wordtool33);
        img_9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        ImageView img = (ImageView)v;

        int img_resource_id = Integer.parseInt(img.getTag().toString());
        intent.putExtra("Answer",img_resource_id);
        setResult(1999,intent);
        finish();
    }
}