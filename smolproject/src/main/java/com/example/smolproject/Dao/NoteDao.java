package com.example.smolproject.Dao;

import com.example.smolproject.Domain.Note;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDao extends CrudRepository<Note, Long> {
    List<Note> findByTitle(String title);
}
