package com.ApnaNews.journalApp.repository;

import com.ApnaNews.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, Integer> {

    public JournalEntry findById(String objectId);
}
