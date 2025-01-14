package com.ApnaNews.journalApp.repository;

import com.ApnaNews.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, Integer> {


    Optional<JournalEntry> findById(String objectId);


}
