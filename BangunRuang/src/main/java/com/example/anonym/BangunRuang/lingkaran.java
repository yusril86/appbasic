package com.example.anonym.BangunRuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lingkaran extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
    }
    public void hitunglingkaran (View view){
        Intent intent = new Intent(lingkaran.this,kalkulatorlingkaran.class);
        startActivity(intent);
    }
}
