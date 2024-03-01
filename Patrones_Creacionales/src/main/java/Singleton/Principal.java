package Singleton;

public class Principal {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();

        System.out.println(s1 = s2);
        if (s1 == s2) {
            System.out.println("Se ha creado una única instancia de Singleton.");
        } else {
            System.out.println("Se han creado múltiples instancias de Singleton.");
        }
    }
}
