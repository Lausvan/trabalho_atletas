package br.unisul.pweb.quarta.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.services.CompeticaoService;

@RestController
@RequestMapping(value="/competicao")
public class CompeticaoResources {
	
	@Autowired
	private CompeticaoService service;
	
	//BUSCAR POR ID
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Competicao> find(@PathVariable Integer id){
		Competicao obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	//LISTAR TODAS
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Competicao>> findAll() {
		List<Competicao> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}

}