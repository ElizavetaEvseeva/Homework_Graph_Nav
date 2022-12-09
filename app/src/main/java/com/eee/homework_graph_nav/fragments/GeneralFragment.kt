package com.eee.homework_graph_nav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.eee.homework_graph_nav.R


class GeneralFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<Button>(R.id.btnf1)
        val button2 = view.findViewById<Button>(R.id.btnf2)
        val controller = findNavController()
        button1.setOnClickListener {controller.navigate(R.id.fragment1)}
        button2.setOnClickListener {controller.navigate(R.id.fragment2)}
    }




}