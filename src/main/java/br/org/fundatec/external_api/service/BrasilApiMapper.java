package br.org.fundatec.external_api.service;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.dto.EnderecoBrasilApiDTO;

public class BrasilApiMapper {
    public static Endereco toModel(EnderecoBrasilApiDTO enderecoBrasilApiDTO) {

        Endereco endereco = new Endereco();
        endereco.setCep(enderecoBrasilApiDTO.getCep());
        endereco.setUf(enderecoBrasilApiDTO.getState());
        endereco.setLocalidade(enderecoBrasilApiDTO.getCity());
        endereco.setBairro(enderecoBrasilApiDTO.getNeighborhood());
        endereco.setLogradouro(enderecoBrasilApiDTO.getStreet());
        return endereco;
        
    }
}
