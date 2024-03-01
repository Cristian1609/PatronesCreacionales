package Factory;

public class Principal {

    public static void main(String[] args) {
        
        Fabrica f1 = new Fabrica();
        
        Producto productoA =  f1.crearProducto("A");
        productoA.operacion();
        
        Producto productoB =  f1.crearProducto("B");
        productoB.operacion();
        
    }

}
