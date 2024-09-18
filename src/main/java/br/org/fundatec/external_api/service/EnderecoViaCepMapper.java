package br.org.fundatec.external_api.service;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.dto.EnderecoViaCep;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface EnderecoViaCepMapper {

    @Mapping(source = "cep", target = "cep")
    Endereco toModel(EnderecoViaCep enderecoViaCep);
}
