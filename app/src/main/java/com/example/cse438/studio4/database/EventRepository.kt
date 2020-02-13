package com.example.cse438.studio4.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.CoroutineScope

//TODO #6 Review this code and make sure you understand what it is doing

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class EventRepository(private val eventDao: EventDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allEvents: LiveData<List<Event>> = eventDao.getAlphabetizedEvents()

    fun insert(event: Event){
        CoroutineScope(Dispatchers.IO).launch {
            eventDao!!.insert(event)
        }
    }

    fun clear(){
        CoroutineScope(Dispatchers.IO).launch {
            eventDao!!.deleteAll()
        }
    }
}