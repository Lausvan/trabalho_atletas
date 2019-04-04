package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.repositor.AtletaRepository;

@Service
public class DbService { 
	
	@Autowired
	private AtletaRepository atleRep; 
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Atleta atle1 = new Atleta(null, "Robson");
		Atleta atle2 = new Atleta(null, "Ricardo");
		Atleta atle3 = new Atleta(null, "Klaiton");
		
		atleRep.saveAll(Arrays.asList(atle1, atle2, atle3));
		
		
		
		
	}

}
