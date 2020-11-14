package com.example.android.devbyteviewer.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.android.devbyteviewer.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    var ftag = "f1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        childFragmentManager.beginTransaction().add(R.id.frameContainer,NestedFragmentOne()).addToBackStack("F1").commit()

        view.findViewById<Button>(R.id.button_first).setOnClickListener {


            childFragmentManager.beginTransaction().replace(R.id.frameContainer,NestedFragmentTwo())
                    .addToBackStack("F2")
                    .commit()
        }
    }

    fun onBackPress():Boolean{
        if(childFragmentManager.backStackEntryCount >1){

            childFragmentManager.popBackStack()
            return true
        }else{
            return false
        }


    }
}