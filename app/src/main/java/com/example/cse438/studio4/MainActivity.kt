package com.example.cse438.studio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sql_studio.Database.Event
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var  eventList: ArrayList<Event> = ArrayList<Event>()
    private var eventViewModel : EventViewModel? = null
    public lateinit  var clearButton : Button
    public lateinit var addButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        viewPager?.adapter = adapter
        tabs.setupWithViewPager(viewPager)


    }
}
