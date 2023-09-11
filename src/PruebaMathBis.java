/*
* Ejemplo uso clase final MathBis
* Declaración clase PruebaMathBis
*
* */

public class PruebaMathBis {
    public static void main(String [] args){
        for (int i = -5; i < 10 ; i++){
            double x = i/5.0;
            System.out.print("Para x= " + x);
            System.out.print(" : asinh(x)= " + MathBis.asinh(x));
            System.out.println(", acosh(x)= " + MathBis.acosh(x));
        }
    }
}
