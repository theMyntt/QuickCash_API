package br.com.gjsoftware.quickcash.infrastructure.repositories;

import br.com.gjsoftware.quickcash.core.IMapperService;
import br.com.gjsoftware.quickcash.domain.aggregates.ClientAggregate;
import br.com.gjsoftware.quickcash.infrastructure.schemas.Client;

public class ClientMapper implements IMapperService<ClientAggregate, Client> {
    @Override
    public ClientAggregate toDomain(Client target) {
        return new ClientAggregate(
                target.get_id(),
                target.getName(),
                target.getEmail(),
                target.getPassword(),
                target.getMoney(),
                target.getGender(),
                target.getBirthDate(),
                target.getDocuments(),
                target.getAddress(),
                target.getCreatedAt()
        );
    }

    @Override
    public Client toPersistance(ClientAggregate schema) {
        return new Client(
                schema.get_id(),
                schema.getName(),
                schema.getEmail(),
                schema.getPassword(),
                schema.getMoney(),
                schema.getGender(),
                schema.getBirthDate(),
                schema.getDocuments(),
                schema.getAddress(),
                schema.getCreatedAt(),
                schema.getUpdatedAt()
        );
    }
}
