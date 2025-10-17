package garciamendes.github.maratonajava.javacore.polimorfismo.test;

import garciamendes.github.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import garciamendes.github.maratonajava.javacore.polimorfismo.services.RepositorioArquivo;
import garciamendes.github.maratonajava.javacore.polimorfismo.services.RepositorioBancodeDados;
import garciamendes.github.maratonajava.javacore.polimorfismo.services.RepositorioMemoria;

public class RepositorioTest {
  public static void main(String[] args) {
    Repositorio repositorioBanco = new RepositorioBancodeDados();
    Repositorio repositorioArquivo = new RepositorioArquivo();
    Repositorio repositorioMemoria = new RepositorioMemoria();

    repositorioBanco.salvar();
    repositorioArquivo.salvar();
    repositorioMemoria.salvar();
  }
}
