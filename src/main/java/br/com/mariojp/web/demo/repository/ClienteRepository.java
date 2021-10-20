package br.com.mariojp.web.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mariojp.web.demo.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}
