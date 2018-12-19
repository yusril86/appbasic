package com.example.anonym.BangunRuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulatorlingkaran extends AppCompatActivity {
EditText edtjarijari;
Button btnhitung;
TextView tvhasil;
double hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatorlingkaran);
    edtjarijari = (EditText) findViewById(R.id.edt_jarijari);
    btnhitung = (Button)findViewById(R.id.btn_hitunglingkaran);
    tvhasil = (TextView) findViewById(R.id.tv_hasillingkaran);
 btnhitung.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         boolean isikolom = false;
         if (TextUtils.isEmpty(edtjarijari.getText().toString())){
             isikolom = true ;
             edtjarijari.setError("Kolom tidak boleh kosong");
         }
         if (!isikolom){
             hasil = Double.parseDouble(edtjarijari.getText().toString()) *
                     Double.parseDouble(edtjarijari.getText().toString()) * 3.14 ;
             tvhasil.setText("Luas lingkaran adalah =" + hasil+ "m2");
         }
     }
 });
    }

}
