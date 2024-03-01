package Factory;

public class ProductoConcretoB implements Producto {

    String atributo3, atributo4;

    public ProductoConcretoB() {
    }

    @Override
    public void operacion() {
        System.out.println("Metodo desde producto B");
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    public String getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }

    @Override
    public String toString() {
        return "ProductoConcretoB{" + "atributo3=" + atributo3 + ", atributo4=" + atributo4 + '}';
    }
    

}
