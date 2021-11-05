package com.example.eriarahmadani

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
class DetailActivity {
    class DetailActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_detail)
            //actionbar
            val actionbar = supportActionBar
            //set actionbar title
            actionbar!!.title = "Teknologi"
            //set back button
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)

            imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.samsung))
            textViewNamaDetail.text = intent.getStringExtra("nama")
            textViewdeskripsiDetail.text = intent.getStringExtra("deskripsi")
            textViewKetDetail.text = intent.getStringExtra("keterangan")

        }
        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }

    }
}