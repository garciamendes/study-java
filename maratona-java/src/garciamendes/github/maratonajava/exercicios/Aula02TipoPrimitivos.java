package garciamendes.github.maratonajava.exercicios;

/*
 * Exercícios - Aula 02: Tipos Primitivos
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * "Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>"
 *
 */

public class Aula02TipoPrimitivos {
  public static void main(String[] args) {
    String name = "Matheus";
    String address = "Rua N";
    double salary = 2500.00;
    String date = "10/05/2024";

    System.out.println("Eu " + name + " morando no endereço " + address + " confirmo que recebi o salário de " + salary
        + " na data " + date);
  }
}
