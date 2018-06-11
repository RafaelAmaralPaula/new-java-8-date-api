package com.lovelacetecnologia.parte04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.lovelacetecnologia.parte01.Cliente;
import com.lovelacetecnologia.parte02.Carro;
import com.lovelacetecnologia.parte03.Aluguel;

public class DevolucaoDoCarro {

	public static void main(String[] args) {

		Aluguel aluguel = recuperarAluguel();

		// Para cada hora de atraso , ele paga 10% do valor do carro em multa

		LocalDateTime dateTime = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());

		aluguel.setDataRealDaDevolucao(dateTime);
		aluguel.imprimeFatura();

	}

	private static Aluguel recuperarAluguel() {

		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));

		LocalDateTime dataHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
				LocalTime.of(LocalTime.now().getHour(), 0));

		LocalDateTime dataHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

		Aluguel aluguel = new Aluguel(cliente, carro, dataHoraDaRetirada, dataHoraPrevistaParaDevolucao);

		return aluguel;

	}

}
