package br.com.gjsoftware.quickcash.domain.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Documents {
    @Size(max = 11)
    @NotNull(message = "CPF should be not null")
    @NotEmpty(message = "CPF should be not empty")
    private String cpf;

    @Size(max = 9)
    @NotNull(message = "RG should be not null")
    @NotEmpty(message = "RG should be not empty")
    private String rg;

    @Size(max = 5)
    @NotNull(message = "State of RG should be not null")
    @NotEmpty(message = "State of RG should be not empty")
    private String state;
}
