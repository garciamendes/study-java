- Pacotes: Para organizar todos projetos (java é orietado a pacotes)

- Tipo primitivos: São tipo que é guardado em memoria (palavras reservadas)
  - int
  - double
  - float
  - char
  - byte
  - short
  - long
  - boolean

- Operadores Aritméticos: Podem ser utilizados para operações matemáticas
  - ( + ) Soma
  - ( - ) subtração
  - ( / ) Divisão
  - ( * ) Multiplicação
  - ( % ) Resto da divisão

- Operadores Relacionais: Podem ser utilizados para operações de relações
  - ( < ) Menor que
  - ( > ) Maior que
  - ( <= ) Menor igual que
  - ( >= ) Maior igual que
  - ( == ) igual que
  - ( != ) Diferente que

- Operadores Lógicos: Podem ser utilizados para operações lógicas
  - ( && ) AND - Conjunção
  - ( || ) OR - Disjunção (não exclusiva)
  - ( ! ) NOT - Negação

-----------------

## Programação Orientada a Objetos (OOP) em Java

### A Programação Orientada a Objetos (OOP) é um paradigma de programação que organiza o código em torno de objetos, que representam entidades do mundo real ou conceitos abstratos. Cada objeto possui atributos (dados) e métodos (comportamentos).

### Principais conceitos da OOP:
- Classe: É um molde (modelo) para criar objetos. Define os atributos e métodos que os objetos terão.

- Objeto: É uma instância de uma classe. Cada objeto tem seus próprios valores para os atributos definidos na classe.

- Encapsulamento: Esconde os detalhes internos do objeto, permitindo acesso apenas por meio de métodos públicos.

- Herança: Permite que uma classe herde atributos e métodos de outra, facilitando o reaproveitamento de código.

- Polimorfismo: Permite que objetos de diferentes classes sejam tratados de forma semelhante, usando métodos com o mesmo nome.

- Abstração: Foca nos aspectos essenciais de um objeto, ignorando detalhes desnecessários.

```java
// Define uma classe chamada Pessoa
class Pessoa {
  String nome; // atributo
  int idade;   // atributo

  // método
  void apresentar() {
    System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
  }
}

// Cria um objeto da classe Pessoa e usa seus métodos
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa(); // cria objeto
    pessoa1.nome = "Ana";
    pessoa1.idade = 25;
    pessoa1.apresentar(); // chama método
  }
}
```