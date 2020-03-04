package com.example.mylibtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.customtext.CustomTextStyle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtName = findViewById(R.id.textName);

        CustomTextStyle customTextStyle = new CustomTextStyle();
        txtName.setText(customTextStyle.getCustomTextStyle("Hii Suraj "));


    }
}
