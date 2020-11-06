package controller;

import model.arquivos.Arquivo;

public class ArquivoController {
	
	private static Arquivo arquivo;
	
	private static Arquivo criarArquivo() {
		if(arquivo == null) {
			arquivo = new Arquivo();
		}
		return arquivo;
	}
	
	public static void gerar() {
		criarArquivo();
		arquivo.gerar(CarteiraController.getCarteira().getInvestimentos());
	}
	
	public static Arquivo getArquivo() {
		return arquivo;
	}
	
}
