package br.com.gjsoftware.quickcash.application.usecases.client;

import br.com.gjsoftware.quickcash.application.exceptions.NotFoundException;
import br.com.gjsoftware.quickcash.core.IUseCaseService;
import br.com.gjsoftware.quickcash.domain.aggregates.ClientAggregate;
import br.com.gjsoftware.quickcash.infrastructure.dtos.client.LoginClientDTO;
import br.com.gjsoftware.quickcash.infrastructure.repositories.ClientMapper;
import br.com.gjsoftware.quickcash.infrastructure.repositories.IClientRepository;
import br.com.gjsoftware.quickcash.infrastructure.schemas.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginClientUseCase implements IUseCaseService<LoginClientDTO, ClientAggregate> {
    @Autowired
    private IClientRepository repository;

    @Autowired
    private ClientMapper mapper;

    @Override
    public ResponseEntity<ClientAggregate> run(LoginClientDTO dto) {
        Client client = repository.login(dto.getEmail(), dto.getPassword(), dto.getCpf());

        if (client == null) {
            throw new NotFoundException("Client not found");
        }

        ClientAggregate aggregate = mapper.toDomain(client);

        return new ResponseEntity<ClientAggregate>(aggregate, HttpStatus.OK);
    }
}
