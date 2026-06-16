package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.network.CoffeeRepository
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val repository = CoffeeRepository()

    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tvResult)

        lifecycleScope.launch {
            try {
                val response = repository.getCoffeeMenu()

                val text = buildString {
                    appendLine("Message: ${response.message}")
                    appendLine("Code: ${response.code}")
                    appendLine()
                    appendLine("My Kopi GW Menu:")
                    appendLine()

                    response.data.forEach {
                        appendLine("${it.id}. ${it.name}")
                        appendLine("Type: ${it.type}")
                        appendLine("Price: Rp${it.price}")
                        appendLine()
                    }
                }

                tvResult.text = text

            } catch (e: Exception) {
                tvResult.text = "Error: ${e.message}"
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}