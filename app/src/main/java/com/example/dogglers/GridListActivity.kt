package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    lateinit var binding:ActivityGridListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gvList.layoutManager = GridLayoutManager(this,2,RecyclerView.VERTICAL,false)
        binding.gvList.adapter = DogCardAdapter(this,Layout.GRID)
    }
}