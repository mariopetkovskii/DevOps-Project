package com.example.backend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Model implements Serializable {
    @Id
    private String id;

    private String randomText;

    public Model(String randomText) {
        this.randomText = randomText;
    }
}
