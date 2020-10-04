package com.example.basicpractice.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.basicpractice.R;

/**
 * Created by zzchuan
 * Created on
 * Updated on
 */
public class ListViewActivity extends Activity {

    private ListView mainListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mainListView = findViewById(R.id.mainListView);
        mainListView.setAdapter(new ListViewAdapter(ListViewActivity.this));
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"点击"+position,Toast.LENGTH_SHORT).show();
            }
        });
        mainListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"长按"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
