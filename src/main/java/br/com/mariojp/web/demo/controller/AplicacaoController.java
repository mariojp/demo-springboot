package br.com.mariojp.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mariojp.web.demo.model.Aplicacao;
import br.com.mariojp.web.demo.repository.AplicacaoRepository;

@RestController
public class AplicacaoController {

	@Autowired
	private AplicacaoRepository aplicacaoRepository;
	
	
	@GetMapping("/aplicacoes")
	public List<Aplicacao> listaAplicacao() {
		return aplicacaoRepository.findAll();
	}


	
}
