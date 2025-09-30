package garciamendes.github.maratonajava.exercicios;

public class Aula04EstruturasCondicionais {
  public static void main(String[] args) {
    double salarioAnual = 25000;
    double primeiraFaixa = 9.70 / 100;
    double segundaFaixa = 37.35 / 100;
    double terceiraFaixa = 49.50 / 100;
    double impostoDevido = 0;

    if (salarioAnual <= 34712) {
      impostoDevido *= primeiraFaixa;

    } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
      impostoDevido *= segundaFaixa;
    } else {
      impostoDevido *= terceiraFaixa;
    }

    System.out.println("Imposto: " + impostoDevido);
    System.out.println("SALARIO ANUAL: " + salarioAnual);
  }
}
