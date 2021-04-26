package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "คำถาม จงบอกความหมายของภาษาถิ่นคำว่า ตั่วโก้?",
            "คำถาม จงบอกความหมายของภาษาถิ่นคำว่า เต้ง?",
            "ข้อใดคือพิธีลุยไฟ ในเทศกาลกินเจภูเก็ต?",
            "ข้อใดเป็นขนมพื้นเมืองภูเก็ต?",
            "ข้อใดมีความหมายตรงกับคำว่า มากมาย?",
            "ข้อใดมีความหมายตรงกับคำว่า ไม่มี ไม่ใช่?",
            "ข้อใดต่อไปนี้คือขนมใช้ไหว้เจ้า?",
            "กระดาษทองเผาถวายเทพเจ้าในเทศกาลกินเจคือข้อใด?",
            "ข้อใดต่อไปนี้ม่ใช่ของมีคม?",
            "ป้าสะใภ้คนโตฝ่ายแม่คือข้อใด?"
    };
    String answers[] = {"พี่ชาย","ตะเกียง","โก้ยโห้ย","โกซุ้ย","การุย","โบ๋","เต่เหลี่ยว","กิ้ม","ทิถุย","ตั่วกิ้ม"};
    String opt[] = {
            "พี่ชาย","น้องชาย","พี่สาว","น้องสาว",
            "หลอดไฟ","ตะกร้า","กระเป๋า","ตะเกียง",
            "โข้กุ้น","โก้ยโห้ย","โก้ยห่าน","เจี๊ยะฉ่าย",
            "จับฉ่าย","โกซุ้ย","ต่าวกั้ว","อ๋วน",
            "กวนอก","โบ๋","กากี่หลาง","การุย",
            "กวนอก","โบ๋","กากี่หลาง","การุย",
            "เต่เหลี่ยว","เซวโบ๋ย","โก่ต้าว","เกี่ยวโบ๋ย",
            "กิ้ม","กิ้มเต้ง","กิ้มสิ้น","กิ้มก้อ",
            "กาโต้","ตู่ถาว","ทิถุย","ทิถ่าวโต้",
            "อาเจก","อาก๊อ","ตั่วอี๋","ตั่วกิ้ม"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    public static String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
        name= intent.getStringExtra("myname");

        if (name.trim().equals("")){
            textView.setText("Hello User");
            name = "User";
        }
        else
            textView.setText("Hello " + name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),Answer.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Answer.class);
                startActivity(intent);
            }
        });
    }

    
}
