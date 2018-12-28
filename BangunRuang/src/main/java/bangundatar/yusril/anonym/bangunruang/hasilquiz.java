package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilquiz);

        TextView hasil = (TextView) findViewById(R.id.tv_hasilquiz);
        TextView nilai = (TextView)findViewById(R.id.tv_nilai);

        hasil.setText("Jawaban anda benar : " + Quiz.benar + "\n Jawaban anda Salah : " + Quiz.salah );
        nilai.setText("" + Quiz.hasil);
    }
    public void  ulangiquiz (View view){
        finish();
        Intent i = new Intent(getApplicationContext(),Quiz.class);
        startActivity(i);
    }
    public void back (View view){
        Intent intent = new Intent(hasilquiz.this,Materi.class);
        startActivity(intent);
    }
}
