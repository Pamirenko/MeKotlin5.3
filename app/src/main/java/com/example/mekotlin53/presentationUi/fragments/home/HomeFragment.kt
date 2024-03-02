package com.example.mekotlin53.presentationUi.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mekotlin53.R
import com.example.mekotlin53.data.localRoom.entities.Note
import com.example.mekotlin53.data.models.App
import com.example.mekotlin53.databinding.FragmentHomeBinding
import com.example.mekotlin53.presentationUi.adapters.NoteAdapter

class HomeFragment : Fragment() {
    private lateinit var biding: FragmentHomeBinding
    private val noteAdapter = NoteAdapter(::onLongItemClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        biding = FragmentHomeBinding.inflate(layoutInflater)
        return biding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
    }

    private fun initialize() {
        val noteList= App.db.noteDao().getAllNotes()
        biding.rvNotes.adapter = noteAdapter
    }

    private fun setupListeners() {
        biding.btnAddNote.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addNoteFragment)
        }
    }
    private fun onLongItemClick(position:Int, note: Note){
        App.db.noteDao().deleteNote(note)
        noteAdapter.setNoteList(position)

    }
}