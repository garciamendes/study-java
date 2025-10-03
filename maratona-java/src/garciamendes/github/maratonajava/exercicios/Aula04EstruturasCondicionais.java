package garciamendes.github.maratonajava.exercicios;

// Esta aula mostra como usar estruturas condicionais (if-else) em Java.
// O objetivo é calcular o imposto devido com base no salário anual.
public class Aula04EstruturasCondicionais {
  public static void main(String[] args) {
    double salarioAnual = 25000; // valor do salário anual
    // Percentuais de imposto para cada faixa salarial
    double primeiraFaixa = 9.70 / 100;
    double segundaFaixa = 37.35 / 100;
    double terceiraFaixa = 49.50 / 100;
    double impostoDevido = 0; // valor inicial do imposto

    // Estrutura condicional para definir a faixa de imposto
    if (salarioAnual <= 34712) {
      // Se o salário está na primeira faixa
      impostoDevido *= primeiraFaixa;
    } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
      // Se está na segunda faixa
      impostoDevido *= segundaFaixa;
    } else {
      // Se está na terceira faixa
      impostoDevido *= terceiraFaixa;
    }

    // Imprime o valor do imposto e do salário anual
    System.out.println("Imposto: " + impostoDevido);
    System.out.println("SALARIO ANUAL: " + salarioAnual);
  }
}
