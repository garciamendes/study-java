package garciamendes.github.maratonajava.javacore.polimorfismo.services;

import garciamendes.github.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
