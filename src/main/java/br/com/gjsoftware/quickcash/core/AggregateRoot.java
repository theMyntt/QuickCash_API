package br.com.gjsoftware.quickcash.core;

import lombok.Data;

import java.util.Date;

@Data
public class AggregateRoot {
    protected String _id;
    protected Date createdAt;
    protected Date updatedAt;
}
