package com.example.exine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DangKy extends AppCompatActivity {
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        back = findViewById(R.id.iv_DK_Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenActivityDangNhap();
            }
        });
    }

    public void chuyenActivityDangNhap()
    {
        Intent intent = new Intent(this, DangNhap.class);
        startActivity(intent);
    }
}