package com.fieb.banco.Objetos;

import java.util.Date;

public class Transacao {
	private int idAgencia;
	private int idConta;
	private double valorMovi;
	private int idOperacao;
	private Date data_hora;
	private int idTransacao;
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public double getValorMovi() {
		return valorMovi;
	}
	public void setValorMovi(double valorMovi) {
		this.valorMovi = valorMovi;
	}
	public int getIdOperacao() {
		return idOperacao;
	}
	public void setIdOperacao(int idOperacao) {
		this.idOperacao = idOperacao;
	}
	public Date getData_hora() {
		return data_hora;
	}
	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransaca(int idTransacao) {
		this.idTransacao = idTransacao;
	}
}
