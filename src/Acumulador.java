public class Acumulador implements Modificacion{
    private int valor;
    public Acumulador(int i){
        valor = i;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public void incremento(int a) {
        valor += a;
    }
}
