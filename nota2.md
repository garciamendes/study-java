# Nota do Projeto — study-java

Este documento descreve, em linguagem acessível para iniciantes, o que foi implementado no repositório "study-java" (maratona-java). Contém explicações de estrutura, dos arquivos analisados, conceitos usados e observações com sugestões de correção.

---

## Visão geral do projeto

- Projeto de estudos em Java organizado por pacotes (`packages`).
- Contém aulas introdutórias (tipos primitivos, estruturas de repetição, arrays, condicionais) e exercícios.
- Também há uma pasta com conceitos de Java avançados (ex.: polimorfismo / taxação).

---

## Estrutura de pacotes (observada)

- `garciamendes.github.maratonajava.introducao`
  Aulas básicas para aprender sintaxe e estruturas do Java (main, loops, arrays).
- `garciamendes.github.maratonajava.exercicios`
  Exercícios práticos que reforçam os conceitos introdutórios.
- `garciamendes.github.maratonajava.javacore.polimorfismo.*`
  Implementações relacionadas a polimorfismo (ex.: `Produto`, interface `Taxacao`).

---

## Arquivos analisados e explicação (por arquivo)

### introducao/Aula01OlaDevDojo.java

- Objetivo: mostrar a estrutura mínima de um programa Java.
- Conceitos: declaração de classe pública, método `public static void main(String[] args)` como ponto de entrada, impressão no console (`System.out.println`).
- Uso típico: executar para ver saída "Olá DevDojo!".

### introducao/Aula02TipoPrimitivos.java

- Objetivo: exemplificar tipos primitivos (int, long, double, float, byte, short, char, boolean).
- Conceito: tipos primitivos ocupam memória diretamente (não são objetos) e têm valores padrão.
- Exemplo comentado de declaração e uso de variáveis.

### exercicios/Aula02TipoPrimitivos.java

- Exercício prático: cria variáveis (`String name`, `String address`, `double salary`, `String date`) e imprime uma mensagem concatenada no console.
- Conceitos: tipos de referência (`String`), concatenação de strings com `+`.

### introducao/Aula06EstruturasDeRepeticao.java

- Objetivo: demonstrar `while`, `do-while` e `for`.
- Conceitos:
  - `while` verifica condição antes de executar o bloco.
  - `do-while` executa ao menos uma vez e depois verifica.
  - `for` concentra inicialização, condição e incremento numa linha.
- Boa prática: cuidado com loops infinitos — atualizar variáveis de controle.

### exercicios/Aula04EstruturasCondicionais.java

- Objetivo: calcular imposto com base em faixas salariais usando `if-else`.
- Problema detectado (bug): a variável `impostoDevido` é inicializada com `0` e depois usa `impostoDevido *= taxa;` — multiplicar zero por qualquer taxa resulta em zero.
  - Correção esperada: calcular imposto com `impostoDevido = salarioAnual * taxa;` ou aplicar fórmula correta por faixa.
- Conceitos: operadores relacionais (`<=`, `>=`), estruturas condicionais, variáveis `double`.

### introducao/Aula07Arrays.java

- Objetivo: apresentar arrays (vetores) unidimensionais.
- Conceitos:
  - Declaração: `int[] numeros = new int[3];` cria array com tamanho fixo.
  - Índices iniciam em 0; último índice é `length - 1`.
  - Valor padrão para tipos primitivos (ex.: `int -> 0`, `boolean -> false`, `String -> null`).
  - Iteração via `for` indexado e `for-each`.
  - Inicialização literal: `int[] numeros2 = {1,2,3};`.

### introducao/Aula08ArraysMultidimencionais.java

- Objetivo: demonstrar arrays multidimensionais (matrizes).
- Conceitos:
  - Declaração: `int[][] arrayInt = new int[3][3];`
  - Acesso por `array[i][j]`.
  - Percorrer com dois `for` aninhados ou `for-each` em dois níveis.
  - Linhas podem ter tamanhos diferentes (arrays "jagged") se declarado como `new int[n][]`.

### javacore/polimorfismo/dominio/Produto.java

- Arquivo observado:
  - Classe abstrata `Produto` que implementa a interface `Taxacao`.
  - Atributos protegidos (`protected String nome; protected double valor;`).
  - Construtor para inicializar `nome` e `valor`.
  - Getters públicos (`getNome()`, `getValor()`).
- Conceitos:
  - `abstract` indica que a classe não pode ser instanciada diretamente — serve como base para subclasses.
  - Implementa `Taxacao` (provavelmente uma interface que define um método para calcular imposto). Sem o arquivo da interface, presume-se método tipo `double calcularImposto()` ou `double calcularTaxa()`.
  - `protected` permite acesso nas subclasses e no mesmo pacote.

---

## Explicação dos modificadores e palavras-chave (resumo final)

- public: acesso de qualquer lugar (outras classes, outros pacotes).
- private: acesso apenas dentro da própria classe.
- protected: acesso na própria classe, subclasses e classes do mesmo pacote.
- final:
  - em variáveis: torna valor constante (imutável).
  - em métodos: impede sobrescrita por subclasses.
  - em classes: impede que a classe seja estendida.
- getters / setters: métodos públicos que seguem encapsulamento para acessar/modificar atributos privados (ex.: `getNome()`, `setNome()`).

---

## Observações e sugestões práticas

1. Corrigir o bug em `Aula04EstruturasCondicionais.java`:
   - Trocar `impostoDevido *= primeiraFaixa;` por `impostoDevido = salarioAnual * primeiraFaixa;` (e equivalente nas demais faixas).
2. Padronizar comentários e exemplos: adicionar explicações no topo de cada arquivo sobre objetivo e como executar.
3. Para polimorfismo:
   - Incluir javadoc simples nas interfaces (`Taxacao`) e nas classes abstratas (`Produto`) explicando contratos esperados das subclasses.
4. Testes simples / execução:
   - Criar pequenas `main` classes ou testes JUnit para demonstrar comportamento esperado (ex.: calcular imposto para diferentes produtos).
5. Convenção:
   - Manter nomes em inglês ou português consistente no projeto; pacotes e classes já seguem um padrão, continue assim.

---

## Próximos passos recomendados para evolução do projeto

- Adicionar README com instruções de compilação/execution (ex.: `javac` / `mvn` / `gradle`).
- Implementar exemplos de herança e polimorfismo usando `Produto` e subclasses (ex.: `Livro`, `Eletronico`) com diferentes regras de taxação.
- Escrever testes unitários (JUnit) para validar cálculos de imposto e comportamentos esperados.
