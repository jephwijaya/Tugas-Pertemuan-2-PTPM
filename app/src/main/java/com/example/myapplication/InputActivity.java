package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class InputActivity extends AppCompatActivity {

    ImageView iv_logo;
    TextInputLayout at_nama, at_nim, at_nilai;
    TextInputEditText et_nama, et_nim, et_nilai;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        at_nama = (TextInputLayout) findViewById(R.id.at_nama);
        at_nim = (TextInputLayout) findViewById(R.id.at_nim);
        at_nilai = (TextInputLayout) findViewById(R.id.at_nilai);
        et_nama = (TextInputEditText) findViewById(R.id.et_nama);
        et_nim = (TextInputEditText) findViewById(R.id.et_nim);
        et_nilai = (TextInputEditText) findViewById(R.id.et_nilai);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama, nim, nilai;
                nama = et_nama.getText().toString();
                nim = et_nim.getText().toString();
                nilai = et_nilai.getText().toString();

                if(et_nama.getText().length() > 0){
                    if(et_nim.getText().length() > 0){
                        if(et_nilai.getText().length() > 0){
                            Intent i = new Intent(getApplicationContext(), OutputActivity.class);
                            i.putExtra("NAMA", nama);
                            i.putExtra("NIM", nim);
                            i.putExtra("NILAI", nilai);
                            startActivity(i);
                        } else {
                            at_nilai.setError("Nilai tidak boleh kosong!");
                        }
                    } else {
                        at_nim.setError("NIM tidak boleh kosong!");
                    }
                } else if(et_nim.getText().length() > 0){
                    at_nama.setError("Nama tidak boleh kosong!");
                } else if(et_nilai.getText().length() > 0){
                    at_nama.setError("Nama tidak boleh kosong!");
                    at_nim.setError("NIM tidak boleh kosong!");
                } else {
                    at_nama.setError("Nama tidak boleh kosong!");
                    at_nim.setError("NIM tidak boleh kosong!");
                    at_nilai.setError("Nilai tidak boleh kosong!");
                }
            }
        });

        et_nama.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
//              Ga perlu diisi
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft )
            {
//              Ga perlu diisi
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (et_nama.getText().length() > 0) {
                    at_nama.setError(null);
                }
            }
        });

        et_nim.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
//              Ga perlu diisi
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft )
            {
//              Ga perlu diisi
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (et_nim.getText().length() > 0) {
                    at_nim.setError(null);
                }
            }
        });

        et_nilai.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
//              Ga perlu diisi
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft )
            {
//              Ga perlu diisi
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (et_nilai.getText().length() > 0) {
                    at_nilai.setError(null);
                }
            }
        });

    }
}