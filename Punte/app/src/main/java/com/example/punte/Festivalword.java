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

public class Festivalword extends AppCompatActivity {
    EditText shtext3;
    ListView lv3;
    ArrayList<String> listItems3;
    ArrayAdapter<String> adapter3;
    String namew3[]={
            "กระดาษกิ้ม = กระดาษทอง",
            "กิมเต๋ง = ที่เผากระดาษทอง",
            "กิ้มก้อ = กลอง ม้าล่อ",
            "กิ้มสิ้น = รูปพระ",
            "โกเต้งค้า = เสาโกเต้ง",
            "โก้ยโห้ย = การทำพิธีลุยไฟ",
            "โก้ยห่าน = การทำพิธีสะเดาะเคราะห์",
            "จู้ตั๋ว = ประธานศาลเจ้า",
            "เจ่งหล่อ = กระถางไม้หอม",
            "ฉ้ายอิ้ว = ผู้เข้าร่วมพิธีกินผัก",
            "เฉี้ยถี่ก้อง = พิธีเชิญเทวดา",
            "เฉี้ยหยกอ๋อง = พิธีเชิญจักรพรรดิ์หยก",
            "เฉี้ยกิ๊วอ๋อง = พิธีเชิญราชาธิราช 9 องค์",
            "ตะอิ่น = การประทับตรา",
            "ต้าวบูเก้ง = ศาลเจ้า",
            "เต็กฮู่ = ยันต์เขียนบนไม้ไผ่",
            "จับฉ่าย = อาหารทำด้วยผักหลายชนิด",
            "ตั่งปั๋ว = ถาดสี่เหลี่ยมทำด้วยไม้ ",
            "ตัวหมึง = ประตูใหญ่ศาลเจ้า",
            "ตั๋ว = โต๊ะขาสูง",
            "ตั้วก้อ = กลองใหญ่",
            "ตั้วเหล่ง = ธงอาชาสิทธิ์",
            "ตั้วเหลียน = เกี้ยวใหญ่",
            "ถ่าวกี๋ = ธงนำขบวน",
            "เท้สิ้น = รูปต่างตัว",
            "ไท้เปี๋ย = เกี้ยวเล็ก",
            "เทียนเต้ง = ตะเกียงเทวดา",
            "ป้างผ่าว = จุดประทัด",
            "โป๊ย = ไม้สำหรับเสี่ยงทาย",
            "ปั๋วะโป๊ย = การเสี่ยงทาย",
            "เร้งเก่ว = เกี้ยวที่เชิญรูปพระ",
            "ส่างถี่ก้อง = พิธีส่งเทวดา",
            "ส่างกิ้วอ๋อง = พิธีส่งกิ้วอ๋อง",
            "ส่างหยกอ๋อง = พิธีส่งหยกอ๋อง",
            "ส่องเก้ง = การสวดมนต์",
            "อึ้งเหล่ง = ธงอาญาสิทธ์เหลือง ",
            "อ่อเหล่ง = ธงอาญาสิทธ์ดำ",
            " ฮู๋ = ผ้ายันต์",
            "เฮี้ยว = ธูป",
            "ฮวดโซะ = แส้พระ",
            "ฮวดกั้ว = เจ้าหน้าที่ประกอบพิธี "
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivalword);
        lv3 = (ListView)findViewById(R.id.list3);
        shtext3 = (EditText)findViewById(R.id.searchtext);
        initList1();
        shtext3.addTextChangedListener(new TextWatcher() {
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
        for (String namews:namew3){
            if(!namews.contains(textToSearch)){
                listItems3.remove(namews);
            }
        }
        adapter3.notifyDataSetChanged();
    }
    public void initList1(){
        listItems3 = new ArrayList<>(Arrays.asList(namew3));
        adapter3 = new ArrayAdapter<String>(this,R.layout.listouts,R.id.outs,listItems3);
        lv3.setAdapter(adapter3);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Festivalword.this,"List"+position,Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent w1=new Intent(Festivalword.this,Wordfest1.class);
                    startActivity(w1);
                }
                if(position==1){
                    Intent w1=new Intent(Festivalword.this,Wordfest2.class);
                    startActivity(w1);
                }
                if(position==2){
                    Intent w1=new Intent(Festivalword.this,Wordfest3.class);
                    startActivity(w1);
                }
                if(position==3){
                    Intent w1=new Intent(Festivalword.this,Wordfest4.class);
                    startActivity(w1);
                }
                if(position==4){
                    Intent w1=new Intent(Festivalword.this,Wordfest5.class);
                    startActivity(w1);
                }
                if(position==5){
                    Intent w1=new Intent(Festivalword.this,Wordfest6.class);
                    startActivity(w1);
                }
                if(position==6){
                    Intent w1=new Intent(Festivalword.this,Wordfest7.class);
                    startActivity(w1);
                }
                if(position==7){
                    Intent w1=new Intent(Festivalword.this,Wordfest8.class);
                    startActivity(w1);
                }
                if(position==8){
                    Intent w1=new Intent(Festivalword.this,Wordfest9.class);
                    startActivity(w1);
                }
                if(position==9){
                    Intent w1=new Intent(Festivalword.this,Wordfest10.class);
                    startActivity(w1);
                }
                if(position==10){
                    Intent w1=new Intent(Festivalword.this,Wordfest11.class);
                    startActivity(w1);
                }
                if(position==11){
                    Intent w1=new Intent(Festivalword.this,Wordfest12.class);
                    startActivity(w1);
                }
                if(position==12){
                    Intent w1=new Intent(Festivalword.this,Wordfest13.class);
                    startActivity(w1);
                }
                if(position==13){
                    Intent w1=new Intent(Festivalword.this,Wordfest14.class);
                    startActivity(w1);
                }
                if(position==14){
                    Intent w1=new Intent(Festivalword.this,Wordfest15.class);
                    startActivity(w1);
                }
                if(position==15){
                    Intent w1=new Intent(Festivalword.this,Wordfest16.class);
                    startActivity(w1);
                }
                if(position==16){
                    Intent w1=new Intent(Festivalword.this,Wordfest17.class);
                    startActivity(w1);
                }
                if(position==17){
                    Intent w1=new Intent(Festivalword.this,Wordfest18.class);
                    startActivity(w1);
                }
                if(position==18){
                    Intent w1=new Intent(Festivalword.this,Wordfest19.class);
                    startActivity(w1);
                }
                if(position==19){
                    Intent w1=new Intent(Festivalword.this,Wordfest20.class);
                    startActivity(w1);
                }
                if(position==20){
                    Intent w1=new Intent(Festivalword.this,Wordfest21.class);
                    startActivity(w1);
                }
                if(position==21){
                    Intent w1=new Intent(Festivalword.this,Wordfest22.class);
                    startActivity(w1);
                }
                if(position==22){
                    Intent w1=new Intent(Festivalword.this,Wordfest23.class);
                    startActivity(w1);
                }
                if(position==23){
                    Intent w1=new Intent(Festivalword.this,Wordfest24.class);
                    startActivity(w1);
                }
                if(position==24){
                    Intent w1=new Intent(Festivalword.this,Wordfest25.class);
                    startActivity(w1);
                }
                if(position==25){
                    Intent w1=new Intent(Festivalword.this,Wordfest26.class);
                    startActivity(w1);
                }
                if(position==26){
                    Intent w1=new Intent(Festivalword.this,Wordfest27.class);
                    startActivity(w1);
                }
                if(position==27){
                    Intent w1=new Intent(Festivalword.this,Wordfest28.class);
                    startActivity(w1);
                }
                if(position==28){
                    Intent w1=new Intent(Festivalword.this,Wordfest29.class);
                    startActivity(w1);
                }
                if(position==29){
                    Intent w1=new Intent(Festivalword.this,Wordfest30.class);
                    startActivity(w1);
                }
                if(position==30){
                    Intent w1=new Intent(Festivalword.this,Wordfest31.class);
                    startActivity(w1);
                }
                if(position==31){
                    Intent w1=new Intent(Festivalword.this,Wordfest32.class);
                    startActivity(w1);
                }
                if(position==32){
                    Intent w1=new Intent(Festivalword.this,Wordfest33.class);
                    startActivity(w1);
                }
                if(position==33){
                    Intent w1=new Intent(Festivalword.this,Wordfest34.class);
                    startActivity(w1);
                }
                if(position==34){
                    Intent w1=new Intent(Festivalword.this,Wordfest35.class);
                    startActivity(w1);
                }
                if(position==35){
                    Intent w1=new Intent(Festivalword.this,Wordfest36.class);
                    startActivity(w1);
                }
                if(position==36){
                    Intent w1=new Intent(Festivalword.this,Wordfest37.class);
                    startActivity(w1);
                }
                if(position==37){
                    Intent w1=new Intent(Festivalword.this,Wordfest38.class);
                    startActivity(w1);
                }
                if(position==38){
                    Intent w1=new Intent(Festivalword.this,Wordfest39.class);
                    startActivity(w1);
                }
                if(position==39){
                    Intent w1=new Intent(Festivalword.this,Wordfest40.class);
                    startActivity(w1);
                }
                if(position==40){
                    Intent w1=new Intent(Festivalword.this,Wordfest41.class);
                    startActivity(w1);
                }

            }
        });
    }
}
