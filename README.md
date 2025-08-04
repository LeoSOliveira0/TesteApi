<h1 align="center">📦 TesteApi</h1>

<p align="center">
  <img alt="Último Commit" src="https://img.shields.io/github/last-commit/LeoSOliveira0/TesteApi?style=for-the-badge" />
  <img alt="Java" src="https://img.shields.io/badge/Java-100%25-blue?style=for-the-badge&logo=java" />
 <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />

</p>

---

## 🚀 Funcionalidades

- 🧪 API REST simples para teste
- 📌 Endpoints CRUD básicos (exemplo: `/api/test`)
- 🧠 Estrutura leve e fácil de estender

---

## 🛠 Tecnologias Utilizadas

- Java 17  
- Spring Boot 3  
- Maven  
- H2 Database (banco em memória para teste)  

---

## 📁 Estrutura do Projeto

```
testeapi/
├── controller/           # Controladores REST
├── dto/                  # Objetos de transferência de dados (se houver)
├── service/              # Lógica de negócio
├── repository/           # Repositórios JPA (ex: H2)
├── model/                # Entidades do domínio
└── Application.java      # Ponto de entrada do Spring Boot
```

---

## 🔧 Como Começar

### 1. Clone este repositório

```bash
git clone https://github.com/LeoSOliveira0/TesteApi.git
cd TesteApi
```

### 2. Executar a aplicação

```bash
./mvnw spring-boot:run
```

Acesse em: `http://localhost:8080`

### 3. (Opcional) Banco de dados H2

- Acesse o console H2 em: `http://localhost:8080/h2-console`
- JDBC URL padrão: `jdbc:h2:mem:testdb`
- Usuário: `sa` (sem senha)

---

## 📡 Uso da API

### `GET /api/test`

- **Descrição:** Retorna uma resposta de teste simples  
- **Resposta exemplo:**

```json
{
  "message": "API funcionando!"
}
```

---

### `POST /api/test`

- **Descrição:** Exemplo de envio de dados (JSON)  
- **Exemplo de requisição:**

```json
{
  "name": "Seu Nome",
  "value": 123
}
```

- **Resposta exemplo:**

```json
{
  "id": 1,
  "name": "Seu Nome",
  "value": 123
}
```

---

## 🧪 Testes

- Contém testes unitários/integrados simples com **JUnit** e **MockMvc**
- Basta rodar:

```bash
./mvnw test
```

---

## 📝 Observações

- Projeto ideal para aprender ou testar APIs REST com Spring Boot
- Pode ser facilmente expandido com repositório JPA, autenticação, segurança, etc.

---
