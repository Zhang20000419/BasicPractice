package com.example.basicpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.basicpractice.gridview.GridViewActivity;
import com.example.basicpractice.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button TextView;
    private Button button;
    private Button editTextView;
    private Button radioButton;
    private Button checkBox;
    private Button imageView;
    private Button listView;
    private Button gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.TextView);
        button = findViewById(R.id.Button);
        editTextView = findViewById(R.id.EditText);
        radioButton = findViewById(R.id.RadioButton);
        checkBox = findViewById(R.id.CheckBox);
        imageView = findViewById(R.id.ImageView);
        listView = findViewById(R.id.ListView);
        gridView = findViewById(R.id.GridView);
        setListeners();
    }

    private void setListeners (){
        OnClick onClick = new OnClick();
        TextView.setOnClickListener(onClick);
        button.setOnClickListener(onClick);
        editTextView.setOnClickListener(onClick);
        radioButton.setOnClickListener(onClick);
        checkBox.setOnClickListener(onClick);
        imageView.setOnClickListener(onClick);
        listView.setOnClickListener(onClick);
        gridView.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.TextView:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.Button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.EditText:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.RadioButton:
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.CheckBox:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.ImageView:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.ListView:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.GridView:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}