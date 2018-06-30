package com.fieb.banco.Objetos;

public class Operacoes {
	private int idBanco;
	private int idAgencia;
	private int idConta;
	private int idOperacao;
	private String descOperacao;
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
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
	public int getIdOperacao() {
		return idOperacao;
	}
	public void setIdOperacao(int idOperacao) {
		this.idOperacao = idOperacao;
	}
	public String getDescOperacao() {
		return descOperacao;
	}
	public void setDescOperacao(String descOperacao) {
		this.descOperacao = descOperacao;
	}
}