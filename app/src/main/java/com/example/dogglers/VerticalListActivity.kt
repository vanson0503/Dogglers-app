package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    lateinit var binding: ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvVeticalView.adapter = DogCardAdapter(this,Layout.VERTICAL)
        binding.rvVeticalView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}