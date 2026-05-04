package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class CharacterListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_character_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.char1).setOnClickListener {
            findNavController().navigate(R.id.character1Fragment)
        }

        view.findViewById<Button>(R.id.char2).setOnClickListener {
            findNavController().navigate(R.id.character2Fragment)
        }

        view.findViewById<Button>(R.id.char3).setOnClickListener {
            findNavController().navigate(R.id.character3Fragment)
        }

        view.findViewById<Button>(R.id.char4).setOnClickListener {
            findNavController().navigate(R.id.character4Fragment)
        }

        view.findViewById<Button>(R.id.char5).setOnClickListener {
            findNavController().navigate(R.id.character5Fragment)
        }

        view.findViewById<Button>(R.id.char6).setOnClickListener {
            findNavController().navigate(R.id.character6Fragment)
        }
        view.findViewById<Button>(R.id.char7).setOnClickListener {
            findNavController().navigate(R.id.character7Fragment)
        }
        view.findViewById<Button>(R.id.char8).setOnClickListener {
            findNavController().navigate(R.id.character8Fragment)
        }

        view.findViewById<Button>(R.id.char9).setOnClickListener {
            findNavController().navigate(R.id.character9Fragment)
        }

        view.findViewById<Button>(R.id.char10).setOnClickListener {
            findNavController().navigate(R.id.character10Fragment)
        }
    }
}

