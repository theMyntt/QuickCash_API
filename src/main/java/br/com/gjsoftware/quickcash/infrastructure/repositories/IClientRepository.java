package br.com.gjsoftware.quickcash.infrastructure.repositories;

import br.com.gjsoftware.quickcash.infrastructure.schemas.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClientRepository extends MongoRepository<Client, String> {
}
