package com.example.backend;

import java.util.List;
import java.util.Optional;

public interface Service {
    List<Model> findAll();

    Optional<Model> add(ModelDto modelDto);
}
