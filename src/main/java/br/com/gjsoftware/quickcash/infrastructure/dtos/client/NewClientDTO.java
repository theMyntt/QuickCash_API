package br.com.gjsoftware.quickcash.infrastructure.dtos.client;

import br.com.gjsoftware.quickcash.domain.enums.EGender;
import br.com.gjsoftware.quickcash.domain.models.Address;
import br.com.gjsoftware.quickcash.domain.models.Documents;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewClientDTO {
    @NotNull(message = "Name should be not null")
    @NotEmpty(message = "Name should be not empty")
    @Size(min = 2, message = "Name should have more than 2 chars")
    @Schema(example = "John Doe")
    private String name;

    @NotNull(message = "Email should be not null")
    @NotEmpty(message = "Email should be not empty")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Email should be valid")
    @Schema(example = "johndoe@example.com")
    private String email;

    @NotNull(message = "Password should be not null")
    @NotEmpty(message = "Password should be not empty")
    @Size(min = 2, message = "Password should have more than 8 chars")
    @Schema(example = "12345678")
    private String password;

    @NotNull
    private Date birthDate;

    @NotNull(message = "Gender should be not null")
    private EGender gender;

    @NotNull(message = "Documents should be not null")
    private Documents documents;

    @NotNull(message = "Address should be not null")
    private Address address;
}
