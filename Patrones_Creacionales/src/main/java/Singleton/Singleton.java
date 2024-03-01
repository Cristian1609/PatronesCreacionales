package Singleton;

public class Singleton {

    private static Singleton instancia;

    private Singleton() {

    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void verMensaje() {
        System.out.println("Instancia de singleton");
    }

    public static void setInstancia(Singleton instancia) {
        Singleton.instancia = instancia;
    }

    @Override
    public String toString() {
        return "Singleton{" + '}';
    }

}
