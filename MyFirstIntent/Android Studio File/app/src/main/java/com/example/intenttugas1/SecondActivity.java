package com.example.intenttugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvNama, tvInstitusi;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        btnKirim = findViewById(R.id.btn_kirim);
        btnKirim.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if(TextUtils.isEmpty(nama)){
            tvNama.setText("Nama:");
        } else {
            tvNama.setText("Nama:"+nama);
        }

        if(TextUtils.isEmpty(institusi)){
            tvInstitusi.setText("Institusi:");
        } else {
            tvInstitusi.setText("Institusi:"+institusi);
        }

        @Override
        public void onClick(View Thread view;
        view) {
            switch(view.getId()){
                case R.id.btn_kirim;
                btnKirim;
                    break;
            }

        }

        private void Kirim() {
            Intent moveIntentWithoutData = new Intent(SecondActivity.this,ThridActivity.class);
            startActivity(moveIntentWithoutData);
        }
    }
}