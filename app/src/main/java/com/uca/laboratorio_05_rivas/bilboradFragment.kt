package com.uca.laboratorio_05_rivas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class bilboradFragment : Fragment() {
    private lateinit var actionToMovie: FloatingActionButton



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bilborad, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actionToMovie = view.findViewById(R.id.action_to_movie)

        actionToMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_bilboradFragment_to_movieFragment)
        }
    }


}