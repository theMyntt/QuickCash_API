package br.com.gjsoftware.quickcash.infrastructure.controllers.client;

import br.com.gjsoftware.quickcash.application.usecases.client.NewClientUseCase;
import br.com.gjsoftware.quickcash.core.IControllerService;
import br.com.gjsoftware.quickcash.core.StandardResponse;
import br.com.gjsoftware.quickcash.infrastructure.dtos.client.NewClientDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client/")
public class NewClientController implements IControllerService<NewClientDTO, StandardResponse> {
    @Autowired
    private NewClientUseCase useCase;

    @Override
    @PostMapping("/new/")
    public ResponseEntity<StandardResponse> perform(@Valid @RequestBody NewClientDTO dto) {
        return useCase.run(dto);
    }
}
