package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText textname;
    String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textname = (EditText)findViewById(R.id.name);
        Button press = (Button)findViewById(R.id.press);


        press.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                handleButtonClick();
            }
        });

    }

    private void handleButtonClick(){
        String strName = textname.getText().toString();

        Intent i = new Intent(this, Display.class);

        i.putExtra(Display.NAME, strName);
        startActivity(i);
    }
}
