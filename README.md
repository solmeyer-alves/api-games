[![NPM](https://img.shields.io/npm/l/react)](https://github.com/solmeyer-alves/api-games/blob/main/LICENSE)

# 🎮 API de Jogos

Uma API RESTful para gerenciamento e consulta de jogos, construída com **Java** e **Spring Boot** durante o Intensivão Java Spring organizado pela **DevSuperior**. 
Este projeto demonstra boas práticas de desenvolvimento, documentação e integração com banco de dados.

---

## 🚀 Tecnologias Utilizadas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white)](https://swagger.io/)
[![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://www.postman.com/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/)

- ☕ **Java 21+** – Linguagem principal  
- 🌱 **Spring Boot** – Framework para criação de aplicações web e APIs REST  
- 🛢️ **PostgreSQL** – Banco de dados relacional  
- 📄 **Swagger / OpenAPI** – Documentação interativa da API  
- 🧪 **Postman** – Testes e validação dos endpoints  
- 🐳 **Docker** – Containerização da aplicação  
- <img src="https://img.icons8.com/ios-glyphs/25/000000/github.png" alt="GitHub" /> **GitHub**
 – Controle de versão e colaboração  

---

## 📝 Funcionalidades

- 🎲 Cadastro, listagem e edição de jogos  
- 🔎 Busca de jogos por ID  
- 🗂️ Gerenciamento de listas de jogos  
- 📑 Documentação dos endpoints via Swagger UI  
- 🛢️ Integração com PostgreSQL para persistência dos dados 

---

## 📂 Modelo de domínio

![imagem alt](https://github.com/solmeyer-alves/estudos/blob/a196588ac2f3697e145a513a3a6d24a194f01922/dslist-model.png)

---

## ⚙️ Configuração do Ambiente

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/api-games.git
cd api-games

```

### 2️ 🛢️ Configurar o banco PostgreSQL

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/api_games
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

```
### 3️⃣ 🚀 Rodar a aplicação

```bash
docker-compose up -u

```

### 📑 Documentação da API

```bash
http://localhost:8080/swagger-ui.html

```

### 🧪 Testando com Postman

- Importe a coleção Postman disponibilizada no repositório para testar os endpoints.

- Configure as variáveis de ambiente conforme necessário (ex.: URL base da API).

## 📥 Coleção Postman  

[![Download Postman Collection](https://img.shields.io/badge/Download%20Postman%20Collection-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://github.com/solmeyer-alves/estudos/blob/master/postman/api-games.postman_collection.json)


---

## ✍️ Autor  

Projeto desenvolvido por **Solmeyer Alves**.  

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Solmeyer%20Alves-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/solmeyer-alves-a41540a2/)

---

## 🙏 Agradecimentos 
Gostaria de agradecer a iniciativa e ensinamentos do professor **Nélio Alves** da [DevSuperior](https://devsuperior.club/login/) que tornou possível o desenvolvimento desse projeto.
Seu apoio, feedback e dedicação foram essenciais para tornar esta API possível. 🚀
