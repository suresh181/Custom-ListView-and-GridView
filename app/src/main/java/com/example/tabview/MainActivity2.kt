package com.example.tabview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name= intent.getStringExtra("name")
        val image= intent.getIntExtra("image",R.drawable.msdhoni)

        binding.title.text = name
        binding.ivImg.setImageResource(image)
    }
}