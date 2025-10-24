package garciamendes.github.maratonajava.introducao;

// Esta aula mostra como usar estruturas de repetição (loops) em Java.
// Os principais tipos são: while, do-while e for.
public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // Loop while: repete enquanto a condição for verdadeira
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++; // incrementa o contador
        }

        System.out.println("####################");

        // Loop do-while: executa pelo menos uma vez, depois verifica a condição
        int count2 = 0;
        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 10);

        System.out.println("####################");

        // Loop for: inicialização, condição e incremento em uma linha
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
