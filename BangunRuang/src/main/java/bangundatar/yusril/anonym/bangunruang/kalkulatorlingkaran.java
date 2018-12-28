package bangundatar.yusril.anonym.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulatorlingkaran extends AppCompatActivity {
    EditText edtjarijari, edtjarijari2,edtdiameter;
    Button btnhitung, btnhitung2;
    TextView tvhasil, tvhasil2;
    double hasil, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatorlingkaran);
        edtjarijari = (EditText) findViewById(R.id.edt_jarijari);
        edtjarijari2 = (EditText) findViewById(R.id.edt_jarijari2);
        btnhitung = (Button) findViewById(R.id.btn_hitunglingkaran);
        btnhitung2 = (Button) findViewById(R.id.btn_hitungkelilinglingkaran);
        tvhasil = (TextView) findViewById(R.id.tv_hasillingkaran);
        tvhasil2 = (TextView) findViewById(R.id.tv_hasilkelilinglingkaran);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isikolom = false;
                if (TextUtils.isEmpty(edtjarijari.getText().toString())) {
                    isikolom = true;
                    edtjarijari.setError("Kolom tidak boleh kosong");

                }
                if (!isikolom) {
                    hasil = Double.parseDouble(edtjarijari.getText().toString()) *
                            Double.parseDouble(edtjarijari.getText().toString()) * 3.14;
                    tvhasil.setText("Luas lingkaran adalah =" + hasil + " cm2");
                }
            }
        });
        btnhitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isikolom = false;
                if (TextUtils.isEmpty(edtjarijari2.getText().toString())) {
                    isikolom = true;
                    edtjarijari2.setError("Kolom tidak boleh kosong");


                }
                if (!isikolom) {
                    hasil2 = Double.parseDouble(edtjarijari2.getText().toString()) * 2 * 3.14;
                    tvhasil2.setText("Keliling lingkaran adalah =" + hasil2+" cm");
                }

            }
        });
    }

}
