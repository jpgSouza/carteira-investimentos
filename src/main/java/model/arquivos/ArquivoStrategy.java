package model.arquivos;

import java.io.FileWriter;
import java.util.List;

import model.entities.Investimento;

public abstract class ArquivoStrategy {

	protected FileWriter fileWriter;
	
	public abstract void gerar(List<Investimento> investimentos);

	public FileWriter getFileWriter() {
		return fileWriter;
	}

}
