package com.project.attestationapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


lateinit var developersButton: Button
class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about, container, false)
        developersButton = view.findViewById(R.id.developers)
        developersButton.setOnClickListener {
            val googleLink = Uri.parse("https://github.com/shakirena/")
            val openBrowserIntent: Intent = Intent(Intent.ACTION_VIEW,googleLink)
            startActivity(openBrowserIntent)
        }

        return view
    }

}