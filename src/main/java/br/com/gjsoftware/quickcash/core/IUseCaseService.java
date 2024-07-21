package br.com.gjsoftware.quickcash.core;

public interface IUseCaseService<Input, Output> {
    Output run(Input dto);
}
