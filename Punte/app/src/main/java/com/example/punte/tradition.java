package com.example.punte;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class tradition extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {
            "งานพ้อต่อ",
            "ประเพณีกินเจ",
            "ประเพณีลอยเรือ",
            "งานท้าวเทพกระษัตรี-ท้าวศรีสุนทร",
            "ประเพณีปล่อยเต่า",
            "ประเพณีเดินเต่า"};
    String mDescription[] = {
            "เป็นงานประเพณีของชาวภูเก็ตที่มีเชื้อสายจีน จะมีพิธีในช่วงเดือน 7 ของจีนหรือเดือน 9 ของไทย",
            "เป็นการถือศีลชำระจิตใจ และงดเว้นการบริโภคเนื้อสัตว์ทุกชนิด มีระยะเวลา 9 วัน",
            "โดยกลุ่มชาวเลที่หาดราไวย์และบ้านสะปำ",
            "เพื่อรำลึกถึงเหตุการณ์ประวัติศาสตร์ ที่สองวีรสตรีสามารถปกป้องเมืองถลาง",
            "จะมีการปล่อยเต่าลงทะเล ณ อุทยานแห่งชาติหาดไนยาง",
            "เป็นการสังเกตเต่าขึ้นมาวางไข่ริมชายหาด ในตอนกลางคืนถึงย่ำรุ่ง",};
    int images[] = {R.drawable.portor, R.drawable.kinpak, R.drawable.loyrua, R.drawable.tawtep, R.drawable.ploytao, R.drawable.derntao};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradition);
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent w1=new Intent(tradition.this,Portor.class);
                    startActivity(w1);
                }
                if (position ==  1) {
                    Intent w2=new Intent(tradition.this,Kinpak.class);
                    startActivity(w2);
                }
                if (position ==  2) {
                    Intent w3=new Intent(tradition.this,Loylua.class);
                    startActivity(w3);
                }
                if (position ==  3) {
                    Intent w4=new Intent(tradition.this,Tawtep.class);
                    startActivity(w4);
                }
                if (position ==  4) {
                    Intent w5=new Intent(tradition.this,Ploytao.class);
                    startActivity(w5);
                }
                if (position ==  5) {
                    Intent w6=new Intent(tradition.this,Derntao.class);
                    startActivity(w6);
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