package model.entities;

import java.util.Date;

public abstract class Investimento {
	
	private String nome;
	private Date dataCompra;
	private double preco;
	private double quantidade;
	
	public Investimento() {
		
	}
	
	public Investimento(String nome, Date dataCompra, double preco, double quantidade) {
		this.nome = nome;
		this.dataCompra = dataCompra;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	
}
