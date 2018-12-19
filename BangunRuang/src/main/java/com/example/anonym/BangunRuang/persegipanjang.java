package com.example.anonym.BangunRuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class persegipanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

    }
    public void  hitungpersegipanjang (View view){
        Intent intent = new Intent(persegipanjang.this,kalkulatorpersegipanjang.class);
        startActivity(intent);
    }
}
