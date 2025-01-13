package com.ApnaNews.journalApp.repository;

import com.ApnaNews.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository <JournalEntry, String> {
}
