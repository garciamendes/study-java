package garciamendes.github.maratonajava.introducao;

public class Aula04EstruturasCondicionais {
  public static void main(String[] args) {
    // Imprima o dia da semana considerando 1 como domingo
    byte day = 1;

    switch (day) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terça");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }
  }
}
