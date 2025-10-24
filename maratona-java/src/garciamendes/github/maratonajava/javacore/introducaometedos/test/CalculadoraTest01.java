package garciamendes.github.maratonajava.javacore.introducaometedos.test;

import garciamendes.github.maratonajava.javacore.introducaometedos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(12, 3);
    }
}
