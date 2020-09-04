package model.entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVWriter;

import model.interfaces.InvestimentoFactory;

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
	
	public void adicionarInvestimento(Investimento investimento, Scanner sc, Carteira c) {
		if(investimento instanceof RendaFixa){
			investimento = InvestimentoFactory.createRendaFixa(sc, c);
			valorInvestido += investimento.getQuantidade() * investimento.getPreco();
			investimentos.add(investimento);
		}
		
	}
	
	public List<Investimento> getInvestimentos() {
		return investimentos;
	}
	
}
