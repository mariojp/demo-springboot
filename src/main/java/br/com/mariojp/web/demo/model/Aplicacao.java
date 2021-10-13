package br.com.mariojp.web.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aplicacao {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aplicacao_id")
	private Long id;
	
	@Column(name="nome" , nullable = false)
	private String nome;
	
	
	/*Java Bean*/
	public Aplicacao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Aplicacao(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Aplicacao(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return String.format("Aplicacao [id=%s, nome=%s]", id, nome);
	}
	
	
	
}
