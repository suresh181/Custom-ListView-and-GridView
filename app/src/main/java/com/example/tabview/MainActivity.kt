package com.example.tabview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val viewPager = binding.viewPager
        viewPager.adapter = MyPagerViewer(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(viewPager)

    }
}