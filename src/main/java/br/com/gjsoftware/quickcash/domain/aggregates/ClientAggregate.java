package br.com.gjsoftware.quickcash.domain.aggregates;

import br.com.gjsoftware.quickcash.domain.enums.Gender;
import br.com.gjsoftware.quickcash.domain.models.Address;
import br.com.gjsoftware.quickcash.domain.models.Documents;
import lombok.Data;

import java.util.Date;

@Data
public class ClientAggregate {
    private String _id;
    private String name;
    private String email;
    private String password;
    private double money;
    private Gender gender;
    private Date birthDate;
    private Documents documents;
    private Address address;
    private Date createdAt;
    private Date updatedAt;

    public ClientAggregate(
            String name,
            String email,
            String password,
            double money,
            Gender gender,
            Date birthDate,
            Documents documents,
            Address address
    ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.money = money;
        this.gender = gender;
        this.birthDate = birthDate;
        this.documents = documents;
        this.address = address;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public ClientAggregate(
            String _id,
            String name,
            String email,
            String password,
            double money,
            Gender gender,
            Date birthDate,
            Documents documents,
            Address address,
            Date createdAt
    ) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.money = money;
        this.gender = gender;
        this.birthDate = birthDate;
        this.documents = documents;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = new Date();
    }
}
