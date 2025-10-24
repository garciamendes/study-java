package garciamendes.github.praticas.parimpar.dominio;

public class Parimpar {
    public static void ParImpar(int num) {
        if (num <= 0) {
            System.out.println("Digite um número valido");
            return;
        }

        int result = num % 2;

        if (result == 0) {
            System.out.println("Número é PAR");

            return;
        }

        System.out.println("Número é ÍMPAR");
    }
}
