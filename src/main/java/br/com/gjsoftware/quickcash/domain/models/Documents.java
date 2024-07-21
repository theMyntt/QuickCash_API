package br.com.gjsoftware.quickcash.domain.models;

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
    private String cpf;

    @Size(max = 9)
    private String rg;

    @Size(max = 5)
    private String state;
}
