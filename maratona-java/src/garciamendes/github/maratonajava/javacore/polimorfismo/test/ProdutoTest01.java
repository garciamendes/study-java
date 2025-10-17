package garciamendes.github.maratonajava.javacore.polimorfismo.test;

import garciamendes.github.maratonajava.javacore.polimorfismo.dominio.Computador;
import garciamendes.github.maratonajava.javacore.polimorfismo.dominio.Tomate;
import garciamendes.github.maratonajava.javacore.polimorfismo.services.CalculadoraImposto;

public class ProdutoTest01 {
  public static void main(String[] args) {
    Computador computador = new Computador("G15", 4503);
    CalculadoraImposto.CalcularImposto(computador);

    System.out.println("=========================================");

    Tomate tomate = new Tomate("Tomate English", 23);
    CalculadoraImposto.CalcularImposto(tomate);
  }
}
