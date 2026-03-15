# 🏦 SystemBank

![Java](https://img.shields.io/badge/Java-17-orange)
![Architecture](https://img.shields.io/badge/Architecture-MVC-blue)
![Principles](https://img.shields.io/badge/Principles-SOLID-green)
![Status](https://img.shields.io/badge/Status-Study%20Project-lightgrey)

Sistema bancário desenvolvido em **Java**, com foco em **arquitetura de software**, **Clean Code** e aplicação de **boas práticas de desenvolvimento**.

O projeto simula operações bancárias essenciais e foi desenvolvido com o objetivo de praticar **Programação Orientada a Objetos**, **organização de código** e **separação de responsabilidades** utilizando o padrão **MVC (Model–View–Controller)**.

---

# 📌 Sobre o Projeto

O **SystemBank** é um mini sistema bancário que permite realizar operações financeiras básicas através de um **menu interativo no terminal**.

A aplicação utiliza uma classe chamada **MockDatabase**, que simula um banco de dados utilizando estruturas em memória, permitindo focar no **design da arquitetura e lógica do sistema** sem depender de um banco real.

---

# 🎯 Objetivos do Projeto

Este projeto foi desenvolvido para praticar:

* Arquitetura de software
* Clean Code
* Organização de projetos Java
* Programação Orientada a Objetos
* Estruturação de camadas
* Simulação de persistência de dados

---

# 🧠 Conceitos aplicados

Durante o desenvolvimento foram aplicados conceitos importantes da engenharia de software:

* **MVC (Model – View – Controller)**
* **Single Responsibility Principle**
* **Encapsulamento**
* **Separação de responsabilidades**
* **Clean Code**
* **Collections Framework**
* **Generics**
* **Simulação de banco de dados em memória**

---

# ⚙️ Funcionalidades

O sistema possui funcionalidades essenciais de um sistema bancário.

## 👤 Usuário

* Cadastro de usuário
* Login no sistema

## 🏦 Conta

* Criação de conta bancária
* Consulta de saldo

## 💰 Operações financeiras

* Depósito
* Saque
* Transferência entre contas

## 📄 Transações

* Registro das operações realizadas
* Histórico de movimentações (extrato)

---

# 🗂 Arquitetura do Projeto

O projeto segue o padrão **MVC**, separando responsabilidades em diferentes camadas.

```
SystemBank
│
├── model
│   ├── User
│   ├── Account
│   └── Transaction
│
├── repository
│   └── MockDatabase
│
├── service
│   └── Business rules
│
├── view
│   └── Interface com usuário (terminal)
│
└── main
    └── Inicialização do sistema
```

---

# 📦 Camadas da Aplicação

### Model

Responsável pelas **entidades do sistema**, representando os objetos principais da aplicação.

Exemplos:

* `User`
* `Account`
* `Transaction`

---

### Repository

Contém a classe **MockDatabase**, responsável por simular um banco de dados.

Os dados são armazenados utilizando:

```
ArrayList<User>
ArrayList<Account>
ArrayList<Transaction>
```

Essa abordagem permite desenvolver a lógica da aplicação **sem depender de um banco de dados real**.

---

### Service

Contém as **regras de negócio** da aplicação, como:

* validação de login
* operações financeiras
* validação de saldo
* execução de transferências
* registro de transações

---

### View

Responsável pela **interação com o usuário**, exibindo menus e capturando informações via terminal.

---

# 🛠 Tecnologias utilizadas

* **Java 17**
* **Programação Orientada a Objetos**
* **Java Collections Framework**
* **Generics**
* **Arquitetura MVC**
* **Clean Code**

---

# ▶️ Como executar o projeto

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/Daviss77/SystemBank
```

### 2️⃣ Abra o projeto em uma IDE

IDE recomendadas:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

### 3️⃣ Execute a classe principal

```
Main.java
```

### 4️⃣ Utilize o sistema

Após executar, o sistema apresentará um **menu interativo no terminal**, permitindo utilizar as funcionalidades bancárias.

---

# 📈 Melhorias futuras

Possíveis evoluções para o sistema:

* Integração com **MySQL**
* Implementação com **Spring Boot**
* Criação de **API REST**
* Interface Web
* Implementação de **testes unitários**
* Sistema de autenticação mais robusto
* Persistência real de dados

---

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foi possível reforçar conceitos importantes como:

* Estruturação de **arquitetura de software**
* Aplicação de **boas práticas de programação**
* Organização de código em camadas
* Importância da **separação de responsabilidades**

Uma arquitetura bem definida facilita **manutenção, escalabilidade e evolução do sistema**.

---

# 👨‍💻 Autor

**Davi Santana**

GitHub
https://github.com/Daviss77

Desenvolvedor Java em formação, focado em **Backend Development**, **Arquitetura de Software** e **boas práticas de programação**.
