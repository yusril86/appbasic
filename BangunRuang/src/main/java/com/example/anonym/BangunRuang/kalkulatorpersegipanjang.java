package com.example.anonym.BangunRuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulatorpersegipanjang extends AppCompatActivity {
    EditText edtpanjang, edtlebar,edtlebar2,edtpanjang2;
    Button btnhitung,btnhitung2;
    TextView tvhasil,tvhasil2;
    int hasil,hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatorpersegipanjang);
        edtlebar = (EditText) findViewById(R.id.edt_lebar);
        edtpanjang = (EditText) findViewById(R.id.edt_panjang);
        edtlebar2 = (EditText)findViewById(R.id.edt_lebar2);
        edtpanjang2 = (EditText) findViewById(R.id.edt_panjang2);
        btnhitung = (Button) findViewById(R.id.btn_hitungpersegipanjang);
        btnhitung2 = (Button) findViewById(R.id.btn_hitungkelilingpersegipanjang);
        tvhasil = (TextView) findViewById(R.id.tv_hasilpersegipanjang);
        tvhasil2 = (TextView)findViewById(R.id.tv_hasilkelilingpersegipanjang);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isikolom = false;
                if (TextUtils.isEmpty(edtlebar.getText().toString())) {
                    isikolom = true;
                    edtlebar.setError("Kolom tidak boleh kosong");
                }
                if (TextUtils.isEmpty(edtpanjang.getText().toString())) {
                    isikolom = true;
                    edtpanjang.setError("Kolom tidak boleh kosong");
                }

                if (!isikolom) {
                    hasil = Integer.parseInt(edtlebar.getText().toString()) *
                            Integer.parseInt(edtpanjang.getText().toString());
                    tvhasil.setText("Luas persegi panjang adalah =" + hasil + "cm2");
                }
            }

        });
   btnhitung2.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           boolean isikolom = false ;
           if (TextUtils.isEmpty(edtlebar2.getText().toString())) {
               isikolom = true;
               edtlebar2.setError("Kolom tidak boleh kosong");
           }
           if (TextUtils.isEmpty(edtpanjang2.getText().toString())){
               isikolom = true;
               edtpanjang2.setError("Kolom tidak boleh kosong");
           }
           if (!isikolom){
               hasil2 = (Integer.parseInt(edtlebar2.getText().toString()) +
                       Integer.parseInt(edtpanjang2.getText().toString())) * 2;
               tvhasil2.setText("Keliling Persegi panjang adalah =" + hasil2 + "cm");
           }
       }

   });

    }

}
