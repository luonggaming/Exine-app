package com.example.exine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    private Button bttnDK;
    private Button bttnDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        bttnDK = findViewById(R.id.bttn_DN_DangKy);
        bttnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenActivityDK();
            }
        });
    }

    public void chuyenActivityDK()
    {
        Intent intent = new Intent(this, DangKy.class);
        startActivity(intent);
    }

}