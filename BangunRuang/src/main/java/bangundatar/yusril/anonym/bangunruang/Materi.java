package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
    }
    public void muatanlistrik (View view){
        Intent intent = new Intent(Materi.this,persegi.class);
        startActivity(intent);
    }
    public void kuatarus (View view){
        Intent intent = new Intent(Materi.this,segitiga.class);
        startActivity(intent);
    }
    public void lingkaran (View view){
        Intent intent = new Intent(Materi.this,lingkaran.class);
        startActivity(intent);
    }
    public void persegipanjang (View view){
        Intent intent = new Intent(Materi.this,persegipanjang.class);
        startActivity(intent);
    }

}
