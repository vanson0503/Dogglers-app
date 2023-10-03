package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHorizontalList.setOnClickListener {
            val intent = Intent(this,HorizontalListActivity::class.java)
            startActivity(intent)
        }
        binding.btnVerticalList.setOnClickListener {
            val intent = Intent(this,VerticalListActivity::class.java)
            startActivity(intent)
        }
        binding.btnGridList.setOnClickListener {
            val intent = Intent(this,GridListActivity::class.java)
            startActivity(intent)
        }
    }
}