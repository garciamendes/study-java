package garciamendes.github.maratonajava.javacore.introducaoclasses.shared;

public interface PessoaInterface {
    public abstract String Imprimir();

    default void CheckPermissions() {
        System.out.println("Aqui resolve algo, e pode ser usando em qualquer lugar sem precisar sobrescrever");
    };
}
