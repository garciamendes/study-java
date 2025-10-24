package garciamendes.github.maratonajava.introducao;

// Esta aula ensina como trabalhar com arrays multidimensionais (matrizes) em Java.
// Arrays multidimensionais são arrays de arrays, como tabelas.
public class Aula08ArraysMultidimencionais {
    public static void main(String[] args) {
        // Criando uma matriz de inteiros 3x3
        int[][] arrayInt = new int[3][3];
        arrayInt[0][0] = 1;
        arrayInt[0][1] = 2;
        arrayInt[0][2] = 3;
        arrayInt[1][0] = 4;
        arrayInt[1][1] = 5;
        arrayInt[1][2] = 6;
        arrayInt[2][0] = 7;
        arrayInt[2][1] = 8;
        arrayInt[2][2] = 9;

        // Percorrendo a matriz com dois loops for
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }

        // Criando e inicializando uma matriz de Strings
        String[][] arrayString = { { "García", "Mendes" }, { "Java", "Python", "JavaScript" } };

        // Percorrendo a matriz de Strings com dois loops for
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                System.out.print(arrayString[i][j] + " ");
            }
            System.out.println();
        }

        // Usando for-each para percorrer a matriz de Strings
        for (String[] strings : arrayString) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
