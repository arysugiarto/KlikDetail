package com.example.klikdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBookingActivity extends AppCompatActivity {

    String detail;
    TextView NamaDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_booking);

        NamaDetail=(TextView) findViewById(R.id.IdDetail);

        // ambil parameter nama_tahun dari intent
        Intent intent = getIntent();
        detail = intent.getStringExtra("detail");

        // tampilkan nama tahun di TextView nama tahun
        NamaDetail.setText(detail);
    }
}
