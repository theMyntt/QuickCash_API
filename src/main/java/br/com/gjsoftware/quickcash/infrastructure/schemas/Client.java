package br.com.gjsoftware.quickcash.infrastructure.schemas;

import br.com.gjsoftware.quickcash.domain.enums.Gender;
import br.com.gjsoftware.quickcash.domain.models.Address;
import br.com.gjsoftware.quickcash.domain.models.Documents;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Client {
    @Id
    private String _id;
    private String name;
    private String email;
    private String password;
    private double Money;
    private Gender gender;
    private Documents documents;
    private Address address;
}
