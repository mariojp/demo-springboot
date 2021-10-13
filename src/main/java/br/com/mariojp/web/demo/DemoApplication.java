package br.com.mariojp.web.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.mariojp.web.demo.model.Aplicacao;
import br.com.mariojp.web.demo.repository.AplicacaoRepository;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner executar(AplicacaoRepository aplicacaoRepository) {
		return (args) -> {
			aplicacaoRepository.save(new Aplicacao("Aplicacao 1"));
			aplicacaoRepository.save(new Aplicacao("Aplicacao 2"));

			for(Aplicacao a : aplicacaoRepository.findAll()) {
				log.info(a.toString());
			}
			
		};
	}
	

}
