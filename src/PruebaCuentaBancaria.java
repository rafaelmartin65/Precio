
public class PruebaCuentaBancaria {
    public static void main(String [] args){
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);

        CuentaBancaria c1;
        c1 = new CuentaBancaria();
        System.out.println("Nueva cuenta con: " + c1.saldo() + "euros");
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);

        CuentaBancaria c2;
        c2 = new CuentaBancaria(20.0);
        System.out.println("Nueva cuenta con: " + c2.saldo() + "euros");
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);

    }
}
