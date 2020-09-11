package model.teste.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import model.entities.Carteira;

public class TestCarteira {
	
	Carteira carteira;
	
	@Before
	public void beforeTeste() {
		carteira = new Carteira("Rico Investimento");
	}
	
	@Test
	public void testeExisteCarteira() {
		assertNotNull(carteira);
	}
	
	@Test
	public void testeCarteiraVazia() {		
		int qtdInvestimentos = carteira.getInvestimentos().size();
		
		assertEquals(0, qtdInvestimentos);
		
	}
	
}
