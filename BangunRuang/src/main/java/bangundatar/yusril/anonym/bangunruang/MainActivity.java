package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void materi(View view) {
        Intent intent = new Intent(MainActivity.this, Materi.class);
        startActivity(intent);
    }
public void quiz (View view){
        Intent intent = new Intent(MainActivity.this,Quiz.class);
        startActivity(intent);
}
public void about (View view){
        Intent intent = new Intent(MainActivity.this,About.class);
        startActivity(intent);
}

}
