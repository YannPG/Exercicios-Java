# ☕ Exercícios de Java - Aplicações com Arquitetura Limpa

Bem-vindo(a) ao meu repositório de exercícios práticos em Java! Este projeto, que começou como uma série de desafios para aprofundar conhecimentos em **Programação Orientada a Objetos (POO)**, evoluiu para uma **aplicação de console única e interativa**, construída sobre os princípios da **Arquitetura Limpa (Clean Architecture)**.

---

## 🎯 Sobre o Projeto

O objetivo central deste projeto é demonstrar a implementação de diversas funcionalidades em Java, organizadas dentro de uma arquitetura robusta e escalável. A aplicação é um sistema de menus que permite ao usuário navegar e executar diferentes módulos, desde calculadoras simples até sistemas de gerenciamento com persistência de dados em memória.

O projeto demonstra conceitos avançados de design de software, como:
* **Separação de Responsabilidades:** Divisão clara entre as camadas de Domínio, Aplicação e Infraestrutura.
* **Injeção de Dependências:** Centralização da criação e conexão dos componentes na classe principal.
* **Padrão Repository:** Abstração do acesso aos dados, desacoplando a lógica de negócio da forma de armazenamento.
* **Casos de Uso (Use Cases):** Encapsulamento de regras de negócio em classes com responsabilidade única.

---

## 🏛️ Arquitetura e Padrões

O projeto é inspirado na **Clean Architecture**, dividindo as responsabilidades em camadas bem definidas para garantir baixo acoplamento e alta coesão.

* **`domain`:** O coração da aplicação. Contém as entidades de negócio (`Funcionario`, `Contato`) e suas regras intrínsecas (validações), além dos Repositórios (interfaces de acesso a dados).
* **`application`:** Contém os **UseCases** (a lógica de negócio de cada funcionalidade, como `CalcularSalarioDepartamentoUseCase`) e os **Controllers** (que orquestram a interação entre o usuário e a aplicação).
* **`infra`:** A camada mais externa, responsável pela interação com o mundo exterior. Inclui os **Menus** (`MenuPrincipal`, `MenuMetodo`) e a classe de inicialização (`AtividadesApplication`).

**Tecnologias:**
* **Linguagem Principal:** Java 17
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Gerenciamento do Projeto:** Maven
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como Configurar e Executar

O projeto agora funciona como uma aplicação única e integrada. Siga os passos abaixo para executá-lo.

**Pré-requisitos:**

* **Git:** Instalado e configurado.
* **JDK (Java Development Kit):** Java 17 ou superior, com as variáveis de ambiente `JAVA_HOME` e `PATH` configuradas.
* **IDE (Recomendado):** IntelliJ IDEA, Eclipse ou VS Code com suporte a projetos Maven.

**Passos para Execução:**

1.  **Clone o Repositório:**
    Abra seu terminal e clone o repositório para sua máquina:
    ```bash
    git clone [https://github.com/YannPG/Exercicios-Java.git](https://github.com/YannPG/Exercicios-Java.git)
    cd Exercicios-Java/atividades
    ```

2.  **Abra o Projeto na IDE:**
    * Importe o projeto `atividades/` como um projeto Maven existente na sua IDE.
    * Aguarde a IDE baixar e configurar as dependências (se houver).

3.  **Execute a Aplicação:**
    * O projeto possui um **único ponto de entrada**. Navegue até a classe:
        ```
        src/main/java/com/exercicios/atividades/AtividadesApplication.java
        ```
    * Execute o método `main()` contido nesta classe. O menu interativo da aplicação será iniciado no seu console.

---

## 📚 Funcionalidades Implementadas

A aplicação está organizada em um sistema de menus aninhados.

#### Menu Principal
1.  **Métodos:** Agrupa algoritmos e lógicas de método.
    * Calculadora Simples (Soma, Subtração, etc.)
    * Verificador de Palíndromos
    * Cálculo de Fatorial
    * Conversor de Temperaturas

2.  **Análise de Matriz:** Funcionalidades relacionadas a matrizes.
    * Encontrar Maior e Menor Elemento em uma Matriz

3.  **Manipulação de Objetos:** Exercícios para demonstrar conceitos de POO.
    * Manipulando Dados e HashCode de um Objeto
    * Trocando Valores entre Instâncias de Objetos

4.  **Gerenciamento (com Repositórios):** Módulos mais complexos que gerenciam coleções de dados em memória.
    * **Sistema de Gerenciamento de Funcionários:** Permite cadastrar, listar e calcular o total de salários por departamento.
    * **Agenda de Contatos:** Permite adicionar (com limite), listar e procurar contatos por nome.

---

## 👤 Autor

* **YannPG**
    * GitHub: [https://github.com/YannPG](https://github.com/YannPG)

---

✨ Sinta-se à vontade para explorar a estrutura do código, dar feedback ou sugerir melhorias!
