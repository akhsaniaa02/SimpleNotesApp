package com.example.simplenotes.utils;

import com.example.simplenotes.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public int getNoteCount() {
        return notes.size();
    }
}

