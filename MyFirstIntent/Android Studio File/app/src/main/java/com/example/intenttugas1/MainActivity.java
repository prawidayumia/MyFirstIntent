package com.example.intenttugas1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_IPK ;
    public static final String EXTRA_SEMESTER ;
    EditText edNama, edInstitusi;
    Button btnPindahTanpaData, btnPindahDenganData;

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_INSTITUSI = "extra_nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.ed_nama);
        edInstitusi = findViewById(R.id.ed_institusi);

        btnPindahTanpaData = findViewById(R.id.btn_tanpa_data);
        btnPindahDenganData = findViewById(R.id.btn_dengan_data);

        btnPindahTanpaData.setOnClickListener(this);
        btnPindahDenganData.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_dengan_data;
                pindahDenganData();
                break;
            case R.id.btn_tanpa_data;
                pindahTanpaData();
        }

    }

    private void pindahDenganData() {
        String nama = edNama.getText().toString().trim();
        String institusi = edInstitusi.getText().toString().trim();

        Intent moveIntentWithData = new Intent(MainActivity.this, SecondActivity.class);

        moveIntentWithData.putExtra(EXTRA_NAMA, nama);
        moveIntentWithData.putExtra(EXTRA_INSTITUSI);

        startActivity(moveIntentWithData);
    }

    private void pindahTanpaData() {
        Intent moveIntentWithoutData = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(moveIntentWithoutData);
    }

}