package br.org.fundatec.external_api.service;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.dto.EnderecoViaCep;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    private static final String VIACEP_DOMAIN = "https://viacep.com.br";
    private RestTemplate restTemplate = new RestTemplate();

    public Endereco findAddress(String cep) {
        String api = getAddressApiUrl(cep);
        // ResponseEntity<Endereco> enderecoEntity = restTemplate.getForEntity(api, Endereco.class);
        EnderecoViaCep enderecoViaCep = restTemplate.getForObject(api, EnderecoViaCep.class);
        Endereco endereco = EnderecoViaCepMapper.toModel(enderecoViaCep);
        //Endereco endereco = EnderecoViaCepMapp
        return endereco;

    }


    private String getAddressApiUrl(String cep) {
        return String.format("%s/ws/%s/json", VIACEP_DOMAIN, cep);
    }
}
