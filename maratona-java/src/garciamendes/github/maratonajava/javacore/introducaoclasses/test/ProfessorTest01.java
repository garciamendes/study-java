package garciamendes.github.maratonajava.javacore.introducaoclasses.test;

import garciamendes.github.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.setNome("Garcia");
    professor.setIdade(25);
    professor.setSexo('M');

    System.out.println(
        "Nome: " + professor.getNome() + ", Idade: " + professor.getIdade() + ", Sexo: " + professor.getSexo());
  }
}
