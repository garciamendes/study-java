package garciamendes.github.maratonajava.javacore.introducaoclasses.test;

import garciamendes.github.maratonajava.javacore.introducaoclasses.dominio.Estudante;
import garciamendes.github.maratonajava.javacore.introducaoclasses.shared.TipoPessoaEnum;

public class EstudanteTest01 {
  public static void main(String[] args) {
    Estudante estudante = new Estudante();

    estudante.setNome("Garcia");
    estudante.setIdade(25);
    estudante.setSexo('M');
    estudante.setTipoPessoa(TipoPessoaEnum.TIPO_FISICA);

    System.out.println("Nome: " + estudante.getNome());
    System.out.println("Idade: " + estudante.getIdade());
    System.out.println("Sexo: " + estudante.getSexo());
    System.out.println("Tipo: " + estudante.getTipoPessoa());
    System.out.println("ABS: " + estudante.Imprimir());

    estudante.CheckPermissions();
  }
}
