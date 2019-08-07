package com.example.smolproject.Dao;

import com.example.smolproject.Domain.Note;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteDaoTwo {
    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note){
        notes.add(note);
    }

    public void deleteNote(Note note){
        notes.remove(note);
    }

    public Note getNoteById(Long id){
        for(Note note : notes){
            if(note.getId().equals(id)){
                return note;
            }
        }
        return null;
    }

    public List<Note> getAllNotes(){
        return notes;
    }
}
