package com.example.backend;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceImpl implements Service{

    private final Repository repository;

    @Override
    public List<Model> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Model> add(ModelDto modelDto) {
        return Optional.of(this.repository.save(new Model(modelDto.getRandomText())));
    }
}
