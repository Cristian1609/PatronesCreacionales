package Prototype;

public class CuentaAhorro implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaAhorro() {
        tipo = "Ahorro";
    }

    @Override
    public ICuenta clonar() {

        CuentaAhorro cuenta = null;

        return cuenta;

    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "tipo=" + tipo + ", monto=" + monto + '}';
    }

}
