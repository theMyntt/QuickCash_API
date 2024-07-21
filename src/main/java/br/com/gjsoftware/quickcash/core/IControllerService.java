package br.com.gjsoftware.quickcash.core;

import org.springframework.http.ResponseEntity;

public interface IControllerService<Input, Output> {
    ResponseEntity<Output> perform(Input dto);
}
