package com.example.anonym.BangunRuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulatorpersegi extends AppCompatActivity {
    EditText edtsisi1, edtsisi2, edtsisi3;
    Button btnhitung, btnhitung2;
    TextView tvhasil, tvhasil2;
    int hasil, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatorpersegi);
        edtsisi1 = (EditText) findViewById(R.id.edt_sisi1);
        edtsisi2 = (EditText) findViewById(R.id.edt_sisi2);
        edtsisi3 = (EditText) findViewById(R.id.edt_sisi3);
        btnhitung = (Button) findViewById(R.id.btn_hitungpersegi);
        btnhitung2 = (Button) findViewById(R.id.btn_hitungkelilingpersegi);
        tvhasil = (TextView) findViewById(R.id.tv_hasilpersegi);
        tvhasil2 = (TextView) findViewById(R.id.tv_hasilkelilingpersegi);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(edtsisi1.getText().toString())) {
                    isEmptyFields = true;
                    edtsisi1.setError("Kolom tidak boleh kosong");
                }
                if (TextUtils.isEmpty(edtsisi2.getText().toString())) {
                    isEmptyFields = true;
                    edtsisi2.setError("Kolom tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    hasil = Integer.parseInt(edtsisi1.getText().toString()) * Integer.parseInt(edtsisi2.getText().toString());
                    tvhasil.setText("luas persegi adalah =" + hasil + "cm2");
                }

            }
        });

        btnhitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(edtsisi3.getText().toString())) {
                    isEmptyFields = true;
                    edtsisi3.setError("Kolom tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    keliling = Integer.parseInt(edtsisi3.getText().toString()) * 4;
                    tvhasil2.setText("Keliling persegi adalah =" + keliling + "cm");
                }
            }
        });

    }


}
