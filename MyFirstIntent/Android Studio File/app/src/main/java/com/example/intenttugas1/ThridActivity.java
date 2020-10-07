package com.example.intenttugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class ThridActivity extends AppCompatActivity {
    TextView tvJurusan, tvSemester, tvIPK;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvJurusan = findViewById(R.id.tv_jurusan);
        tvSemester = findViewById(R.id.tv_semester;
        tvIPK = findViewById(R.id.tv_ipk);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String semester = getIntent().getStringExtra(MainActivity.EXTRA_SEMESTER);
        String IPK = getIntent().getStringExtra(MainActivity.EXTRA_IPK);

        if(TextUtils.isEmpty(nama)){
            tvJurusan.setText("Nama:");
        } else {
            tvJurusan.setText("Nama:"+nama);
        }

        if(TextUtils.isEmpty(semester)){
            tvSemester.setText("Semester:");
        } else {
            tvSemester.setText("Semester:"+semester);
        }

        if(TextUtils.isEmpty(semester)){
            tvIPK.setText("IPK:");
        } else {
            tvIPK.setText("IPK:"IPK);
        }
    }
}