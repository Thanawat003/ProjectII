package com.example.punte;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LaunchScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_screen);
    }
    public void onStartClicked(View view) {
        final EditText name = (EditText) findViewById(R.id.txtname);
        if(name.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"Please enter youe name!!", Toast.LENGTH_LONG).show();
        } else {
            Intent intd = new Intent(getApplicationContext(), MainQuiz1.class);
            intd.putExtra("name", name.getText().toString());
            startActivity(intd);
        }
    }

}
