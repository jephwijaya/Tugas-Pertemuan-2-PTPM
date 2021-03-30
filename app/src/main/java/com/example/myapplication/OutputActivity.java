package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    String nama, nim, nilai;
    TextView tv_nama, tv_nim, tv_nilai;
    Double konversi_nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);



        tv_nama = (TextView) findViewById(R.id.tv_nama);
        tv_nim = (TextView) findViewById(R.id.tv_nim);
        tv_nilai = (TextView) findViewById(R.id.tv_nilai);

        nama = getIntent().getStringExtra("NAMA");
        nim = getIntent().getStringExtra("NIM");
        nilai = getIntent().getStringExtra("NILAI");

        tv_nama.setText(nama);
        tv_nim.setText(nim);

        konversi_nilai = Double.parseDouble(nilai);
        if (konversi_nilai == 1){
            tv_nilai.setText("D");
        } else if (konversi_nilai > 1 && konversi_nilai <= 1.33){
            tv_nilai.setText("D+");
        } else if (konversi_nilai > 1.33 && konversi_nilai <= 1.66){
            tv_nilai.setText("C-");
        } else if (konversi_nilai > 1.66 && konversi_nilai <= 2){
            tv_nilai.setText("C");
        } else if (konversi_nilai > 2 && konversi_nilai <= 2.33){
            tv_nilai.setText("C+");
        } else if (konversi_nilai > 2.33 && konversi_nilai <= 2.66){
            tv_nilai.setText("B-");
        } else if (konversi_nilai > 2.66 && konversi_nilai <= 3){
            tv_nilai.setText("B");
        } else if (konversi_nilai > 3 && konversi_nilai <= 3.33){
            tv_nilai.setText("B+");
        } else if (konversi_nilai > 3.33 && konversi_nilai <= 3.66){
            tv_nilai.setText("A-");
        } else if (konversi_nilai > 3.66 && konversi_nilai <= 4){
            tv_nilai.setText("A");
        }

    }
}