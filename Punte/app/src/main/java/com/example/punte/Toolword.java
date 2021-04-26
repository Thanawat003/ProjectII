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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Toolword extends AppCompatActivity {
    EditText shtext2;
    ListView lv2;
    ArrayList<String> listItems2;
    ArrayAdapter<String> adapter2;
    String namew[]={
            "โซสี = กุญแจ",
            "ซึ่งตู๋ = ตู้เย็น",
            "กาโต้ = กรรไกร",
            "เจี่ยนสี = ตะหลิว",
            "เอี่ยนปิด = ดินสอ",
            "ปิด = ปากกา",
            "หม่อปิด = พู่กัน",
            "อี้ = เก้าอี้",
            "เตี่ยนสี่ =โทรทัศน์",
            "หนา = ตะกร้า",
            "เต้ง  = ตะเกียง",
            "จ่วนป๋าย = ไขควง",
            "เฉี้ยม = ส้อม",
            "ชะ = ตระกร้า",
            "ต่งเซี้ยว = ชะแลง",
            "ตู่ถาว = จอบ",
            "เตี่ยนฉิว = ไฟฉาย",
            "เตี้ยม = เขียง",
            "โผล้ = กระป๋อง",
            "ถัวะ = ลิ้นชัก",
            "ถาง = ถัง",
            "ทิถ่าวโต้ = มีดโกน",
            "ทิถุย = ค้อนเหล็ก",
            "ทิเสี้ยว = หีบเหล็ก",
            "ปั้วะต้าว = ถัง,ภาชนะตักน้ำ",
            "ป๋าน = กาน้ำ",
            "ปุ้นต้าว = ที่โกยขยะ",
            "ตวัก = จวัก ทัพพี",
            "กุ๋บ = กล่องกระดาษ",
            "โคม = กะละมัง",
            "บั้งขู ปั้งขู = ม้านั่งเตี้ยๆ",
            "เก่หม่อเฉ้ง = ไม้กวาดขนไก่",
            "อูดต้าว = เตารีด",
            "อั้วจ๋าน = ปิ่นโต",
            "หลู้ด = ลิปสติก",
            "หม่อหยอง = ไหมพรม",
            "เล้งถาว = หัวนมยางของเด็ก"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolword);
        lv2 = (ListView)findViewById(R.id.list2);
        shtext2 = (EditText)findViewById(R.id.searchtext);
        initList1();
        shtext2.addTextChangedListener(new TextWatcher() {
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
                listItems2.remove(namews);
            }
        }
        adapter2.notifyDataSetChanged();
    }
    public void initList1() {
        listItems2 = new ArrayList<>(Arrays.asList(namew));
        adapter2 = new ArrayAdapter<String>(this, R.layout.listouts, R.id.outs, listItems2);
        lv2.setAdapter(adapter2);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Toolword.this,"List"+position,Toast.LENGTH_SHORT).show();
        if(position==0){
            Intent w1=new Intent(Toolword.this,Wordtool1.class);
            startActivity(w1);
        }
                if(position==1){
                    Intent w1=new Intent(Toolword.this,Wordtool2.class);
                    startActivity(w1);
                }
                if(position==2){
                    Intent w1=new Intent(Toolword.this,Wordtool3.class);
                    startActivity(w1);
                }
                if(position==3){
                    Intent w1=new Intent(Toolword.this,Wordtool4.class);
                    startActivity(w1);
                }
                if(position==4){
                    Intent w1=new Intent(Toolword.this,Wordtool5.class);
                    startActivity(w1);
                }
                if(position==5){
                    Intent w1=new Intent(Toolword.this,Wordtool6.class);
                    startActivity(w1);
                }
                if(position==6){
                    Intent w1=new Intent(Toolword.this,Wordtool7.class);
                    startActivity(w1);
                }
                if(position==7){
                    Intent w1=new Intent(Toolword.this,Wordtool8.class);
                    startActivity(w1);
                }
                if(position==8){
                    Intent w1=new Intent(Toolword.this,Wordtool9.class);
                    startActivity(w1);
                }
                if(position==9){
                    Intent w1=new Intent(Toolword.this,Wordtool10.class);
                    startActivity(w1);
                }
                if(position==10){
                    Intent w1=new Intent(Toolword.this,Wordtool11.class);
                    startActivity(w1);
                }
                if(position==11){
                    Intent w1=new Intent(Toolword.this,Wordtool12.class);
                    startActivity(w1);
                }
                if(position==12){
                    Intent w1=new Intent(Toolword.this,Wordtool13.class);
                    startActivity(w1);
                }
                if(position==13){
                    Intent w1=new Intent(Toolword.this,Wordtool14.class);
                    startActivity(w1);
                }
                if(position==14){
                    Intent w1=new Intent(Toolword.this,Wordtool15.class);
                    startActivity(w1);
                }
                if(position==15){
                    Intent w1=new Intent(Toolword.this,Wordtool16.class);
                    startActivity(w1);
                }
                if(position==16){
                    Intent w1=new Intent(Toolword.this,Wordtool17.class);
                    startActivity(w1);
                }
                if(position==17){
                    Intent w1=new Intent(Toolword.this,Wordtool18.class);
                    startActivity(w1);
                }
                if(position==18){
                    Intent w1=new Intent(Toolword.this,Wordtool19.class);
                    startActivity(w1);
                }
                if(position==19){
                    Intent w1=new Intent(Toolword.this,Wordtool20.class);
                    startActivity(w1);
                }
                if(position==20){
                    Intent w1=new Intent(Toolword.this,Wordtool21.class);
                    startActivity(w1);
                }
                if(position==21){
                    Intent w1=new Intent(Toolword.this,Wordtool23.class);
                    startActivity(w1);
                }
                if(position==22){
                    Intent w1=new Intent(Toolword.this,Wordtool24.class);
                    startActivity(w1);
                }
                if(position==23){
                    Intent w1=new Intent(Toolword.this,Wordtool25.class);
                    startActivity(w1);
                }
                if(position==24){
                    Intent w1=new Intent(Toolword.this,Wordtool26.class);
                    startActivity(w1);
                }
                if(position==25){
                    Intent w1=new Intent(Toolword.this,Wordtool27.class);
                    startActivity(w1);
                }
                if(position==26){
                    Intent w1=new Intent(Toolword.this,Wordtool28.class);
                    startActivity(w1);
                }
                if(position==27){
                    Intent w1=new Intent(Toolword.this,Wordtool29.class);
                    startActivity(w1);
                }
                if(position==28){
                    Intent w1=new Intent(Toolword.this,Wordtool30.class);
                    startActivity(w1);
                }
                if(position==29){
                    Intent w1=new Intent(Toolword.this,Wordtool31.class);
                    startActivity(w1);
                }
                if(position==30){
                    Intent w1=new Intent(Toolword.this,Wordtool32.class);
                    startActivity(w1);
                }
                if(position==31){
                    Intent w1=new Intent(Toolword.this,Wordtool33.class);
                    startActivity(w1);
                }
                if(position==32){
                    Intent w1=new Intent(Toolword.this,Wordtool34.class);
                    startActivity(w1);
                }
                if(position==33){
                    Intent w1=new Intent(Toolword.this,Wordtool35.class);
                    startActivity(w1);
                }
                if(position==34){
                    Intent w1=new Intent(Toolword.this,Wordtool36.class);
                    startActivity(w1);
                }
                if(position==35){
                    Intent w1=new Intent(Toolword.this,Wordtool37.class);
                    startActivity(w1);
                }
                if(position==36){
                    Intent w1=new Intent(Toolword.this,Wordtool38.class);
                    startActivity(w1);
                }
                if(position==37){
                    Intent w1=new Intent(Toolword.this,Wordtool38.class);
                    startActivity(w1);
                }

            }
        });
    }
}