package model.entities.validators;

import model.entities.RendaFixa;
import model.interfaces.RendaFixaRepository;

public class RendaFixaService {
	
	private RendaFixaRepository rendaFixaRepository;

	public RendaFixaService(RendaFixaRepository rendaFixaRepository) {
		this.rendaFixaRepository = rendaFixaRepository;
	}
	
	public void insert(RendaFixa rendaFixa) {
		validaCampos(rendaFixa);
		rendaFixaRepository.save(rendaFixa);
	}
	
	public void validaCampos(RendaFixa rendaFixa) {
		if(rendaFixa.getNome() == null || rendaFixa.getQuantidade() <= 0) {
			throw new RuntimeException("Campos vazios...");
		}
	}
	
}
