package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {


    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull  // it is of lombok , it checks nonNull in setters func()
    private String userName;
    @NonNull
    private String password;

    @DBRef // linking the reference of journalEntries
    private List<JournalEntry> journalEntries = new ArrayList<>();
    private List<String> roles;
}
