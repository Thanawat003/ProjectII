package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;

public class Game3 extends AppCompatActivity {
    Button quit;
    ImageView img_question, img_answer;
    Button btn_answer;

     int array_images[] = new int[] {
            R.drawable.wordfest1,
            R.drawable.wordfest4,
            R.drawable.wordfest22,
            R.drawable.wordfood21,
            R.drawable.wordfood25,
            R.drawable.wordfood10,
            R.drawable.wordtool4,
            R.drawable.wordtool9,
            R.drawable.wordtool33,

    };
    int correct_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        quit = (Button) findViewById(R.id.btt01);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Gamemain.class);
                startActivity(in);
            }
        });

        img_question=(ImageView)findViewById(R.id.img_question);
        btn_answer = (Button)findViewById(R.id.btn_answer);
        btn_answer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game3.this,ChooseAnswer.class);
                startActivityForResult(intent,1999);
            }
        });

        ramdomImage();
    }

    @Override
    protected  void  onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode==1999){
            int answer_resource_id = data.getIntExtra("Answer",0);
            img_answer =(ImageView)findViewById(R.id.img_answer);
            img_answer.setImageResource(answer_resource_id);

            if(answer_resource_id == correct_answer)
            {
                Toast.makeText(this, "Good Job Correct!!++", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"You Wrong!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case R.id.menu_re_new:
                ramdomImage();
                img_answer=(ImageView)findViewById(R.id.img_answer);
                img_answer.setImageResource(R.drawable.question);
                break;
        }
        return true;
    }
    private void ramdomImage() {
        int img_resource = array_images[new Random().nextInt(9)];
        img_question.setImageResource(img_resource);
        correct_answer = img_resource;
    }
}