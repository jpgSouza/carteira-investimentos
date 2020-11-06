package controller;

import model.entities.Carteira;
import model.entities.Investimento;
import model.entities.RendaFixa;
import model.interfaces.CarteiraFactory;
import model.interfaces.InvestimentoFactory;

public class CarteiraController {

	private static Carteira carteira;

	public static void criarCarteira(String nome) {
		carteira = CarteiraFactory.createCarteira(nome);
	}

	public static void criarRendaFixa(String nome, double preco, double quantidade,
			String data, double rendimento) {
		Investimento investimento = new RendaFixa();
		if(investimento instanceof RendaFixa) {
			investimento = InvestimentoFactory.createRendaFixa(nome, preco, quantidade, data, rendimento);
			carteira.getInvestimentos().add(investimento);
		}
	}

	public static Carteira getCarteira() {
		return carteira;
	}

}
