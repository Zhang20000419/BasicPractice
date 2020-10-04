package com.example.basicpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView tv_4;
    private TextView tv_5;
    private TextView tv_6;
    private TextView tv_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tv_4 = findViewById(R.id.tv_4);
        tv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tv_4.getPaint().setAntiAlias(true);

        tv_5 = findViewById(R.id.tv_5);
        tv_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);    //下划线和中划线不能同时存在

        tv_6 = findViewById(R.id.tv_6);
        tv_6.setText(Html.fromHtml("<u>TextView_Text6</u>"));
    }
}