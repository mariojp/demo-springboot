package br.com.mariojp.web.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.mariojp.web.demo.model.Cliente;
import br.com.mariojp.web.demo.repository.ClienteRepository;

public class ClienteController {
    
    @GetMapping("/clientes")
	public List<Cliente> listaCliente() {
		return ClienteRepository.findAll();
	}
}
