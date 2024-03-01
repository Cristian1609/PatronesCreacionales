package Factory;

public class ProductoConcretoA implements Producto {

    public ProductoConcretoA() {
    }

    String atributo1,atributo2;
    @Override
    public void operacion() {
        System.out.println("Metodo desde producto A");
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return "ProductoConcretoA{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + '}';
    }
    
}
