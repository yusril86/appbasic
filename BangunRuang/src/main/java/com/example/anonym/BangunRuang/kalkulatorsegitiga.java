package com.example.anonym.BangunRuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class kalkulatorsegitiga extends AppCompatActivity {
    EditText edtalas, edttinggi;
    Button btnhitungsegitiga;
    TextView tvhasilsegitiga;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatorsegitiga);
        edtalas = (EditText) findViewById(R.id.edt_alas);
        edttinggi = (EditText) findViewById(R.id.edt_tinggi);
        btnhitungsegitiga = (Button) findViewById(R.id.btn_hitungsegitiga);
        tvhasilsegitiga = (TextView) findViewById(R.id.tv_hasilsegitiga);
        btnhitungsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isikolom = false;
                if (TextUtils.isEmpty(edtalas.getText().toString())) {
                    isikolom = true;
                    edtalas.setError("Kolom tidak boleh kosong");
                }
                if (TextUtils.isEmpty(edttinggi.getText().toString())) {
                    isikolom = true;
                    edttinggi.setError("Kolom tidak boleh kosong");
                }
                if (!isikolom) {
                    hasil = Double.parseDouble(edtalas.getText().toString()) *
                            Double.parseDouble(edttinggi.getText().toString()) * 0.5;
                    tvhasilsegitiga.setText("Luas Segitga adalah =" + hasil);
                }
            }
        });
    }

}
