package model.entities;

import java.util.Date;

public class RendaFixa extends Investimento{
	
	private String dataVencimento;
	private double rendimento;
	
	public RendaFixa() {
		
	}
	
	public RendaFixa(String nome, Date dataCompra, double preco, double quantidade, String dataVencimento, double rendimento) {
		super(nome, dataCompra, preco, quantidade);
		this.dataVencimento = dataVencimento;
		this.rendimento = rendimento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	

	
}
