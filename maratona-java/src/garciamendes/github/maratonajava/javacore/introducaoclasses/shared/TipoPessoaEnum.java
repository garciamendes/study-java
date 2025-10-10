package garciamendes.github.maratonajava.javacore.introducaoclasses.shared;

public enum TipoPessoaEnum {
  TIPO_FISICA(1, "Pessoa Fisica"),
  TIPO_JURIDICA(2, "Pessoa Juridica");

  private int valor;
  private String label;

  TipoPessoaEnum(int valor, String label) {
    this.valor = valor;
    this.label = label;
  }

  public int getValor() {
    return this.valor;
  }

  public String getLabel() {
    return this.label;
  }
}
