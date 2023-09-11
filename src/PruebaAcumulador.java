public class PruebaAcumulador {
    public static void main(String [] args){
        Acumulador p = new Acumulador(25);
        p.incremento(12);
        System.out.println(p.getValor());
    }
}
