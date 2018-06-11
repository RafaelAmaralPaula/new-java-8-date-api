package com.lovelacetecnologia.parte01;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Rafael Amaral", LocalDate.of(2001, Month.AUGUST, 13));
		
		System.out.println("Data_Nascimento -> " + cliente.getDataNascimento());
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

		if (idade >= 18) {

			System.out.println("OK , pode ser cadastrado : Sua idade é -> " + idade);
		} else {
			System.out.println("NÃO , pode ser cadastrado você é menor idade " + idade);
		}

	}

}
