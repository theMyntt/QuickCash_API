package br.com.gjsoftware.quickcash.core;

import org.springframework.http.ResponseEntity;

public interface IUseCaseService<Input, Output> {
    ResponseEntity<Output> run(Input dto);
}
