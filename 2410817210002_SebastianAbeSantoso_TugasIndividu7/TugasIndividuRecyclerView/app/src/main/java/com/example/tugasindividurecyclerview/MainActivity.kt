package com.example.tugasindividurecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasindividurecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf(
            ItemModel(1, "Item Pertama", "Deskripsi Item Pertama", R.drawable.ic_launcher_foreground),
            ItemModel(2, "Item Kedua", "Deskripsi Item Kedua", R.drawable.ic_launcher_foreground),
            ItemModel(3, "Item Ketiga", "Deskripsi Item Ketiga", R.drawable.ic_launcher_foreground),
            ItemModel(4, "Item Keempat", "Deskripsi Item Keempat", R.drawable.ic_launcher_foreground),
            ItemModel(5, "Item Kelima", "Deskripsi Item Kelima", R.drawable.ic_launcher_foreground)
        )

        val adapter = ItemAdapter(items)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}