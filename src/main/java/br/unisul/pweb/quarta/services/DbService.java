package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repositor.AtletaRepository;
import br.unisul.pweb.quarta.repositor.CompeticaoRepository;

@Service
public class DbService { 
	
	@Autowired
	private AtletaRepository atleRep;  
	
	@Autowired 
	private CompeticaoRepository compRep;
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Atleta atle1 = new Atleta(null,"Robson","100 metros rasos"); 
		Atleta atle2 = new Atleta(null,"Ricardo"," Nado rapido"); 
		Atleta atle3 = new Atleta(null,"Clavison"," Programação sobre pressão");
		
		atleRep.saveAll(Arrays.asList(atle1, atle2, atle3));  
		
		Competicao comp1 = new Competicao(null, "Corrida", "12/05/1999"); 
		Competicao comp2 = new Competicao(null, "Natação", "15/01/1996"); 
		Competicao comp3 = new Competicao(null, "Arremeço de Dardo", "16/07/1999");
		
		compRep.saveAll(Arrays.asList(comp1,comp2,comp3));

		
	}

}
