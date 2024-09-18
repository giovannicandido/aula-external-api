package br.org.fundatec.external_api.controller;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/cep?cep=91530008
@RestController
@RequestMapping( path = "/cep")
@RequiredArgsConstructor
public class CepController {
    private final CepService cepService;

    @GetMapping
    public Endereco findAddress(@RequestParam String cep) {
        return cepService.findAddress(cep);
    }

}
