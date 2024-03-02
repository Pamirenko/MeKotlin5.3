package com.example.mekotlin53.data.localRoom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mekotlin53.data.localRoom.entities.Note


@Dao
interface NoteDao {
    @Query("SELECT * FROM  note_table")
    fun getAllNotes(): List<Note>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(note: Note)

    @Update
    fun updateNote(note: Note)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNotes(notes: List<Note> )

    @Delete
    fun deleteNote(note: Note)

    @Query("DELETE FROM note_table")
    fun clear()


}