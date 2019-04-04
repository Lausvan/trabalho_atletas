package br.unisul.pweb.quarta.repositor;

import org.springframework.data.jpa.repository.JpaRepository; 

import br.unisul.pweb.quarta.domain.Atleta;

public interface AtletaRepository extends JpaRepository<Atleta, Integer> {

}
