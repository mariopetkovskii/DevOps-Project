package com.example.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Model, Long> {


}
