package garciamendes.github.praticas.calculadora.resultado;

import java.util.Scanner;

import garciamendes.github.praticas.calculadora.dominio.Calculadora;

public class ResultadoCalculadoraMultiplicacao {
  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    float num1 = enter.nextFloat();

    System.out.print("Digite o segundo número: ");
    float num2 = enter.nextFloat();

    Calculadora.Multiplicacao(num1, num2);

    enter.close();
  }
}
