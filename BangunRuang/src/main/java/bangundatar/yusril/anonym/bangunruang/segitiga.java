package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
    }
    public void hitungsegitiga (View view){
        Intent intent = new Intent(segitiga.this,kalkulatorsegitiga.class);
        startActivity(intent);
    }
}
