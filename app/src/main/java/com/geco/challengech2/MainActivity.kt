package com.geco.challengech2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var gojekbutton: Button
    private lateinit var shopeebutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gojekbutton = findViewById(R.id.buttongojek)
        shopeebutton = findViewById(R.id.buttonshopee)

        gojekbutton.setOnClickListener {
            val intent = Intent(this, GojekActivity::class.java)

            startActivity(intent)
        }

        shopeebutton.setOnClickListener {
            val intent = Intent(this, ShopeeActivity::class.java)

            startActivity(intent)
        }


    }
}