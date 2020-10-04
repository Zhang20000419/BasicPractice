package com.example.basicpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imv_2;
    private Button btn_imv;
    private RelativeLayout mainImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imv_2 = findViewById(R.id.imv_2);
        btn_imv = findViewById(R.id.btn_imv);
        btn_imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(ImageViewActivity.this).load("http://img2.ddove.com/upload/20121009/090649003786.jpg").error(R.drawable.picture2).into(imv_2);
            }
        });

    }
}