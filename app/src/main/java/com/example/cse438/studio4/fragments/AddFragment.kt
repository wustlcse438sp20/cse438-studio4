package com.example.cse438.studio4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.example.sql_studio.Database.Event
import com.example.cse438.studio4.EventViewModel

import com.example.sql_studio.R
import kotlinx.android.synthetic.main.fragment_add.*

class AddFragment : Fragment() {
    private var eventViewModel : EventViewModel? = null
    public lateinit var createEventButton : Button
    public lateinit var inputText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //set the view model
        eventViewModel = ViewModelProvider(this).get(EventViewModel::class.java)

        //set the buttons and text
        createEventButton = create_event_button
        inputText = event_text_input

        //TODO #8 Implement the functionality for the add button
    }

}
