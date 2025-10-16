package garciamendes.github.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto {
  public static final double IMPOSTO_PORCENTO = .21;

  public Computador(String nome, double valor) {
    super(nome, valor);
  }

  @Override
  public double CalcularImporto() {
    return this.valor * IMPOSTO_PORCENTO;
  }
}
