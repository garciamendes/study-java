package garciamendes.github.maratonajava.javacore.introducaoclasses.test;

import garciamendes.github.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.nome = "Garcia";
    professor.idade = 25;
    professor.sexo = 'M';

    System.out.println("Nome: " + professor.nome + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);
  }
}
