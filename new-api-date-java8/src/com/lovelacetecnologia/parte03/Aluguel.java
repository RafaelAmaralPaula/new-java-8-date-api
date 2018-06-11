package com.lovelacetecnologia.parte03;

import java.time.Duration;
import java.time.LocalDateTime;

import com.lovelacetecnologia.parte01.Cliente;
import com.lovelacetecnologia.parte02.Carro;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;

	private LocalDateTime dataHoraDaRetirada;
	private LocalDateTime dataHoraPrevistaParaDevolucao;
	private LocalDateTime dataRealDaDevolucao;

	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataHoraDaRetirada,
			LocalDateTime dataHoraPrevistaParaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataHoraDaRetirada = dataHoraDaRetirada;
		this.dataHoraPrevistaParaDevolucao = dataHoraPrevistaParaDevolucao;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataHoraDaRetirada() {
		return dataHoraDaRetirada;
	}

	public void setDataHoraDaRetirada(LocalDateTime dataHoraDaRetirada) {
		this.dataHoraDaRetirada = dataHoraDaRetirada;
	}

	public LocalDateTime getDataHoraPrevistaParaDevolucao() {
		return dataHoraPrevistaParaDevolucao;
	}

	public void setDataHoraPrevistaParaDevolucao(LocalDateTime dataHoraPrevistaParaDevolucao) {
		this.dataHoraPrevistaParaDevolucao = dataHoraPrevistaParaDevolucao;
	}

	public LocalDateTime getDataRealDaDevolucao() {
		return dataRealDaDevolucao;
	}

	public void setDataRealDaDevolucao(LocalDateTime dataRealDaDevolucao) {
		this.dataRealDaDevolucao = dataRealDaDevolucao;
	}

	public void imprimeFatura() {

		Duration duration = Duration.between(dataHoraPrevistaParaDevolucao, dataRealDaDevolucao);
		
		if(!duration.isNegative()) {
		
			Double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("VALOR DA MULTA : R$" + multa);
		
		}else {
			System.out.println("Muito Obrigado você é pontual !");
		}
			
		

	}

}
