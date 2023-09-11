public class CuentaBancaria {
    // Atributos
    private double saldo;
    public static int totalCuentas = 0;

    // Métodos
    public CuentaBancaria(){
        this(0.0);
    }
    public CuentaBancaria(double ingreso){
        saldo = ingreso;
        incCuentas();
    }
    public double saldo(){
        return saldo;
    }

    public static void incCuentas() {
        totalCuentas++;
    }

    public void transferencia(CuentaBancaria origen){
        saldo += origen.saldo;
        origen.saldo = 0;
    }
}
