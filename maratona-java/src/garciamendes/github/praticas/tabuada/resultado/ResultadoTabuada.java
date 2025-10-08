package garciamendes.github.praticas.tabuada.resultado;

import java.util.Scanner;

public class ResultadoTabuada {
  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);

    System.out.print("Digite um número para ter a tabuado: ");
    int num = enter.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d X %d = %d\n", num, i, num * i);
    }

    enter.close();
  }
}
