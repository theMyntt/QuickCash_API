package br.com.gjsoftware.quickcash.infrastructure.repositories;

import br.com.gjsoftware.quickcash.infrastructure.schemas.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IClientRepository extends MongoRepository<Client, String> {
    @Query("{ 'email': ?0 }")
    Client findBy (String email);

    @Query("{ 'email': ?0, 'password': ?1, 'documents.cpf': ?2 }")
    Client login (String email, String password, String cpf);
}
