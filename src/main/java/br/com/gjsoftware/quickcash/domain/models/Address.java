package br.com.gjsoftware.quickcash.domain.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotNull(message = "Street should be not null")
    @NotEmpty(message = "Street should be not empty")
    private String street;

    @NotNull(message = "Zip Code should be not null")
    @NotEmpty(message = "Zip Code should be not empty")
    private String zipCode;

    @NotNull(message = "Country should be not null")
    @NotEmpty(message = "Country should be not empty")
    private String country;

    @NotNull(message = "State should be not null")
    @NotEmpty(message = "State should be not empty")
    private String state;
}
