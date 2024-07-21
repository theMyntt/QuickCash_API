package br.com.gjsoftware.quickcash.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String zipCode;
    private String country;
    private String state;
}
