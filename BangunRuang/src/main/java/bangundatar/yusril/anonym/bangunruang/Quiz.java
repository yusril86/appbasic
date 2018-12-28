package bangundatar.yusril.anonym.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //Pertanyaan quiz
    String[] pertanyaan_kuis = new String[]{
            "1. Jika terdapat sebuah Tempat yg mempunyai Bentuk Persegi dan tempat tersebut memiliki Sisi 10 m, maka berapakah Luas tempat tersebut ?",
            "2. Jika diketahui panjang sisi a = 7 cm \n sisi b= 8 cm \n sisi c = 9 cm dan \n tinggi segitiga = 6 cm. tentukan luas segitiga tersebut !",
            "3. Sebuah lingkaran memiliki jari-jari sebesar 10 cm. Berapakah luas lingkaran tersebut?",
            "4. Sebuah lapangan bola mempunyai panjang 15cm dan lebar 10cm hitunglah luas lapangan tersebut ?",
            "5. Sebuah lapangan bola mempunyai panjang 15 m dan lebar 10 m hitunglah Keliling lapangan tersebut ?"
    };

    //Pilihan Jawaban
    String[] pilihan_jawaban = new String[]{
            "5 m2","40 m2","100 m2","20 m2",
            "24 cm2","28 cm2","21 cm2","10 cm2",
            "314 cm2","123 cm2","456 cm2","0,54 cm2",
            "120 cm2","15 cm2","150 cm2","115 cm2",
            "25 cm","150 cm","50 cm2","50 m",
    };

    // Jawaban yang benar
    String[] jawaban_benar = new String[]{
            "100 m2",
            "21 cm2",
            "314 cm2",
            "150 cm2",
            "50 m",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        pertanyaan = (TextView)findViewById(R.id.pertanyaan);
        rg = (RadioGroup)findViewById(R.id.radio_group);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view){
        if(PilihanA.isChecked()||PilihanB.isChecked()||PilihanC.isChecked()||PilihanD.isChecked()){
            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if(ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
            else salah++;
            nomor++;
            if(nomor<pertanyaan_kuis.length){
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor*4)+0]);
                PilihanB.setText(pilihan_jawaban[(nomor*4)+1]);
                PilihanC.setText(pilihan_jawaban[(nomor*4)+2]);
                PilihanD.setText(pilihan_jawaban[(nomor*4)+3]);
            } else{
                hasil=benar * 20;
                Intent selesai = new Intent(getApplicationContext(),hasilquiz.class);
                startActivity(selesai);

            }
        }
        else {
            Toast.makeText( this, "Pilih Jawaban dulu",Toast.LENGTH_SHORT).show();
        }
    }
}