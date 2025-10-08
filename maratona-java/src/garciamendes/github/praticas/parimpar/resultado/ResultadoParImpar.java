package garciamendes.github.praticas.parimpar.resultado;

import java.util.Scanner;

import garciamendes.github.praticas.parimpar.dominio.Parimpar;

public class ResultadoParImpar {
  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    Parimpar.ParImpar(enter.nextInt());

    enter.close();
  }
}
