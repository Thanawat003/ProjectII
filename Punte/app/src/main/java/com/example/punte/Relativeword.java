package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Relativeword extends AppCompatActivity {
    EditText shtext1;
    ListView lv1;
    ArrayList<String> listItems1;
    ArrayAdapter<String> adapter1;
String namew[]={
        "อาก๊อ  น้องสาวของพ่อ",
        "อาจ้อ  ทวด",
        "หล่ายก้อง  ปู่",
        "หวั่นก้อง  ตา",
        "อากิ่ม  ป้าสะใภ้, น้าสะใภ้",
        "อากู่  น้องชายของแม่",
        "เกี๊ยซู้น  ลูกหลาน",
        "อาโก๊  พี่ชาย",
        "เข็วเกี้ย  ลูกเลี้ยง",
        "จ่าบ๊อเกี้ย  ลูกสาว",
        "จ่าป้อเกี้ย  ลูกชาย",
        "อาจิ้ม  อาสะใภ้",
        "อาเจก อา น้องชายของพ่อ",
        "เจ้กก้อง น้องชายของปู่",
        "ซิมปู่  ลูกสะใภ้",
        "ตัวกิ่ม  ป้าสะใภ้คนโตฝ่ายแม่",
        "ตัวกู่  ลุงคนโตฝ่ายแม่",
        "อาจี้ พี่สาว",
        "ตัวอี๋ พี่สาวของแม่",
        "ตัวอึ้ม  ป้าสะใภ้ฝ่ายพ่อ",
        "ติ่วหลาง  พ่อตา",
        "ติ่วอิ้ม  แม่ยาย",
        "อาเตี่ยว  น้าเขย หรือ ลุงเขย",
        "อาบ้อ  ภรรยา",
        "อาโส้ พี่สะใภ้",
        "อาม่า  ย่าหรือยาย",
        "อาอ้าง  สามี",
        "อาอึ้ม  ป้าสะใภ้",
        "อาป๊า  พ่อ",
        "อาม๊ะ แม่",
        "ก๊อโป๋  ป้าหรืออาผู้หญิงของพ่อ",
        "อี๋โป๋  ป้าหรือน้าสาวของแม่",
        "อึ้มโป๋  ป้าสะใภ้ของพ่อ",
        "จิ้มโป๋  อาสะใภ้ของพ่อ",
        "กิ่มโป๋  ป้าหรือน้าสะใภ้ของแม่",
        "กู้ก้อง  ลุงหรือน้าผู้ชายของแม่",
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativeword);
        lv1 = (ListView)findViewById(R.id.list1);
        shtext1 = (EditText)findViewById(R.id.searchtext);
        initList1();
        shtext1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")){
                    //reset listview
                    initList1();
                }
                else {
                    //perform search
                    searchItem1(s.toString());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // perform search

            }
        });
    }
    public void searchItem1(String textToSearch){
        for (String namews:namew){
            if(!namews.contains(textToSearch)){
                listItems1.remove(namews);
            }
        }
        adapter1.notifyDataSetChanged();
    }
    public void initList1(){
        listItems1 = new ArrayList<>(Arrays.asList(namew));
        adapter1 = new ArrayAdapter<String>(this,R.layout.listouts,R.id.outs,listItems1);
        lv1.setAdapter(adapter1);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Relativeword.this,"List"+position,Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent w1=new Intent(Relativeword.this,Word1.class);
                    startActivity(w1);
                }
                if(position==1){
                    Intent w2=new Intent(Relativeword.this,Word2.class);
                    startActivity(w2);
                }
                if(position==2){
                    Intent w3=new Intent(Relativeword.this,Word3.class);
                    startActivity(w3);
                }
                if(position==3){
                    Intent w4=new Intent(Relativeword.this,Word4.class);
                    startActivity(w4);
                }
                if(position==4){
                    Intent w5=new Intent(Relativeword.this,Word5.class);
                    startActivity(w5);
                }
                if(position==5){
                    Intent w6=new Intent(Relativeword.this,Word6.class);
                    startActivity(w6);
                }
                if(position==6){
                    Intent w7=new Intent(Relativeword.this,Word7.class);
                    startActivity(w7);
                }
                if(position==7){
                    Intent w8=new Intent(Relativeword.this,Word8.class);
                    startActivity(w8);
                }
                if(position==8){
                    Intent w9=new Intent(Relativeword.this,Word9.class);
                    startActivity(w9);
                }
                if(position==9){
                    Intent w10=new Intent(Relativeword.this,Word10.class);
                    startActivity(w10);
                }
                if(position==10){
                    Intent w11=new Intent(Relativeword.this,Word11.class);
                    startActivity(w11);
                }
                if(position==11){
                    Intent w12=new Intent(Relativeword.this,Word12.class);
                    startActivity(w12);
                }
                if(position==12){
                    Intent w13=new Intent(Relativeword.this,Word13.class);
                    startActivity(w13);
                }
                if(position==13){
                    Intent w14=new Intent(Relativeword.this,Word14.class);
                    startActivity(w14);
                }
                if(position==14){
                    Intent w15=new Intent(Relativeword.this,Word15.class);
                    startActivity(w15);
                }
                if(position==15){
                    Intent w16=new Intent(Relativeword.this,Word16.class);
                    startActivity(w16);
                }
                if(position==16){
                    Intent w17=new Intent(Relativeword.this,Word18.class);
                    startActivity(w17);
                }
                if(position==17){
                    Intent w18=new Intent(Relativeword.this,Word19.class);
                    startActivity(w18);
                }
                if(position==18){
                    Intent w19=new Intent(Relativeword.this,Word20.class);
                    startActivity(w19);
                }
                if(position==19){
                    Intent w20=new Intent(Relativeword.this,Word21.class);
                    startActivity(w20);
                }
                if(position==20){
                    Intent w21=new Intent(Relativeword.this,Word22.class);
                    startActivity(w21);
                }
                if(position==21){
                    Intent w22=new Intent(Relativeword.this,Word24.class);
                    startActivity(w22);
                }
                if(position==22){
                    Intent w23=new Intent(Relativeword.this,Word25.class);
                    startActivity(w23);
                }
                if(position==23){
                    Intent w24=new Intent(Relativeword.this,Word27.class);
                    startActivity(w24);
                }
                if(position==24){
                    Intent w24=new Intent(Relativeword.this,Word28.class);
                    startActivity(w24);
                }
                if(position==25){
                    Intent w26=new Intent(Relativeword.this,Word29.class);
                    startActivity(w26);
                }
                if(position==26){
                    Intent w27=new Intent(Relativeword.this,Word30.class);
                    startActivity(w27);
                }
                if(position==27){
                    Intent w28=new Intent(Relativeword.this,Word31.class);
                    startActivity(w28);
                }
                if(position==28){
                    Intent w29=new Intent(Relativeword.this,Word32.class);
                    startActivity(w29);
                }
                if(position==29){
                    Intent w30=new Intent(Relativeword.this,Word33.class);
                    startActivity(w30);
                }
                if(position==30){
                    Intent w31=new Intent(Relativeword.this,Word34.class);
                    startActivity(w31);
                }
                if(position==31){
                    Intent w32=new Intent(Relativeword.this,Word35.class);
                    startActivity(w32);
                }
                if(position==32){
                    Intent w33=new Intent(Relativeword.this,Word36.class);
                    startActivity(w33);
                }
                if(position==33){
                    Intent w34=new Intent(Relativeword.this,Word37.class);
                    startActivity(w34);
                }
                if(position==34){
                    Intent w35=new Intent(Relativeword.this,Word37.class);
                    startActivity(w35);
                }
                if(position==35){
                    Intent w36=new Intent(Relativeword.this,Word38.class);
                    startActivity(w36);
                }
                if(position==36){
                    Intent w37=new Intent(Relativeword.this,Word38.class);
                    startActivity(w37);
                }
                if(position==37){
                    Intent w38=new Intent(Relativeword.this,Word38.class);
                    startActivity(w38);
                }
            }
        });
    }
    }

