package model.entities;

import java.util.Date;

public class RendaVariavel extends Investimento{
	
	private Date dataVenda;
	private double precoVenda;
	private String codigo;
	private String setor;
	
	public RendaVariavel(String nome, Date dataCompra, double preco, double quantidade, Date dataVenda, double precoVenda, String codigo, String setor) {
		super(nome, dataCompra, preco, quantidade);
		this.dataVenda = dataVenda;
		this.precoVenda = precoVenda;
		this.codigo = codigo;
		this.setor = setor;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
