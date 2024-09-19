package br.org.fundatec.external_api.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {
 * "cep": "89010025",
 * "state": "SC",
 * "city": "Blumenau",
 * "neighborhood": "Centro",
 * "street": "Rua Doutor Luiz de Freitas Melro",
 * "service": "viacep",
 * "location": {
 * "type": "Point",
 * "coordinates": {}
 * }
 * }
 */
@Getter
@Setter
public class EnderecoBrasilApiDTO {
    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String service;
    private Location location;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Location {
        private String type;
        private Coordinates coordinates;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Coordinates {
       private String longitude;
       private String latitude;
    }

}
