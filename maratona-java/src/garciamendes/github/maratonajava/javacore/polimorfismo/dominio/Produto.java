package garciamendes.github.maratonajava.javacore.polimorfismo.dominio;

import garciamendes.github.maratonajava.javacore.polimorfismo.shared.Taxacao;

public abstract class Produto implements Taxacao {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }
}
