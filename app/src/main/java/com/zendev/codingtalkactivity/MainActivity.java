package com.zendev.codingtalkactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtUts, edtUas;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUts = findViewById(R.id.edt_uts);
        edtUas = findViewById(R.id.edt_uas);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_hitung){
            String inputUts = edtUts.getText().toString();
            String inputUas = edtUas.getText().toString();

            if(inputUts.length() == 0){
                edtUts.setError("Tidak Boleh Kosong");
            }
            if(inputUas.length() == 0){
                edtUas.setError("Tidak Boleh Kosong");
            }else{
                int uts = Integer.parseInt(inputUts);
                int uas = Integer.parseInt(inputUas);

                int hasil = (uts + uas) / 2;

                tvHasil.setText(String.valueOf(hasil));
            }
        }
    }

}
