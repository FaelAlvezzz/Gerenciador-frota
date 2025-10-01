# 🚢✈️ Gerenciador de Frota de Veículos

Este projeto é um sistema simples de cadastro e listagem de veículos de transporte (Aviões e Navios) desenvolvido em **Java**. Ele foi criado para demonstrar os principais conceitos da **Programação Orientada a Objetos (POO)**, como **Herança**, **Polimorfismo** e **Encapsulamento**.

---

## Estrutura do Projeto (Classes)

| Classe | Tipo | Conceitos de POO em Destaque |
| :--- | :--- | :--- |
| `Veiculo.java` | **Superclasse** (Classe Base) | Encapsulamento, Construtores, Métodos Genéricos. |
| `Aviao.java` | Subclasse | **Herança**, Sobrescrita (`@Override`), Atributos Específicos. |
| `Navio.java` | Subclasse | **Herança**, Sobrescrita (`@Override`), Múltiplos Construtores. |
| `app.java` | **Classe Principal** | **Polimorfismo** (Uso de `Veiculo[]`), Menu Interativo. |

---

## Funcionalidades do Sistema

O programa `app.java` apresenta um menu interativo que permite:

1.  **Adicionar Avião:** Cadastra os dados gerais do veículo e aplica um percentual de desconto no preço final da passagem (método exclusivo da subclasse).
2.  **Adicionar Navio:** Cadastra os dados gerais e específicos do Navio, incluindo o número de tripulantes.
3.  **Listar todos os Veículos:** Exibe os dados de todos os veículos cadastrados. Graças ao Polimorfismo, o método `imprimir()` correto (do Avião ou do Navio) é chamado automaticamente.
4.  **Sair:** Encerra a aplicação.

---

## Como Compilar e Executar

Para rodar o projeto, siga os passos abaixo no seu terminal (Linux, macOS ou Prompt de Comando/PowerShell no Windows):

### 1. Compilação
Certifique-se de que todos os arquivos `.java` estão no mesmo diretório.

Compila todas as classes (.java) no diretório

``javac *.java``

### 2. Execução

Execute a classe principal que contém o método main().

 Executa a aplicação principal

``java *.app``

---

### Demonstração de Conceitos de POO

O projeto ilustra claramente os seguintes pilares da Orientação a Objetos:

**Herança**: As classes Aviao e Navio estendem (herdam) funcionalidades da classe base Veiculo.

**Polimorfismo**: O array Veiculo[] em app.java pode armazenar tanto objetos Aviao quanto Navio. Ao chamar o método imprimir() em um objeto do array, o comportamento correto é determinado em tempo de execução.

**Sobrescrita**: Os métodos imprimir() e entradaDeDados() são reescritos nas subclasses para incluir os atributos específicos.
