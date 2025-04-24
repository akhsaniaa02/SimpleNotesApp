package com.example.simplenotes;

import com.example.simplenotes.model.Note;
import com.example.simplenotes.utils.NoteManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoteUnitTest {

    /* Test untuk memastikan bahwa catatan berhasil ditambahkan ke daftar */
    @Test
    public void testAddNote() {
        NoteManager manager = new NoteManager();
        Note note = new Note("Judul 1", "Isi catatan");
        manager.addNote(note);
        assertEquals(1, manager.getNoteCount());
    }

    /* Test untuk mengambil semua catatan yang telah ditambahkan */
    @Test
    public void testGetAllNotes() {
        NoteManager manager = new NoteManager();
        manager.addNote(new Note("Judul 1", "Isi 1"));
        manager.addNote(new Note("Judul 2", "Isi 2"));
        assertEquals("Judul 2", manager.getAllNotes().get(1).getTitle());
    }
}

