package garciamendes.github.maratonajava.javacore.polimorfismo.services;

import garciamendes.github.maratonajava.javacore.polimorfismo.dominio.Produto;

public class CalculadoraImposto {
  public static void CalcularImposto(Produto produto) {
    System.out.println("Calculando imposto...");

    System.out.println("Produto: " + produto.getNome());
    System.out.println("Valor: " + produto.getValor());
    System.out.printf("Imposto a ser pago: %.2f \n", produto.CalcularImporto());
  }
}
