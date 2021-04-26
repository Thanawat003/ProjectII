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

public class Foodword extends AppCompatActivity {
    EditText shtext4;
    ListView lv4;
    ArrayList<String> listItems4;
    ArrayAdapter<String> adapter4;
    String namew4[]={
            "ก้องถึง = ขนมตุ๊บตั๊บ",
            "กั่นโต๊ง,ก่านโต้ง = ขนมหวานทำจากธัญพืช",
            "กี่จ่าง = ขนมจ้าง",
            "กิ้ดเหล้ง,เก็ดเหล้ง,เกียดเหล้ง = ไอศกรีม",
            "กุ่นเฉียง = ไส้กรอก",
            "เก่หนึ่งโก้ = ขนมไข่, ขนมเค้ก",
            "เก็กฮั้ว = เก็กฮวย",
            "เกลือเคย = น้ำปลาหวาน",
            "เกียดฮองเตี๋ยว = ขนมโก๋อ่อน",
            "เกี่ยมโก้ย = ขนมถ้วยตะไลเค็ม",
            "เกี่ยมฉ่าย = ผักกาดดอง",
            "เกี่ยมเปี้ย = ขนมปังกรอบ",
            "เกี่ยมโบ๋ย = บ๊วยเค็ม",
            "เกี่ยมหู = ปลาเค็ม",
            "โกซุ้ย = ขนมถ้วย",
            "โก่ปี้ = กาแฟร้อน",
            "โก่ปี้อ้อ = กาแฟดำ",
            "ข้าวขั้ว = ข้าวผัด",
            "เต๋ = ชา",
            "จิ้ว = เหล้า",
            "จี้โจ้ = ขนมทอดไส้ถั่วเหลือง",
            "จู้จูน = ขนมฝักบัว",
            "เจียะโก้ย,เชียะโก้ย = ปาท่องโก๋",
            "ฉ้ายถ่าวโก้ย = ขนมที่ทำจากหัวไชเท้า",
            "เฉี่ยนฉ้าว = เฉาก๊วย",
            "เซวโบ๋ย = ขนมจีบ",
            "ต่าวกั้วจี่ = เต้าหู้เหลืองยัดไส้ทอด",
            "ต่าวจู้ = เต้าหู้ยี้",
            "ต่าวซ้อ = ขนมเปี๊ยะไส่ถั่ว",
            "ต่าวอิ่วบะ, หมูต่าวอิ๋ว = หมูต้มซีอิ้ว",
            "ต่าวโฮ้ย = เต้าฮวย",
            "เต่เหลี่ยว = ขนมไหว้เจ้า",
            "ทึ้ง = แกงจืด",
            "น้ำฉ่อ = น้ำจิ้ม",
            "บ๊ะหูว = หมูหยอง",
            "บี๊โก่หมอย = ข้าวเหนียวดำราดกะทิ",
            "บี๊ถ่ายบาก = ขนมลอดช่องเส้นขนมจีน",
            "บี้พ้าง = ขนมข้าวพองมีรสหวาน",
            "ปลาถ้ำ, ปลาอับ = ปลากระป๋อง",
            "ล้อบะ,โล้บะ = หัวหมู,เครื่องในหมูพะโล้",
            "ลูกชิ้น = ทอดมัน",
            "หมอย = ข้าวต้ม",
            "หมี่ไทย = เส้นหมี่หุ้นผัด",
            "อ๋วน = ลูกชิ้น"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodword);
        lv4 = (ListView)findViewById(R.id.list4);
        shtext4 = (EditText)findViewById(R.id.searchtext);
        initList1();
        shtext4.addTextChangedListener(new TextWatcher() {
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
        for (String namews:namew4){
            if(!namews.contains(textToSearch)){
                listItems4.remove(namews);
            }
        }
        adapter4.notifyDataSetChanged();
    }
    public void initList1(){
        listItems4 = new ArrayList<>(Arrays.asList(namew4));
        adapter4 = new ArrayAdapter<String>(this,R.layout.listouts,R.id.outs,listItems4);
        lv4.setAdapter(adapter4);
        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Foodword.this,"List"+position,Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent w1=new Intent(Foodword.this,Wordfood1.class);
                    startActivity(w1);
                }
                if(position==1){
                    Intent w1=new Intent(Foodword.this,Wordfood2.class);
                    startActivity(w1);
                }
                if(position==2){
                    Intent w1=new Intent(Foodword.this,Wordfood3.class);
                    startActivity(w1);
                }
                if(position==3){
                    Intent w1=new Intent(Foodword.this,Wordfood4.class);
                    startActivity(w1);
                }
                if(position==4){
                    Intent w1=new Intent(Foodword.this,Wordfood5.class);
                    startActivity(w1);
                }
                if(position==5){
                    Intent w1=new Intent(Foodword.this,Wordfood6.class);
                    startActivity(w1);
                }
                if(position==6){
                    Intent w1=new Intent(Foodword.this,Wordfood7.class);
                    startActivity(w1);
                }
                if(position==7){
                    Intent w1=new Intent(Foodword.this,Wordfood8.class);
                    startActivity(w1);
                }
                if(position==8){
                    Intent w1=new Intent(Foodword.this,Wordfood9.class);
                    startActivity(w1);
                }
                if(position==9){
                    Intent w1=new Intent(Foodword.this,Wordfood10.class);
                    startActivity(w1);
                }
                if(position==10){
                    Intent w1=new Intent(Foodword.this,Wordfood11.class);
                    startActivity(w1);
                }
                if(position==11){
                    Intent w1=new Intent(Foodword.this,Wordfood12.class);
                    startActivity(w1);
                }
                if(position==12){
                    Intent w1=new Intent(Foodword.this,Wordfood13.class);
                    startActivity(w1);
                }
                if(position==13){
                    Intent w1=new Intent(Foodword.this,Wordfood14.class);
                    startActivity(w1);
                }
                if(position==14){
                    Intent w1=new Intent(Foodword.this,Wordfood15.class);
                    startActivity(w1);
                }
                if(position==15){
                    Intent w1=new Intent(Foodword.this,Wordfood16.class);
                    startActivity(w1);
                }
                if(position==16){
                    Intent w1=new Intent(Foodword.this,Wordfood17.class);
                    startActivity(w1);
                }
                if(position==17){
                    Intent w1=new Intent(Foodword.this,Wordfood18.class);
                    startActivity(w1);
                }
                if(position==18){
                    Intent w1=new Intent(Foodword.this,Wordfood19.class);
                    startActivity(w1);
                }
                if(position==19){
                    Intent w1=new Intent(Foodword.this,Wordfood20.class);
                    startActivity(w1);
                }
                if(position==20){
                    Intent w1=new Intent(Foodword.this,Wordfood21.class);
                    startActivity(w1);
                }
                if(position==21){
                    Intent w1=new Intent(Foodword.this,Wordfood22.class);
                    startActivity(w1);
                }
                if(position==22){
                    Intent w1=new Intent(Foodword.this,Wordfood23.class);
                    startActivity(w1);
                }
                if(position==23){
                    Intent w1=new Intent(Foodword.this,Wordfood24.class);
                    startActivity(w1);
                }
                if(position==24){
                    Intent w1=new Intent(Foodword.this,Wordfood25.class);
                    startActivity(w1);
                }
                if(position==25){
                    Intent w1=new Intent(Foodword.this,Wordfood26.class);
                    startActivity(w1);
                }
                if(position==26){
                    Intent w1=new Intent(Foodword.this,Wordfood27.class);
                    startActivity(w1);
                }
                if(position==27){
                    Intent w1=new Intent(Foodword.this,Wordfood28.class);
                    startActivity(w1);
                }
                if(position==28){
                    Intent w1=new Intent(Foodword.this,Wordfood29.class);
                    startActivity(w1);
                }
                if(position==29){
                    Intent w1=new Intent(Foodword.this,Wordfood30.class);
                    startActivity(w1);
                }
                if(position==30){
                    Intent w1=new Intent(Foodword.this,Wordfood31.class);
                    startActivity(w1);
                }
                if(position==31){
                    Intent w1=new Intent(Foodword.this,Wordfood32.class);
                    startActivity(w1);
                }
                if(position==32){
                    Intent w1=new Intent(Foodword.this,Wordfood33.class);
                    startActivity(w1);
                }
                if(position==33){
                    Intent w1=new Intent(Foodword.this,Wordfood34.class);
                    startActivity(w1);
                }
                if(position==34){
                    Intent w1=new Intent(Foodword.this,Wordfood35.class);
                    startActivity(w1);
                }
                if(position==35){
                    Intent w1=new Intent(Foodword.this,Wordfood36.class);
                    startActivity(w1);
                }
                if(position==36){
                    Intent w1=new Intent(Foodword.this,Wordfood37.class);
                    startActivity(w1);
                }
                if(position==37){
                    Intent w1=new Intent(Foodword.this,Wordfood38.class);
                    startActivity(w1);
                }
                if(position==38){
                    Intent w1=new Intent(Foodword.this,Wordfood39.class);
                    startActivity(w1);
                }
                if(position==39){
                    Intent w1=new Intent(Foodword.this,Wordfood40.class);
                    startActivity(w1);
                }
                if(position==40){
                    Intent w1=new Intent(Foodword.this,Wordfood41.class);
                    startActivity(w1);
                }
                if(position==41){
                    Intent w1=new Intent(Foodword.this,Wordfood42.class);
                    startActivity(w1);
                }
                if(position==42){
                    Intent w1=new Intent(Foodword.this,Wordfood43.class);
                    startActivity(w1);
                }
                if(position==43){
                    Intent w1=new Intent(Foodword.this,Wordfood44.class);
                    startActivity(w1);
                }

            }
        });
    }
}
