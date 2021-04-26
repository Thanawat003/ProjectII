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

public class Verbword extends AppCompatActivity {
    EditText shtext5;
    ListView lv5;
    ArrayList<String> listItems5;
    ArrayAdapter<String> adapter5;
    String namew5[]={
            "กวนอก = คลื่นไส้",
            "ก่อคู้ด = เก็บตัว ไม่คบใคร",
            " กากี่หลาง = คนกันเอง ",
            " การุย = มากมาย ",
            " เก๊กซืม = เครียด กลุ้มใจ ",
            " คิ่ว  = เหนียว ",
            " ควิดตุง = หกคะแมนตีลังกา ",
            " เคี๊ยว = รบเร้า กวนใจ ",
            " แค้บ = รีบร้อน เร็วๆ ",
            " จั๊ว = ขี้โม้ พูดมาก ",
            " ฉ้าย = บอกใบ้ ",
            " ฉาว = เสียงดัง ",
            " ฉิ้ม = เป็นหนี้ ติดลบ ",
            " โซะตัว = ผอมลง ซูบลง ",
            " ต้าห่าน = ห้าม ",
            " โต่หลอง = ขอความกรุณา ",
            " โบ่เปื่อน = ไม่ได้เรื่อง ใช้ไม่ได้การ ",
            " โบ๋ = ไม่มี ไม่ใช่ ",
            " โป๋ย = ชดใช้ค่าเสียหาย ",
            " ผง = เสีย ชำรุด "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbword);
        lv5 = (ListView)findViewById(R.id.list5);
        shtext5 = (EditText)findViewById(R.id.searchtext);
        initList1();
        shtext5.addTextChangedListener(new TextWatcher() {
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
        for (String namews:namew5){
            if(!namews.contains(textToSearch)){
                listItems5.remove(namews);
            }
        }
        adapter5.notifyDataSetChanged();
    }
    public void initList1(){
        listItems5 = new ArrayList<>(Arrays.asList(namew5));
        adapter5 = new ArrayAdapter<String>(this,R.layout.listouts,R.id.outs,listItems5);
        lv5.setAdapter(adapter5);
        lv5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Verbword.this,"List"+position,Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent w1=new Intent(Verbword.this,Wordverb1.class);
                    startActivity(w1);
                }
                if(position==1){
                    Intent w1=new Intent(Verbword.this,Wordverb2.class);
                    startActivity(w1);
                }
                if(position==2){
                    Intent w1=new Intent(Verbword.this,Wordverb3.class);
                    startActivity(w1);
                }
                if(position==3){
                    Intent w1=new Intent(Verbword.this,Wordverb4.class);
                    startActivity(w1);
                }
                if(position==4){
                    Intent w1=new Intent(Verbword.this,Wordverb5.class);
                    startActivity(w1);
                }
                if(position==5){
                    Intent w1=new Intent(Verbword.this,Wordverb6.class);
                    startActivity(w1);
                }
                if(position==6){
                    Intent w1=new Intent(Verbword.this,Wordverb7.class);
                    startActivity(w1);
                }
                if(position==7){
                    Intent w1=new Intent(Verbword.this,Wordverb8.class);
                    startActivity(w1);
                }
                if(position==8){
                    Intent w1=new Intent(Verbword.this,Wordverb9.class);
                    startActivity(w1);
                }
                if(position==9){
                    Intent w1=new Intent(Verbword.this,Wordverb10.class);
                    startActivity(w1);
                }
                if(position==10){
                    Intent w1=new Intent(Verbword.this,Wordverb11.class);
                    startActivity(w1);
                }
                if(position==11){
                    Intent w1=new Intent(Verbword.this,Wordverb12.class);
                    startActivity(w1);
                }
                if(position==12){
                    Intent w1=new Intent(Verbword.this,Wordverb13.class);
                    startActivity(w1);
                }
                if(position==13){
                    Intent w1=new Intent(Verbword.this,Wordverb14.class);
                    startActivity(w1);
                }
                if(position==14){
                    Intent w1=new Intent(Verbword.this,Wordverb15.class);
                    startActivity(w1);
                }
                if(position==15){
                    Intent w1=new Intent(Verbword.this,Wordverb16.class);
                    startActivity(w1);
                }
                if(position==16){
                    Intent w1=new Intent(Verbword.this,Wordverb17.class);
                    startActivity(w1);
                }
                if(position==17){
                    Intent w1=new Intent(Verbword.this,Wordverb18.class);
                    startActivity(w1);
                }
                if(position==18){
                    Intent w1=new Intent(Verbword.this,Wordverb19.class);
                    startActivity(w1);
                }
                if(position==19){
                    Intent w1=new Intent(Verbword.this,Wordverb20.class);
                    startActivity(w1);
                }

            }
        });
    }
}