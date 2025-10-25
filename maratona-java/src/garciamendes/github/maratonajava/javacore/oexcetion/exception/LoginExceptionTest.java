package garciamendes.github.maratonajava.javacore.oexcetion.exception;

import java.util.Scanner;

public class LoginExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            logar(login, senha);
        } catch (LoginException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void logar(String login, String senha) throws LoginException {
        if (!login.equals("admin") || !senha.equals("12345")) {
            throw new LoginException();
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
