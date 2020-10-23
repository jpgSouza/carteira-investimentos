package model.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;

import model.entities.Investimento;
import model.entities.RendaFixa;

public class CsvStrategy extends ArquivoStrategy{

	@Override
	public void gerar(List<Investimento> investimentos) {
		if (investimentos != null) {
			try {
				fileWriter = new FileWriter("investimentos.csv", true);
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

}
