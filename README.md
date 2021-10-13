# Criar projeto Spring Boot

## 1. Start

- Acessar https://start.spring.io/
- Configurar o Projeto (Versão, Maven, Dependencias)
- Download do zip.
- Descompactar
- Import maven project
- Executar classe *Application.java

## 2. Database

- Adicionar H2 e JPA
- Criar a Classe Model (Aplicacao.java) @Entity
- Criar a Interface Repositorio (AplicacaoRepository.java) extends CrudRepository<Aplicacao, Long>
- Usar o CommandLineRunner inserir no banco e listar o que foi inserido