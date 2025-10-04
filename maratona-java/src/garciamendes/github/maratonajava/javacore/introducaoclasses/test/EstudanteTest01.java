package garciamendes.github.maratonajava.javacore.introducaoclasses.test;

import garciamendes.github.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
  public static void main(String[] args) {
    Estudante estudante = new Estudante();

    estudante.nome = "Garcia";
    estudante.idade = 25;
    estudante.sexo = 'M';

    System.out.println("Nome: " + estudante.nome);
    System.out.println("Idade: " + estudante.idade);
    System.out.println("Sexo: " + estudante.sexo);
  }
}
