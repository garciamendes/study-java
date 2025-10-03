package garciamendes.github.maratonajava.exercicios;

/*
 * Exercício da aula 02: Tipos Primitivos
 *
 * O objetivo é criar variáveis para armazenar informações pessoais e imprimir uma mensagem formatada.
 *
 * Variáveis usadas:
 * - name: armazena o nome da pessoa
 * - address: armazena o endereço
 * - salary: armazena o salário recebido
 * - date: armazena a data do recebimento
 *
 * O System.out.println é usado para mostrar a mensagem no console.
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
