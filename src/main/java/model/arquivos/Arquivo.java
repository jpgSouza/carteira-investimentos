package model.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVWriter;

import model.entities.Investimento;
import model.entities.RendaFixa;

public class Arquivo {

	private static File file;
	private static FileWriter fileWriter;

	public static void gerarJson(List<Investimento> investimentos) {
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

	public static void gerarCsv(List<Investimento> investimentos) {
		if (investimentos != null) {
			file = new File("investimentos.csv");
			try {
				fileWriter = new FileWriter(file, true);
				CSVWriter csvWriter = new CSVWriter(fileWriter);
				String[] header = { "Nome", "Data de Compra", "Data de Vencimento", "Preço", "Quantidade",
						"Rendimento" };
				csvWriter.writeNext(header);
				for (Investimento investimento : investimentos) {
					if (investimento instanceof RendaFixa) {
						RendaFixa rendaFixaAux = (RendaFixa) investimento;
						String[] data = { rendaFixaAux.getNome(), rendaFixaAux.getDataCompra().toString(),
								rendaFixaAux.getDataVencimento(), String.valueOf(rendaFixaAux.getPreco()),
								String.valueOf(rendaFixaAux.getQuantidade()),
								String.valueOf(rendaFixaAux.getRendimento()) };
						csvWriter.writeNext(data);
					}
				}
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static File getFile() {
		return file;
	}

	public static FileWriter getFileWriter() {
		return fileWriter;
	}


}
