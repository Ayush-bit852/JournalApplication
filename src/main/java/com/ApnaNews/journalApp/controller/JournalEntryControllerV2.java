package com.ApnaNews.journalApp.controller;


import com.ApnaNews.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll() {
    return null;
    }

    @PostMapping
    public boolean  createEntry(@RequestBody JournalEntry myentry) {
    return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId) {
    return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId) {
    return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntryById(@PathVariable Long id ,@RequestBody JournalEntry myEntry) {
    return null;
    }
}
