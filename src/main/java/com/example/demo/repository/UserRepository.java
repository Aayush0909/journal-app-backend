package com.example.demo.repository;


import com.example.demo.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {  // passing <> in this type of db schema and primary id type is
    User findByUserName(String username);
    void deleteByUserName(String username);
}
