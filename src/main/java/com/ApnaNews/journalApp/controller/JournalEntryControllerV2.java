package com.ApnaNews.journalApp.controller;


import com.ApnaNews.journalApp.entity.JournalEntry;
import com.ApnaNews.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
    return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry  createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
    return myEntry;
    }

    @GetMapping("id/{myId}")
    public Object getEntryById(@PathVariable("myId") ObjectId myId) {
        Optional<JournalEntry> byId = Optional.ofNullable((journalEntryService.findById(myId)));
        if (byId.isPresent()) {
            return new ResponseEntity<>(byId.get(),HttpStatus.OK).getBody();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteEntryById(@PathVariable Integer myId) {
    journalEntryService.deleteById(myId);
    return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntryById(@PathVariable("id") ObjectId id ,@RequestBody JournalEntry newEntry) {

        ObjectId myId = new ObjectId();
        JournalEntry old = journalEntryService.findById(id);
        if(old !=null){
            old.setTitle(newEntry.getTitle() !=null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent(newEntry.getContent() !=null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent()) );
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}
