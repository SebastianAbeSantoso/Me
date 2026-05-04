package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnGacha = view.findViewById<Button>(R.id.btnGacha)
        val btnList = view.findViewById<Button>(R.id.btnList)

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
                in 79..89-> R.id.character9Fragment
                else -> R.id.character10Fragment
            }

            findNavController().navigate(destination)
        }

        btnList.setOnClickListener {
            findNavController().navigate(R.id.characterListFragment)
        }
    }
}

