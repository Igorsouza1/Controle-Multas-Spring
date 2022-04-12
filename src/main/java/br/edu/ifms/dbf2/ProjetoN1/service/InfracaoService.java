package br.edu.ifms.dbf2.ProjetoN1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.dbf2.ProjetoN1.model.Infracao;
import br.edu.ifms.dbf2.ProjetoN1.model.Multa;
import br.edu.ifms.dbf2.ProjetoN1.repository.Infracoes;

@Service
public class InfracaoService {
	
	@Autowired
	private Infracoes infracoesRepo;
	
	public List<Infracao> buscarTodos(){
		return infracoesRepo.findAll();
	}
	
	public void deletar(Long id) {
		infracoesRepo.deleteById(id);
	}
	
	public Infracao buscarPeloId(Long id) {
		return infracoesRepo.getById(id);
	}

	public void salvar(Infracao infracao) {
		infracoesRepo.save(infracao);
	}
}
