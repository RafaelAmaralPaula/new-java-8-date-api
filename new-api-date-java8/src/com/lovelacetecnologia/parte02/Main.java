package com.lovelacetecnologia.parte02;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Carro gol = new Carro("Gol", 250.0,Year.of(2012));
		Carro FiatMille = new Carro("Mille" , 90.00 , Year.of(2010));
		Carro honda = new Carro("Civic", 260.0,Year.parse("2015"));
		Carro palio = new Carro("Palio", 500.0,Year.of(2009));
		
		List<Carro> carros = Arrays.asList(gol , honda , palio , FiatMille);
		
		carros.stream()
		   .filter(carro -> carro.getAnoFabricacao().isBefore(Year.of(2015)))
		   .forEach(carro -> System.out.println(carro.getModelo()));
		
		
	}

}
