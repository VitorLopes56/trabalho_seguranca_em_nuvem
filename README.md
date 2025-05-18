# 🔐 Projeto de Segurança em Nuvem com Spring Boot

Este projeto demonstra a implementação prática de um sistema seguro para autenticação e autorização de usuários em ambientes de **nuvem**, usando **Spring Boot**, **Spring Security** e **JPA com MySQL**.

---

## 🚀 Funcionalidades

- ✅ Cadastro e login de usuários com criptografia de senha (BCrypt)
- 🔐 Geração de tokens JWT para autenticação segura
- 👥 Controle de acesso baseado em perfis (`ROLE_USER`, `ROLE_ADMIN`, etc)
- 🌐 API RESTful pronta para integração
- ☁️ Projeto ideal para ambientes em nuvem (AWS, GCP, etc)

---

## 🧰 Tecnologias utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- Lombok
- JWT

Atualize seu application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/seguranca_nuvem
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

Rodando o projeto
mvn spring-boot:run
http://localhost:8080


