package garciamendes.github.maratonajava.introducao;

// Esta aula ensina como trabalhar com arrays (vetores) em Java.
// Arrays são estruturas que armazenam múltiplos valores do mesmo tipo.
public class Aula07Arrays {
    public static void main(String[] args) {
        // Quando criamos um array, seus elementos recebem valores padrão:
        // byte, short, int, long, float, double = 0
        // char = '\u0000' (caractere nulo)
        // boolean = false
        // String (e outros objetos) = null

        // Criando um array de inteiros com 3 posições
        int[] numeros = new int[3];
        numeros[0] = 1; // atribui valor à primeira posição
        numeros[1] = 2; // segunda posição
        numeros[2] = 3; // terceira posição
        // numeros[3] = 4; // ERRO: posição fora do limite do array

        // Imprimindo os valores do array individualmente
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        // .length retorna o tamanho do array
        System.out.println(numeros.length);

        // Usando um loop for para percorrer o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Usando o for aprimorado (for-each) para percorrer o array
        for (int num : numeros) {
            System.out.println(num);
        }

        // Criando e inicializando um array diretamente
        int[] numeros2 = { 1, 2, 3, 4, 5 };
        for (int num : numeros2) {
            System.out.println(num);
        }

        // Arrays de Strings
        String[] nomes = new String[3];
        nomes[0] = "García";
        nomes[1] = "Mendes";
        nomes[2] = "Java";
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Inicializando array de Strings diretamente
        String[] nomes2 = { "García", "Mendes", "Java" };
        for (String nome : nomes2) {
            System.out.println(nome);
        }

        // Arrays de booleanos
        boolean[] booleanos = new boolean[2];
        // Valores padrão são false
        System.out.println(booleanos[0]);
        System.out.println(booleanos[1]);
        for (boolean bool : booleanos) {
            System.out.println(bool);
        }

        // Arrays de caracteres
        char[] chars = new char[3];
        // Valores padrão são '\u0000' (caractere nulo)
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
