package com.example.punte;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Place extends AppCompatActivity {
        ListView listView;
        String mTitle1[] = {
                "วัดฉลอง",
                "วัดพระทอง(พระผุด)",
                "ย่านเก่าและสตรีทอาร์ต",
                "จุดชมวิวแหลมพรหมเทพ",
                "หาดป่าตอง",
                "หาดกมลา",
                "บ้านชินประชา",
                "พิพิธภัณฑ์ภูเก็ตไทยหัว",
                "ศาลเจ้ากะทู้",
                "ศาลเจ้าแสงธรรม",
                "ศาลเจ้าจุ้ยตุ่ย",
                "แหลมพันวา",
                "หอชมวิวเขาขาด",
                "สวนสาธารณะสะพานหิน",
                "พระใหญ่ พุทธอุทยานยอดเขานาคเกิด",};
        String mDescription1[] = {
                "วัดฉลอง หรือชื่อที่เรียกเป็นทางการ ก็คือ วัดไชยธาราม เป็นวัดคู่บ้านคู่เมืองที่มีชื่อเสียงของภูเก็ต",
                "ความพิเศษของวัดแห่งนี้คือพระพุทธรูปที่โผล่ขึ้นมาจากพื้นดินเพียงครึ่งองค์",
                "ตึกเก่าที่ตั้งตระหง่านอยู่ในย่านการค้าเก่าเเก่ของเมือง เป็นอาคารสไตล์ ชิโนโปรตุกีส",
                "จุดชมวิวพระอาทิตย์ตกก่อนใครที่สวยที่สุดในเมืองไทย",
                "เป็นย่านที่คึกคักที่สุดของเกาะภูเก็ต ยามค่ำคืนก็มีตลาดนัดถนนคนเดินให้เดินกันไม่มีเบื่อ",
                "หาดที่ตั้งอยู่ทางเหนือของหาดป่าตอง ห่างจากตัวเมืองประมาณ 26 กิโลเมตร",
                "เป็นการผสมผสานสถาปัตยกรรมแบบจีนและแบบโปรตุกีสเข้าด้วยกัน",
                "เป็นโรงเรียนจีนฮกเกี้ยนซึ่งปัจจุบันได้ปรับปรุงเป็นพิพิธภัณฑ์เชิงวัฒนธรรมของชาวภูเก็ต",
                "เป็นศาลเจ้าเก่าแก่ และศักดิ์สิทธิ์ อีกทั้งยังเป็นต้นกำเนิดของ ประเพณีถือศีลกินผักของภูเก็ต",
                " เป็นศาลเจ้าที่เก่าแก่ในจังหวัดภูเก็ตซึ่งมีอายุนับร้อยปี มีความโดดเด่นในออกแบบตามสถาปัตยกรรมแบบจีน",
                "คำว่า “จุ้ย” เป็นภาษาจีน มีความหมายว่า “น้ำ” และคำว่า “ตุ้ย” แปลว่า “ครกตำข้าว” ชื่อของศาลเจ้ามาจากในสมัยอดีตบริเวณหน้าศาลเจ้ามีลำคลองขนาดใหญ่ และชาวบ้านก็ได้สร้างกังหันขึ้น",
                "ตั้งอยู่ในเขตตำบลวิชิต อำเภอเมืองภูเก็ต จังหวัดภูเก็ต ทางทิศตะวันออกเฉียงใต้ของเกาะภูเก็ต บริเวณนั้นมีทิวทัศน์ที่สวยงาม",
                "เป็นจุดชมวิวอีกแห่งหนึ่ง ของจังหวัดภูเก็ต ตั้งอยู่ในตำบลวิชิต อำเภอเมือง จังหวัดภูเก็ต",
                "สวนสาธารณะสะพานหินเป็นสถานที่พักผ่อนหย่อนใจที่ได้บรรยากาศสวยงาม",
                "พระพุทธมิ่งมงคลเอกนาคคีรี หรือ พระใหญ่ พระพุทธรูปประจำเมืองภูเก็ต ชาวต่างชาติรู้จักกันในนามว่า Big Buddha",};

        int images1[] = {
                R.drawable.watchalong,
                R.drawable.watpratong,
                R.drawable.talang,
                R.drawable.promtep,
                R.drawable.patong,
                R.drawable.kamala,
                R.drawable.chinpracha,
                R.drawable.thaihua,
                R.drawable.katu,
                R.drawable.sangtham,
                R.drawable.juitui,
                R.drawable.panwa,
                R.drawable.kaokad,
                R.drawable.sapanhin,
                R.drawable.prayai};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_place);
            listView = findViewById(R.id.listView);
            MyAdapter adapter = new MyAdapter(this,mTitle1,mDescription1,images1);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position ==  0) {
                        Intent w1=new Intent(Place.this,Watchalong.class);
                        startActivity(w1);
                    }
                    if (position ==  1) {
                        Intent w2=new Intent(Place.this,Watpratong.class);
                        startActivity(w2);
                    }
                    if (position ==  2) {
                        Intent w3=new Intent(Place.this,Talang.class);
                        startActivity(w3);
                    }
                    if (position ==  3) {
                        Intent w4=new Intent(Place.this,Promtep.class);
                        startActivity(w4);
                    }
                    if (position ==  4) {
                        Intent w5=new Intent(Place.this,Patong.class);
                        startActivity(w5);
                    }
                    if (position ==  5) {
                        Intent w6=new Intent(Place.this,Kamala.class);
                        startActivity(w6);
                    }
                    if (position ==  6) {
                        Intent w7=new Intent(Place.this,Chinpracha.class);
                        startActivity(w7);
                    }
                    if (position ==  7) {
                        Intent w8=new Intent(Place.this,Thaihua.class);
                        startActivity(w8);
                    }
                    if (position ==  8) {
                        Intent w9=new Intent(Place.this,Katu.class);
                        startActivity(w9);
                    }
                    if (position ==  9) {
                        Intent w10=new Intent(Place.this,Sangtham.class);
                        startActivity(w10);
                    }
                    if (position ==  10) {
                        Intent w11=new Intent(Place.this,Juitui.class);
                        startActivity(w11);
                    }
                    if (position ==  11) {
                        Intent w12=new Intent(Place.this,Panwa.class);
                        startActivity(w12);
                    }
                    if (position ==  12) {
                        Intent w13=new Intent(Place.this,Kaokad.class);
                        startActivity(w13);
                    }
                    if (position ==  13) {
                        Intent w14=new Intent(Place.this,Sapanhin.class);
                        startActivity(w14);
                    }
                    if (position ==  14) {
                        Intent w15=new Intent(Place.this,Prayai.class);
                        startActivity(w15);
                    }
                }
            });
            // so item click is done now check list view
        }

        class MyAdapter extends ArrayAdapter<String> {

            Context context;
            String rTitle[];
            String rDescription[];
            int rImgs[];

            MyAdapter (Context c, String title[], String description[], int imgs[]) {
                super(c, R.layout.activity_row, R.id.tex1, title);
                this.context = c;
                this.rTitle = title;
                this.rDescription = description;
                this.rImgs = imgs;

            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.activity_row, parent, false);
                ImageView images = row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.textView1);
                TextView myDescription = row.findViewById(R.id.textView2);

                // now set our resources on views
                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);




                return row;
            }
        }
}