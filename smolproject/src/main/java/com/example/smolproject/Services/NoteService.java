package com.example.smolproject.Services;

import com.example.smolproject.Dao.NoteDao;
import com.example.smolproject.Domain.Note;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Service
public class NoteService {

    @Autowired
    private NoteDao noteDao;

    public void saveNote(Note note){
        noteDao.save(note);
    }

    public Note findById(Long id){
        return noteDao.findById(id).get();
    }

    public List<Note> findByTitle(String title){
        return noteDao.findByTitle(title);
    }

    public void delete(Note note) {
        noteDao.delete(note);
    }

    public void editBody(Long id, String body){
        Note note = noteDao.findById(id).get();
        note.setBody(body);
    }

    public Iterable<Note> getAllNotes(){
        return noteDao.findAll();
    }
}
