package id.sch.smktelkom_mlg.tugas01.xirpl2014.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Spinner spTujuan, spBerangkat;
    CheckBox cbDws, cbAnk, cbDsbl;
    RadioButton rbK1, rbK2, rbK3;
    EditText etNama, etNo, etTanggal;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doClick();
            }
        });

        spTujuan = (Spinner) findViewById(R.id.spinnerTujuan);
        spBerangkat = (Spinner) findViewById(R.id.spinnerKeberangkatan);

        cbDws = (CheckBox) findViewById(R.id.checkBoxDws);
        cbAnk = (CheckBox) findViewById(R.id.checkBoxAnk);
        cbDsbl = (CheckBox) findViewById(R.id.checkBoxDsbl);

        rbK1 = (RadioButton) findViewById(R.id.radioButtonKA1);
        rbK2 = (RadioButton) findViewById(R.id.radioButtonKA2);
        rbK3 = (RadioButton) findViewById(R.id.radioButtonKA3);

        etNama = (EditText) findViewById(R.id.editText);
        etNo = (EditText) findViewById(R.id.editText2);
        etTanggal = (EditText) findViewById(R.id.editText3);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

    }

    private void doClick()
    {
        String nama = etNama.getText().toString();
        int nomor = Integer.parseInt(etNo.getText().toString());
        String tanggal = etTanggal.getText().toString();

        tvHasil.setText("Anda telah memesan tiket atas nama " + nama + " dengan nomor identitas"
                + nomor + " tujuan Stasiun " + spTujuan.getSelectedItem().toString() + " dari Stasiun " + spBerangkat.getSelectedItem().toString()
                + " pada tanggal " + tanggal + " dengan jumlah tiket sebanyak ");
    }

}