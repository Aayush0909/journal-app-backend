package com.example.demo.repository;

import com.example.demo.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {  // passing <> in this type of db schema and primary id type is

}
