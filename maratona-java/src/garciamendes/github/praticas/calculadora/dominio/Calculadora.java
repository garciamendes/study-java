package garciamendes.github.praticas.calculadora.dominio;

public class Calculadora {
    public static void Soma(float num1, float num2) {
        float soma = num1 + num2;

        System.out.printf("\n A SOMA entre %.2f e %.2f é igual a %.2f \n", num1, num2, soma);
    }

    public static void Subtracao(float num1, float num2) {
        float sub = num1 - num2;

        System.out.printf("\n A SUBTRAÇÃO entre %.2f e %.2f é igual a %.2f \n", num1, num2, sub);
    }

    public static void Multiplicacao(float num1, float num2) {
        float mult = num1 * num2;

        System.out.printf("\n A MULTIPLICAÇÃO entre %.2f e %.2f é igual a %.2f \n", num1, num2, mult);
    }

    public static void Divisao(float num1, float num2) {
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Não pode haver divisão por ZERO");
            return;
        }

        float div = num1 / num2;

        System.out.printf("\n A DIVISÃO entre %.2f e %.2f é igual a %.2f \n", num1, num2, div);
    }
}
