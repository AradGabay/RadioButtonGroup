package com.example.user.radiobuttongroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton red,green,blue;
    LinearLayout linl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue=(RadioButton)findViewById(R.id.blue);
        green=(RadioButton)findViewById(R.id.green);
        red=(RadioButton)findViewById(R.id.red);
        linl=(LinearLayout)findViewById(R.id.linl);
    }

    public void changeC(View view) {
        if(blue.isChecked())linl.setBackgroundColor(Color.BLUE);
        if(red.isChecked())linl.setBackgroundColor(Color.RED);
        if(green.isChecked())linl.setBackgroundColor(Color.GREEN);
    }

    public void backtoS(View view) {
        linl.setBackgroundColor(Color.WHITE);
    }
}
