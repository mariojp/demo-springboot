package br.com.mariojp.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mariojp.web.demo.model.Cliente;
import br.com.mariojp.web.demo.repository.ClienteRepository;

/*Classe que cria um serviço web Restful
A forma de devolução (Response) não retorna um HTML(view) e sim um objeto(JSON)
A anotação RestController substitui duas anotações que poderiam ser feitas sepadamente
*/
@RestController
public class ClienteController {
    @Autowired
	private ClienteRepository clienteRepository;
    
	@GetMapping("/listaClientes")
	public List<Cliente> listaClientes() {
		List<Cliente> lista = clienteRepository.findAll();
        return lista;
	}

	@GetMapping("/salvarCliente")		
	public void salvarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

    @GetMapping("/cliente")
	public Cliente cliente() {
		Cliente novoCliente = new Cliente("pATRÍCIA" , "33369924", "RUA");
		clienteRepository.save(novoCliente);
		return novoCliente;
	}
}
