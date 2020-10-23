package model.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.entities.Investimento;

public class JsonStrategy extends ArquivoStrategy{

	@Override
	public void gerar(List<Investimento> investimentos) {
		if (investimentos != null) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(investimentos);
			try {
				fileWriter = new FileWriter("investimentos.json", true);
				fileWriter.write(json);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
