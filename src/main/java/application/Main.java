package application;

import java.util.Scanner;

import model.arquivos.Arquivo;
import model.arquivos.CsvStrategy;
import model.entities.Carteira;
import model.entities.Investimento;
import model.entities.RendaFixa;
import model.interfaces.CarteiraFactory;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op = -1;
		
		Carteira carteira = null;
		
		Arquivo arquivo = new Arquivo();
		
		while(op != 0) {
			System.out.println("[1] - CRIAR CARTEIRA");
			System.out.println("[2] - RENDA FIXA");
			System.out.println("[3] - RENDA VARIAVEL");
			System.out.println("[4] - GERAR JSON");
			System.out.println("[5] - GERAR CSV");
			System.out.println("[0] - SAIR");
			
			System.out.println("Entre com uma opção: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				carteira = CarteiraFactory.createCarteira(sc);
				break;
				
			case 2:
				Investimento investimento = new RendaFixa();
				carteira.adicionarInvestimento(investimento, sc, carteira);
				break;
				
			case 3:
				break;
				
			case 4:
				if(carteira != null) {
					arquivo.gerar(carteira.getInvestimentos());
				}
				break;
			case 5:
				if(carteira != null) {
					arquivo.setArquivoStrategy(new CsvStrategy());
					arquivo.gerar(carteira.getInvestimentos());
				}
				break;
			case 0:
				break;
			}
			
		}
				
		sc.close();
	}

}
