package br.org.fundatec.external_api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
