
// Declaracion de la clase factura
public class Factura implements Variaciones, Constantes {
    private double totalSinIVA;
    private final static double IVA = 0.16;

    public static void main(String [] args){
        Factura a = new Factura();
        a.asignaValor(250.0);
        System.out.println("El precio sin IVA es: " + a.sinIVA());
        System.out.println("El precio con IVA es: " + a.conIVA());
        System.out.println("Rebajado durante el mes de mayo un 20%");
        a.rebaja(20);
        System.out.println("Rebajado sin IVA es: " + a.sinIVA());
        System.out.println("Rebajado con IVA es: " + a.conIVA());

    }
    // metodos
    public double sinIVA(){
        return totalSinIVA;
    }

    public double conIVA(){
        return totalSinIVA * (1 + IVA);
    }

    @Override
    public void asignaValor(double x) {
        if(valorMinimo < x) totalSinIVA = x;
        else totalSinIVA = 0;
    }

    @Override
    public void rebaja(double t) {
        totalSinIVA *= (1-t/100);
    }


}
