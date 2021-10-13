package br.com.mariojp.web.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.mariojp.web.demo.model.Aplicacao;

public interface AplicacaoRepository extends JpaRepository<Aplicacao, Long> {

}
