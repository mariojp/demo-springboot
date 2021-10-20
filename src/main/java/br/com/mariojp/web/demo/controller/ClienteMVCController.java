package br.com.mariojp.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.mariojp.web.demo.repository.ClienteRepository;

@Controller
public class ClienteMVCController {

	@Autowired
	private ClienteRepository clienteRepository;
    
	@GetMapping("/clientes")
	public String listaClientes(Model model) {
		model.addAttribute("lista", clienteRepository.findAll());
		return "listar";
	}
}
