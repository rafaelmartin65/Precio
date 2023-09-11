public class PruebaPrecio {
    public static void main(String[] args) {
        Precio p; // Crea un areferencia de la clase Precio

        p = new Precio(); // Crea objeto de la clase Precio

        System.out.println(p);
        // Llamada al método setEuros
        p.setEuros(56.8);

        System.out.println("Valor= " + p.getEuros()); // Llamada al metodo get Euros

        Precio q = new Precio();
        q.euros = 75.6;
        System.out.println("Valor= " + q.euros);
    }
}