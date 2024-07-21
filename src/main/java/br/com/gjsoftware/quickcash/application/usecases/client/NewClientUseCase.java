package br.com.gjsoftware.quickcash.application.usecases.client;

import br.com.gjsoftware.quickcash.core.IUseCaseService;
import br.com.gjsoftware.quickcash.core.StandardResponse;
import br.com.gjsoftware.quickcash.domain.aggregates.ClientAggregate;
import br.com.gjsoftware.quickcash.infrastructure.dtos.client.NewClientDTO;
import br.com.gjsoftware.quickcash.infrastructure.repositories.ClientMapper;
import br.com.gjsoftware.quickcash.infrastructure.repositories.IClientRepository;
import br.com.gjsoftware.quickcash.infrastructure.schemas.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NewClientUseCase implements IUseCaseService<NewClientDTO, StandardResponse> {
    @Autowired
    private IClientRepository repository;

    @Autowired
    private ClientMapper mapper;

    @Override
    public ResponseEntity<StandardResponse> run(NewClientDTO dto) {
        ClientAggregate aggregate = new ClientAggregate(
                dto.getName(),
                dto.getEmail(),
                dto.getPassword(),
                0,
                dto.getGender(),
                dto.getBirthDate(),
                dto.getDocuments(),
                dto.getAddress()
        );

        Client client = mapper.toPersistance(aggregate);

        repository.insert(client);

        StandardResponse response = new StandardResponse("Created.", 201);

        return new ResponseEntity<StandardResponse>(response, HttpStatus.CREATED);
    }
}
