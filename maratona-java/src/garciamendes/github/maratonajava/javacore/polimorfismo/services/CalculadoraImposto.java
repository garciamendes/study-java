package garciamendes.github.maratonajava.javacore.polimorfismo.services;

import garciamendes.github.maratonajava.javacore.polimorfismo.dominio.Computador;
import garciamendes.github.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
  public static void CalcularImpostoComputador(Computador computador) {
    System.out.println("Calculando imposto do computador...");

    System.out.println("Computador: " + computador.getNome());
    System.out.println("Valor: " + computador.getValor());
    System.out.printf("Imposto a ser pago: %.2f \n", computador.CalcularImporto());
  }

  public static void CalcularImpostoTomate(Tomate tomate) {
    System.out.println("Calculando imposto do tomate...");

    System.out.println("Tomate: " + tomate.getNome());
    System.out.println("Valor: " + tomate.getValor());
    System.out.printf("Imposto a ser pago: %.2f \n", tomate.CalcularImporto());
  }
}
