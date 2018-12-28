package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class persegi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

    }
    public void hitungpersegi (View view){
        Intent intent = new Intent(persegi.this,kalkulatorpersegi.class);
        startActivity(intent);
    }
}
