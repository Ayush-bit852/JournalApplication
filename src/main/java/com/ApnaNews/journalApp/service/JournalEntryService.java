package com.ApnaNews.journalApp.service;

import com.ApnaNews.journalApp.entity.JournalEntry;
import com.ApnaNews.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private  JournalEntryRepository journalEntryRepository;


    public void saveEntry(JournalEntry JournalEntry){
        journalEntryRepository.save(JournalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public  JournalEntry findById(ObjectId id){

        return journalEntryRepository.findById(id.toString());
    }

    public void deleteById(Integer id){
        journalEntryRepository.deleteById(id);
    }
}



//     Controller --> Service --> Repository