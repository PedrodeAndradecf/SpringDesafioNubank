# Desafio Nubank – API de Clientes e Contatos (Java + Spring Boot)

Este projeto foi desenvolvido como parte do meu aprendizado em backend, baseado em um desafio técnico proposto pela equipe do Nubank. O objetivo é construir uma API REST para o gerenciamento de clientes e seus contatos, onde cada cliente pode ter um ou mais contatos associados.

Implementei a solução utilizando Java com Spring Boot, seguindo uma arquitetura em camadas (Controller, Service e Repository) para garantir uma separação clara de responsabilidades e facilitar a manutenção do código.

🔧 Funcionalidades Implementadas
Cadastro de clientes (POST /clientes)

Cadastro de contatos associados a um cliente existente (POST /contatos)

Listagem de todos os clientes com seus contatos (GET /clientes)

Listagem dos contatos de um cliente específico (GET /clientes/{id}/contatos)

🛠️ Tecnologias e Boas Práticas
Java + Spring Boot + Spring Data JPA

PostgreSQL como banco de dados

Uso de DTOs para trafegar dados entre camadas

Mapeamento de relacionamento entre entidades (@OneToMany / @ManyToOne)

