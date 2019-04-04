package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.repositor.AtletaRepository;


@Service
public class AtletaService {
	
	@Autowired
	private AtletaRepository rep;
	
	//BUSCAR POR ID
	public Atleta find (Integer id) {
		Optional<Atleta> obj = rep.findById(id);
		return obj.orElse(null);
	}
	
	
	//LISTAR TODAS
		public List<Atleta> findAll(){
			return rep.findAll();
		}

}
