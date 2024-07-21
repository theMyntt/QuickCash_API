package br.com.gjsoftware.quickcash.core;

public interface IControllerService<Input, Output> {
    Output perform(Input dto);
}
