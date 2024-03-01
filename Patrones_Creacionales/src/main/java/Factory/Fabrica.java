package Factory;

public class Fabrica {

    public Producto crearProducto(String producto) {

        if (producto.equals("A")) {
            return new ProductoConcretoA();
        } else if (producto.equals("B")) {
            return new ProductoConcretoB();
        }
        return null;

    }
}
