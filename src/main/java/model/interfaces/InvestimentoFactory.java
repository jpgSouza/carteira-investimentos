package model.interfaces;

import java.util.Date;
import java.util.Scanner;

import model.entities.Carteira;
import model.entities.RendaFixa;

public class InvestimentoFactory {
	
	public static RendaFixa createRendaFixa(Scanner sc, Carteira c) {
		if(c != null) {
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			System.out.println("Quatidade: ");
			double quantidade = sc.nextDouble();
			sc.nextLine();
			System.out.println("Data de Vencimento: ");
			String dataVencimento = sc.nextLine();
			System.out.println("Rendimento: ");
			double rendimento = sc.nextDouble();
			
			return new RendaFixa(nome, new Date(), preco, quantidade, dataVencimento, rendimento);
		} else {
			return null;
		}
		
	}
	
}
