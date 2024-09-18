package br.org.fundatec.external_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ExternalApiApplication {
	private static List<Integer> lista = List.of(1, 2, 3, 4, 5);
	private static List<Preso> listaPresos = List.of(new Preso(), new Preso());
	public static void main(String[] args) {
		var preso = new Preso();

		if(lista.isEmpty() && !preso.isDeficiente()) {

		}

		var bool = lista.stream().allMatch(i -> i < 6);
		if ((preso.isChefeGang() && listaPresos.stream().anyMatch(Preso::isChefeGang)) || listaPresos.isEmpty()) {

		}

		SpringApplication.run(ExternalApiApplication.class, args);
	}

	public static class Preso {
		public boolean isChefeGang() {
			return true;
		}

		public boolean isDeficiente() {
			return false;
		}
	}

}
