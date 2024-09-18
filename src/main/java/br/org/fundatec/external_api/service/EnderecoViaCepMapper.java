package br.org.fundatec.external_api.service;

import br.org.fundatec.external_api.model.Endereco;
import br.org.fundatec.external_api.service.dto.EnderecoViaCep;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public class EnderecoViaCepMapper {

    public static Endereco toModel(EnderecoViaCep enderecoViaCep) {
        Endereco endereco = new Endereco();
        endereco.setCep(enderecoViaCep.getCep());
        endereco.setLogradouro(enderecoViaCep.getLogradouro());
        endereco.setComplemento(enderecoViaCep.getComplemento());
        endereco.setUnidade(enderecoViaCep.getUnidade());
        endereco.setBairro(enderecoViaCep.getBairro());
        endereco.setLocalidade(enderecoViaCep.getLocalidade());
        endereco.setUf(enderecoViaCep.getUf());
        endereco.setEstado(enderecoViaCep.getEstado());
        endereco.setRegiao(enderecoViaCep.getRegiao());
        endereco.setIbge(enderecoViaCep.getIbge());
        endereco.setGia(enderecoViaCep.getGia());
        endereco.setDdd(enderecoViaCep.getDdd());
        endereco.setSiafi(enderecoViaCep.getSiafi());
        return endereco;
    }
}
