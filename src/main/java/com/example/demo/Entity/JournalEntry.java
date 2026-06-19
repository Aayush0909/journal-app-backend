package com.example.demo.Entity;
// its Data Model

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

//The @Document annotation designates a Java class as an entity that maps directly to a document in a NoSQL database collection.
//@Getter
//@Setter
@Document(collection = "journal_entries")
@Data               // common annotation for both getter & setter.
@NoArgsConstructor

public class JournalEntry {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;


    @JsonProperty("id")
    public String getIdAsString() {
        return id != null ? id.toHexString() : null;
    }



}
//you’re building a Journal App, where each user can write notes or journal entries.
//You need to save those entries in a database — MySQL, for example.

//Now, Spring Boot (through JPA / Hibernate) allows you to map your Java class directly to a database table.
//
//That’s what the Entity is for.