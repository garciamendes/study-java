package garciamendes.github.maratonajava.javacore.oexcetion.exception;

public class ExeceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 2));
        System.out.println(divisao(10, 0));
        System.out.println(divisao(10));
    }

    private static int divisao(int... data) {
        if (data.length != 2) {
            throw new IllegalArgumentException("É necessário passar exatamente dois parâmetros");
        }

        if (data[1] == 0 || data[1] == 0) {
            throw new IllegalArgumentException("O parâmetro não pode ser zero");
        }

        try {
            return data[0] / data[1];
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro ao dividir");
        }
    }
}
