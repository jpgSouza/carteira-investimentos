package model.interfaces;

import java.util.Date;

import model.entities.RendaFixa;

public class InvestimentoFactory {
	
	public static RendaFixa createRendaFixa(String nome, double preco, double quantidade, String dataVencimento,
			double rendimento) {
		return new RendaFixa(nome, new Date(), preco, quantidade, dataVencimento, rendimento);
	}

}
