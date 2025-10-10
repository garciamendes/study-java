package garciamendes.github.maratonajava.javacore.introducaoclasses.dominio;

import garciamendes.github.maratonajava.javacore.introducaoclasses.shared.TipoPessoaEnum;

public class Pessoa {
  // Atributos da classe
  private String nome;
  private int idade;
  private char sexo;
  private TipoPessoaEnum tipoPessoa;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getTipoPessoa() {
    return this.tipoPessoa.getLabel();
  }

  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }
}
