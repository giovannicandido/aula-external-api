package br.org.fundatec.external_api.service;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.dto.EnderecoBrasilApiDTO;
import br.org.fundatec.external_api.service.dto.EnderecoViaCep;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    private static final String VIACEP_DOMAIN = "https://viacep.com.br";
    private static final String BRASIL_API_DOMAIN = "https://brasilapi.com.br";
    private RestTemplate restTemplate = new RestTemplate();

    public Endereco findAddress(String cep) {
        String api = getAddressApiUrl(cep);
        // ResponseEntity<Endereco> enderecoEntity = restTemplate.getForEntity(api, Endereco.class);
        EnderecoViaCep enderecoViaCep = restTemplate.getForObject(api, EnderecoViaCep.class);
        Endereco enderecoModelViaCep = EnderecoViaCepMapper.toModel(enderecoViaCep);

        EnderecoBrasilApiDTO enderecoBrasilApiDTO = restTemplate.getForObject(getBrasilApiUrl(cep), EnderecoBrasilApiDTO.class);
        Endereco enderecoModelBrasilApiDTO = BrasilApiMapper.toModel(enderecoBrasilApiDTO);

        return enderecoModelBrasilApiDTO;

    }


    private String getAddressApiUrl(String cep) {
        return String.format("%s/ws/%s/json", VIACEP_DOMAIN, cep);
    }

    private String getBrasilApiUrl(String cep) {
        return String.format("%s/api/cep/v2/%s", BRASIL_API_DOMAIN, cep);
    }
}
