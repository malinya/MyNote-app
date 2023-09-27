package com.example.mynote.mvvm

import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.example.mynote.db.NotesDao
import com.example.mynote.db.Notes


class NotesRepository(val dao : NotesDao) {

    // display all notes

    fun allnotes() : LiveData<List<Notes>> {

        return dao.getAllNotes()

    }

    // insert note

    suspend fun insertNote(notes: Notes){
        dao.insertNotes(notes)
    }

    suspend fun updateNotes(notes: Notes) {
        dao.updateNotes(notes)
    }




    suspend fun deleteNote(notes: Notes){
        dao.deleteNotes(notes)
    }



    suspend fun deleteAll(){
        dao.deleteAll()
    }
}