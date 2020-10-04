package com.example.basicpractice.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.basicpractice.R;

/**
 * Created by zzchuan
 * Created on
 * Updated on
 */

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView = findViewById(R.id.mainGridView);
        gridView.setAdapter(new GridViewAdapter(GridViewActivity.this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"点击"+position,Toast.LENGTH_SHORT).show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"长按"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
