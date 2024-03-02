package com.example.mekotlin53.data.localRoom

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mekotlin53.data.localRoom.dao.NoteDao
import com.example.mekotlin53.data.localRoom.entities.Note

@Database(entities = [Note::class], version = 2, exportSchema = false)

abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}