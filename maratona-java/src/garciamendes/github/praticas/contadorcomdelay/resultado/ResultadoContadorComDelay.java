package garciamendes.github.praticas.contadorcomdelay.resultado;

public class ResultadoContadorComDelay {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.println(i + 1);
        }
    }
}
