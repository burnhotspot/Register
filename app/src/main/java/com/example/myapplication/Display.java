package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView thistext=(TextView)findViewById(R.id.showname);
        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            String name = extras.getString(NAME);
            if(name!=null){
                thistext.setText(getString(R.string.showname)+" "+name);
            }
        }

    }
}
