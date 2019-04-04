package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repositor.CompeticaoRepository;


@Service
public class CompeticaoService {
	
	@Autowired
	private CompeticaoRepository rep;
	
	//BUSCAR POR ID
	public Competicao find (Integer id) {
		Optional<Competicao> obj = rep.findById(id);
		return obj.orElse(null);
	}
	
	
	//LISTAR TODAS
		public List<Competicao> findAll(){
			return rep.findAll();
		}

}
