package Prototype;

public class PruebaPrototype {

    public static void main(String[] args) {
        
        CuentaAhorro cuentaA = new CuentaAhorro();
        CuentaAhorro cuentaB = new CuentaAhorro();
        cuentaA.setMonto(200);
        CuentaAhorro cuentaClonada = ( CuentaAhorro) cuentaA.clonar();
        
        if (cuentaClonada != null) {
            System.out.println(cuentaClonada);
        }
        
        System.out.println(cuentaClonada == cuentaA);
        System.out.println(cuentaB);
    }

}
