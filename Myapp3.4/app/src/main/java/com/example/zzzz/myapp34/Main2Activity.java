package com.example.zzzz.myapp34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Extra_message);
        TextView textView3 = new TextView(this);
        textView3.setTextSize(30);
        textView3.setText("Welcome " + message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main2);
        layout.addView(textView3);


    }

}
