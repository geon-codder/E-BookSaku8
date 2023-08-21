package com.example.bukukelas8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bukukelas8.MainActivity
import com.example.bukukelas8.databinding.ActivityKelas8Binding

class Kelas8Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKelas8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelas8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBack8toHome.setOnClickListener{
                val intent = Intent(this@Kelas8Activity, MainActivity::class.java)
                startActivity(intent)
            }
            btnSBK813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "sbk")
                startActivity(intent)
            }
            btnAgama813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "pai")
                startActivity(intent)
            }
            btnBhsIndo813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "bindo")
                startActivity(intent)
            }
            btnIPA8S113.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "ipa1")
                startActivity(intent)
            }
            btnIPA8S213.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "ipa2")
                startActivity(intent)
            }
            btnIPS813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "ips")
                startActivity(intent)
            }
            btnBhsIng813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "bing")
                startActivity(intent)
            }
            btnMTK8S113.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "mtk1")
                startActivity(intent)
            }
            btnMTK8S213.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "mtk2")
                startActivity(intent)
            }
            btnPKN813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "pkn")
                startActivity(intent)
            }
            btnPenjaskes813.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "penjas")
                startActivity(intent)
            }
            btnPrakarya8S113.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "prakarya1")
                startActivity(intent)
            }
            btnPrakarya8S213.setOnClickListener {
                val intent = Intent(this@Kelas8Activity, PdfViewActivity::class.java)
                intent.putExtra("TitleBook8", "prakarya2")
                startActivity(intent)
            }
        }
    }
}