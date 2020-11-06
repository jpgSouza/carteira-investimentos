package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Carteira {
	
	private String corretora;
	private double valorInvestido;
	
	private List<Investimento> investimentos;
	
	public Carteira(String corretora) {
		this.corretora = corretora;
		this.investimentos = new ArrayList<>();
	}

	public String getCorretora() {
		return corretora;
	}

	public void setCorretora(String corretora) {
		this.corretora = corretora;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}
	
	public List<Investimento> getInvestimentos() {
		return investimentos;
	}
	
}
