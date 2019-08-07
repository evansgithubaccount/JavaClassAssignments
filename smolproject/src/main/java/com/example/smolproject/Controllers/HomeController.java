package com.example.smolproject.Controllers;

import com.example.smolproject.Domain.Note;
import com.example.smolproject.Services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("notes", noteService.getAllNotes());
        return "home";
    }

    @PostMapping("/addPost")
    public String addNote(Note note){
        noteService.saveNote(note);
        return "home";
    }

}
