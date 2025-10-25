-   Pacotes: Para organizar todos projetos (java é orietado a pacotes)

-   Tipo primitivos: São tipo que é guardado em memoria (palavras reservadas)

    -   int
    -   double
    -   float
    -   char
    -   byte
    -   short
    -   long
    -   boolean

-   Operadores Aritméticos: Podem ser utilizados para operações matemáticas

    -   ( + ) Soma
    -   ( - ) subtração
    -   ( / ) Divisão
    -   ( \* ) Multiplicação
    -   ( % ) Resto da divisão

-   Operadores Relacionais: Podem ser utilizados para operações de relações

    -   ( < ) Menor que
    -   ( > ) Maior que
    -   ( <= ) Menor igual que
    -   ( >= ) Maior igual que
    -   ( == ) igual que
    -   ( != ) Diferente que

-   Operadores Lógicos: Podem ser utilizados para operações lógicas
    -   ( && ) AND - Conjunção
    -   ( || ) OR - Disjunção (não exclusiva)
    -   ( ! ) NOT - Negação

---

## Programação Orientada a Objetos (OOP) em Java

### A Programação Orientada a Objetos (OOP) é um paradigma de programação que organiza o código em torno de objetos, que representam entidades do mundo real ou conceitos abstratos. Cada objeto possui atributos (dados) e métodos (comportamentos).

### Principais conceitos da OOP:

-   **Classe**: É um molde (modelo) para criar objetos. Define os atributos e métodos que os objetos terão.

-   **Objeto**: É uma instância de uma classe. Cada objeto tem seus próprios valores para os atributos definidos na classe.

-   **Encapsulamento**: Esconde os detalhes internos do objeto, permitindo acesso apenas por meio de métodos públicos.

-   **Herança**: Permite que uma classe herde atributos e métodos de outra, facilitando o reaproveitamento de código.

-   **Polimorfismo**: Permite que objetos de diferentes classes sejam tratados de forma semelhante, usando métodos com o mesmo nome.

-   **Abstração**: Foca nos aspectos essenciais de um objeto, ignorando detalhes desnecessários.

-   **getters** e setters: Métodos usados para acessar (get) e modificar (set) os valores dos atributos de uma classe, seguindo o princípio do encapsulamento.

-   **public:** Modificador de acesso que permite que o atributo, método ou classe seja acessado de qualquer lugar do código, inclusive de outros pacotes.
    _Exemplo: public int idade; // pode ser acessado de qualquer classe_

-   **private:** Modificador de acesso que restringe o acesso ao atributo ou método apenas dentro da própria classe onde foi declarado.
    _Exemplo: private String nome; // só pode ser acessado dentro da classe_

-   **protected:** Modificador de acesso que permite o acesso ao atributo ou método dentro da própria classe, em subclasses (mesmo que estejam em outros pacotes) e dentro do mesmo pacote.
    _Exemplo: protected double salario; // acessível na classe, subclasses e mesmo pacote_

-   **final:** Palavra-chave que indica que o valor de um atributo não pode ser alterado após ser definido, ou que um método não pode ser sobrescrito, ou que uma classe não pode ser estendida.
    _Exemplo: final int ANO = 2025; // constante, valor não pode mudar_

```java
// Define uma classe chamada Pessoa
class Pessoa {
  private String nome; // atributo privado, só pode ser acessado dentro da classe
  private int idade;   // atributo privado

  // Constructor
  public Pessoa() {} // Constructor desse modo possibilita eu criar sem passar dados

  public Pessoa(String nome, int idade) {} // Constructor desse modo, obrigatoriamente preciso passar dados pedido ao instanciar a classe

  // Getter para nome (permite ler o valor do atributo)
  public String getNome() { // public: pode ser acessado de qualquer lugar
    return nome;
  }

  // Setter para nome (permite modificar o valor do atributo)
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Getter para idade
  public int getIdade() {
    return idade;
  }

  // Setter para idade
  public void setIdade(int idade) {
    this.idade = idade;
  }

  // método
  public void apresentar() {
    System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
  }
}

// Cria um objeto da classe Pessoa e usa seus métodos
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa(); // cria objeto
    pessoa1.setNome("Ana");        // usa setter para definir nome
    pessoa1.setIdade(25);          // usa setter para definir idade
    pessoa1.apresentar();          // chama método
    System.out.println(pessoa1.getNome()); // usa getter para acessar nome
  }
}
```

---

## Classes Wrapper em Java

As classes Wrapper são objetos que encapsulam tipos primitivos. São úteis quando:

-   Precisamos usar tipos primitivos em coleções (ArrayList, HashSet, etc)
-   Precisamos converter strings em números
-   Precisamos tratar valor null
-   Precisamos usar métodos utilitários

### Tabela de Equivalência

| Tipo Primitivo | Wrapper Class | Tamanho | Valor Padrão |
| -------------- | ------------- | ------- | ------------ |
| byte           | Byte          | 1 byte  | 0            |
| short          | Short         | 2 bytes | 0            |
| int            | Integer       | 4 bytes | 0            |
| long           | Long          | 8 bytes | 0L           |
| float          | Float         | 4 bytes | 0.0f         |
| double         | Double        | 8 bytes | 0.0          |
| char           | Character     | 2 bytes | '\u0000'     |
| boolean        | Boolean       | 1 bit   | false        |

### Conceitos Importantes

1. **Autoboxing**: Conversão automática de primitivo para Wrapper

```java
Integer numero = 10; // int -> Integer
```

2. **Unboxing**: Conversão automática de Wrapper para primitivo

```java
int valor = numero; // Integer -> int
```

3. **Métodos Úteis**:

```java
Integer.parseInt("10");     // String -> int
Integer.valueOf("10");      // String -> Integer
Integer.toString(10);       // int -> String
```

4. **Valores Constantes**:

```java
Integer.MAX_VALUE;  // 2147483647
Integer.MIN_VALUE;  // -2147483648
```

### Observações Importantes

-   Use tipos primitivos quando performance for crítica
-   Wrappers ocupam mais memória que primitivos
-   Para comparar Wrappers, use equals() ao invés de ==
-   Existe cache para valores pequenos (-128 a 127 para Integer)

### Exemplo de Comparação

```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b);      // true (cache)

Integer c = 128;
Integer d = 128;
System.out.println(c == d);      // false
System.out.println(c.equals(d)); // true (forma correta)
```
