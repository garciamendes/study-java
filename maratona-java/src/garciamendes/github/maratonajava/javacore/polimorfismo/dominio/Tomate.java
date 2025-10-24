package garciamendes.github.maratonajava.javacore.polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_PORCENTO = .6;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImporto() {
        return this.valor * IMPOSTO_PORCENTO;
    }
}
