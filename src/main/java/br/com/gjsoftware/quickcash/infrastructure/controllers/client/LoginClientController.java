package br.com.gjsoftware.quickcash.infrastructure.controllers.client;

import br.com.gjsoftware.quickcash.application.usecases.client.LoginClientUseCase;
import br.com.gjsoftware.quickcash.core.IControllerService;
import br.com.gjsoftware.quickcash.domain.aggregates.ClientAggregate;
import br.com.gjsoftware.quickcash.infrastructure.dtos.client.LoginClientDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class LoginClientController implements IControllerService<LoginClientDTO, ClientAggregate> {
    @Autowired
    private LoginClientUseCase useCase;

    @Override
    @PostMapping("/login/")
    public ResponseEntity<ClientAggregate> perform(@Valid @RequestBody LoginClientDTO dto) {
        return useCase.run(dto);
    }
}
