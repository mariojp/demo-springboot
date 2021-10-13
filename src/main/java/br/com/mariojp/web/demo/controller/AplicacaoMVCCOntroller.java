package br.com.mariojp.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mariojp.web.demo.model.Aplicacao;
import br.com.mariojp.web.demo.repository.AplicacaoRepository;

@Controller
public class AplicacaoMVCCOntroller {

	@Autowired
	private AplicacaoRepository aplicacaoRepository;
	
	
	@GetMapping("/listar")
	public String listaAplicacao(Model model) {
		model.addAttribute("lista", aplicacaoRepository.findAll());
		return "listar";
	}
}
