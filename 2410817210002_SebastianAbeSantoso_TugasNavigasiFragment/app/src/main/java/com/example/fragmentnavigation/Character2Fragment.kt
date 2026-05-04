package com.example.fragmentnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Character2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_character2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnGacha = view.findViewById<Button>(R.id.btnGachaAgain)
        val btnHome = view.findViewById<Button>(R.id.btnHome)

        btnGacha.setOnClickListener {
            val random = (1..100).random()

            val destination = when (random) {
                in 1..2 -> R.id.character1Fragment
                in 3..12 -> R.id.character2Fragment
                in 13..23 -> R.id.character3Fragment
                in 24..34 -> R.id.character4Fragment
                in 35..45 -> R.id.character5Fragment
                in 46..56 -> R.id.character6Fragment
                in 57..67 -> R.id.character7Fragment
                in 68..78 -> R.id.character8Fragment
                in 79..89 -> R.id.character9Fragment
                else -> R.id.character10Fragment
            }

            findNavController().navigate(destination)
        }

        btnHome.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
    }
}