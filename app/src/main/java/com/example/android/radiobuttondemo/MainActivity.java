package com.example.android.radiobuttondemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.radioGroupID);
        tv = findViewById(R.id.textView);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb = findViewById(checkedId);
                switch(rb.getId()) {
                    case R.id.yes: tv.setText("Yes");
                        tv.setTextColor(Color.GREEN);
                        break;
                    case R.id.no: tv.setText("No");
                        tv.setTextColor(Color.RED);
                        break;
                    case R.id.maybe: tv.setText("May be!");
                        tv.setTextColor(Color.GRAY);
                        break;
                }
            }
        });
    }
}
