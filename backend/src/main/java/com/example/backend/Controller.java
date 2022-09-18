package com.example.backend;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class Controller {

    private final Service service;

    @GetMapping
    private List<Model> listAll(){
        return this.service.findAll();
    }

    @PostMapping
    private ResponseEntity<Model> add(@RequestBody ModelDto modelDto){
        return this.service.add(modelDto)
                .map(model -> ResponseEntity.ok().body(model))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
