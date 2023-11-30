package com.example.aplikasipertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi Komponen

        var edTglLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnklik = findViewById<Button>(R.id.btn_klik)
        var tvhasil = findViewById<TextView>(R.id.tv_hasil)

        btnklik.setOnClickListener{
            val input = edTglLahir.text.toString()
            val hasil = when (input.toInt()){
                in 1946..1964 -> "Baby Booming"
                in 1965..1980 -> "X"
                in 1981..1999 -> "Milenial"
                in 2000..2010 -> "Z"
                else -> "Aku Gatau Mas"
            }
            tvhasil.text = "Kamu Generasi $hasil"
        }

    }
}