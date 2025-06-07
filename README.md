# ☕ Exercícios de Java - Dominando a Programação Orientada a Objetos

Bem-vindo(a) ao meu repositório de exercícios práticos em Java! Este projeto é dedicado à aplicação e ao aprofundamento dos conhecimentos em **Programação Orientada a Objetos (POO)**.

---

## 🎯 Sobre o Projeto

O objetivo central deste projeto é desenvolver **10 exercícios distintos**, cada um explorando diferentes facetas e conceitos da POO, como Classes, Objetos, Encapsulamento, Herança, Polimorfismo, Abstração e Interfaces. Através da resolução destes desafios, busco solidificar minha compreensão e habilidade na implementação de soluções robustas e bem desenhadas em Java.

Os exercícios estão contidos no subprojeto `atividades/` (localizado em `Exercicios_Java/atividades/`), que utiliza uma estrutura Maven/Gradle para organização. O foco dos exercícios em si é a aplicação de Java puro e POO, com cada um possuindo seu próprio método `main` para execução individual. A estrutura interna dos exercícios segue uma organização em pacotes temáticos, como `metodos`, `arrays`, `objetos` e `classes`, dentro do pacote base `com.exercicios.atividades`.

---

## 🛠️ Tecnologias e Ambiente

* **Linguagem Principal:** Java
* **Versão do Java:** Java 17
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Gerenciamento do Subprojeto `atividades/`:** Maven
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como Configurar e Executar

Siga os passos abaixo para configurar o ambiente e executar os exercícios localmente.

**Pré-requisitos:**

* **Git:** Instalado e configurado. ([https://git-scm.com/downloads](https://git-scm.com/downloads))
* **JDK (Java Development Kit):** Java 17. Certifique-se de que o JDK está instalado e configurado corretamente no seu sistema (variáveis de ambiente `JAVA_HOME` e `PATH`).
* **IDE (Recomendado):** Uma IDE Java como IntelliJ IDEA, Eclipse ou Visual Studio Code com as extensões Java apropriadas.

**Passos para Execução:**

1.  **Clone o Repositório:**
    Abra seu terminal ou Git Bash e clone este repositório para sua máquina local:
    ```bash
    git clone [https://github.com/YannPG/Exercicios-Java.git](https://github.com/YannPG/Exercicios-Java.git)
    cd Exercicios-Java
    ```

2.  **Abra o Projeto na IDE:**
    * Importe o projeto na sua IDE de preferência. Você pode abrir a pasta raiz `Exercicios_Java/` e a IDE deve reconhecer o módulo `atividades/` (se configurado como um projeto Maven/Gradle).
    * A IDE geralmente cuidará de baixar as dependências (se houver alguma declarada no `pom.xml` ou `build.gradle` do subprojeto `atividades`). Para estes exercícios de POO puro, as dependências externas além do JDK devem ser mínimas.

3.  **Navegue e Execute um Exercício:**
    * Os arquivos Java de cada exercício estão localizados dentro de `Exercicios_Java/atividades/src/main/java/com/exercicios/atividades/`, organizados em subpacotes temáticos (ex: `metodos/`, `arrays/`, etc.).
    * Encontre a classe Java que contém o método `main()` do exercício que você deseja executar.
    * Clique com o botão direito no arquivo ou dentro da classe e selecione a opção "Run" (Executar) da sua IDE.

4.  **Execução pelo Terminal (Alternativa para classes simples):**
    Se um exercício for uma classe Java simples e você quiser compilá-lo e executá-lo manualmente:
    * Navegue até a pasta raiz do subprojeto `atividades`: `cd atividades`
    * Para compilar um exercício (exemplo para uma classe `CalculadoraApp.java` no pacote `com.exercicios.atividades.metodos`):
        ```bash
        javac -d target/classes src/main/java/com/exercicios/atividades/metodos/CalculadoraApp.java
        ```
        (Este comando assume que a pasta `target/classes` existe ou será criada. O Maven/Gradle criaria essa estrutura.)
    * Para executar a classe compilada (a partir da pasta `atividades`):
        ```bash
        java -cp target/classes com.exercicios.atividades.metodos.CalculadoraApp
        ```
    * **Nota:** A execução via IDE é geralmente mais direta para estes cenários.

---

## 📚 Lista dos 10 Exercícios

Os exercícios estão organizados nos seguintes pacotes dentro de `com.exercicios.atividades`:

1.  **Pacote `metodos` (Métodos)**
    * **1.1 Calculadora Simples:** Classe `Calculadora` com métodos para as quatro operações básicas. Permite ao usuário interagir e ver o resultado.
    * **1.2 Verificador de Palíndromos:** Método para verificar se uma String é um palíndromo.
    * **1.3 Fatorial (Recursivo):** Método recursivo para cálculo de fatorial.
    * **1.4 Conversor de Temperaturas:** Classe `ConversorTemperatura` para conversões Celsius-Fahrenheit.

2.  **Pacote `arrays` (Arrays Multidimensionais)**
    * **2.1 Maior e Menor Elemento em uma Matriz:** Encontra o maior e menor valor em uma matriz de inteiros.
    * **2.2 Soma das Diagonais de uma Matriz Quadrada:** Calcula a soma das diagonais principal e secundária.

3.  **Pacote `objetos` (Manipulação de Objetos e Referências)**
    * **3.1 Manipulando Dados de um Objeto:** Classe `Numero` para demonstrar manipulação de atributos e `System.identityHashCode`.
    * **3.2 Trocando Valores entre Objetos (simulado):** Classe `ValorContainer` e um método estático para trocar valores entre instâncias.

4.  **Pacote `classes` (Classes e Objetos)**
    * **4.1 Sistema de Gerenciamento de Funcionários:** Classe `Funcionario` e funcionalidades para gerenciar uma lista de funcionários.
    * **4.2 Agenda de Contatos:** Classe `Contato` para criar uma agenda simples com funcionalidades de adição, listagem e busca.

---

## 👤 Autor

* **YannPG**
    * GitHub: [https://github.com/YannPG](https://github.com/YannPG)

---

✨ Sinta-se à vontade para explorar, dar feedback ou sugerir melhorias!
