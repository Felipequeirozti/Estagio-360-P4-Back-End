# Projeto_Internato back end 

Grupo:
- Anderson Victor Oliveira de Barros
- Felipe Queiroz Pinto
- João José Alves Neto

---

## Tecnologias Utilizadas

- Java 17
- Lombok
- Spring Boot
- Spring Web
- Spring Data JPA

## Funcionalidades Principais

- Registro de check-in e check-out com validação de localização
- Controle de faltas, reposições e advertências
- Geração de relatórios de carga horária por aluno e especialidade
- Cadastro e configuração do semestre letivo
- Cadastro de hospitais, clínicas e especialidades
- Escalonamento automático de alunos em plantões (rodízios)

---

## Padrão de Arquitetura Utilizado: **Camadas (Layered Architecture)**

### Camadas definidas no projeto:

1. **Controller (Apresentação)**  
   Expõe os endpoints da API REST para os diferentes tipos de usuários (coordenador, aluno, preceptor). Recebe requisições, trata dados de entrada e delega para os serviços.


2. **Service (Regras de Negócio)**  
   Contém a lógica da aplicação: verificação de presença, escalonamento de plantões, controle de carga horária e regras como atrasos, faltas e validações de check-in.


3. **Repository (Acesso a Dados)**  
   Camada responsável por acessar e manipular os dados no banco usando `Spring Data JPA`.


4. **Model (Entidades)**  
   Representa as tabelas do banco de dados com anotações JPA (`@Entity`, `@Id`, etc.).


5. **DTO (Data Transfer Objects)**  
   Estruturas usadas para enviar e receber dados da API de forma segura, sem expor diretamente as entidades.




