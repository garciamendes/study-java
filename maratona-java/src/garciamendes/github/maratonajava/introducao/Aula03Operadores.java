package garciamendes.github.maratonajava.introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        // + - / * %
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println(resultado);

        resultado = numero2 - numero1;
        System.out.println(resultado);

        resultado = numero1 * numero2;
        System.out.println(resultado);

        resultado = numero2 / numero1;
        System.out.println(resultado);

        resultado = numero2 % 3;
        System.out.println(resultado);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        // && || !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = (valorTotalContaCorrente > valorPlaystation
                || valorTotalContaPoupanca > valorPlaystation)
                && idade > 18;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
    }
}
