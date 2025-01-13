package com.ApnaNews.journalApp.service;

import com.ApnaNews.journalApp.entity.JournalEntry;
import com.ApnaNews.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;


    public void saveEntry(JournalEntry JournalEntry){
        journalEntryRepository.save(JournalEntry);
    }
}



//     Controller --> Service --> Repository