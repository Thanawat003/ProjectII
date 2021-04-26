package com.example.punte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    ImageView curView = null;
    private int countPair = 0;
    final int[] drawable = new int[] {
            R.drawable.wordfest2,
            R.drawable.wordfood6,
            R.drawable.wordfest6,
            R.drawable.wordverb7,
            R.drawable.wordverb10,
            R.drawable.wordfest30,
            R.drawable.wordtool1,
            R.drawable.wordfood25
    };
    int[] pos = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
    int currentPos = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageAdapter imageAdapter = new ImageAdapter(this);

        GridView gridView;
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos < 0 ) {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else {
                    if (currentPos == position) {
                        ((ImageView) view).setImageResource(R.drawable.hidden);
                    } else if (pos[currentPos] != pos[position]) {
                        curView.setImageResource(R.drawable.hidden);
                        Toast.makeText(Game.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 8) {
                            Toast.makeText(Game.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}
