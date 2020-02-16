package com.example.tugas2_konverter_matematis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btSin, btCos, btTan, btCsc, btSec, btCot, btLog;
    private TextView tvOut;
    private EditText etIn;
    private double masukan,konvert;
    private String sHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSin = findViewById(R.id.btSin);
        btCos = findViewById(R.id.btCos);
        btTan = findViewById(R.id.btTan);
        btCsc = findViewById(R.id.btCsc);
        btSec = findViewById(R.id.btSec);
        btCot = findViewById(R.id.btCot);
        btLog = findViewById(R.id.btLog);
        etIn = findViewById(R.id.etIn);
        tvOut = findViewById(R.id.tvOut);

        btSin.setOnClickListener(this);
        btCos.setOnClickListener(this);
        btTan.setOnClickListener(this);
        btCsc.setOnClickListener(this);
        btSec.setOnClickListener(this);
        btCot.setOnClickListener(this);
        btLog.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try {

            String sInput = etIn.getText().toString();
            this.masukan = Double.parseDouble(sInput);

        } catch (NumberFormatException nfe) {
            Toast.makeText(getApplicationContext(), "Input Angka", Toast.LENGTH_SHORT).show();
        }

        switch (v.getId()) {

            case R.id.btSin:

                this.konvert = Math.sin(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btCos:

                this.konvert = Math.cos(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btTan:

                this.konvert = Math.tan(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btSec:

                this.konvert = 1/Math.cos(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btCsc:

                this.konvert = 1/Math.sin(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btCot:

                this.konvert = 1/Math.tan(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            case R.id.btLog:
                this.konvert = Math.log10(this.masukan);
                this.sHasil = String.format("%.7f", this.konvert);
                tvOut.setText(this.sHasil);
                break;

            default:
                break;
        }
    }
}
