/*
* Ejemplo uso de ArrayList
 */

import java.util.ArrayList;

public class EjemploArrayList01 {
    public static void main(String [] args){
        // Declaración e inicialización del objeto de tipo ArrayList
        ArrayList<String> a = new ArrayList<String>();

        // Imprimimos el número de elementos del array
        System.out.println("Nº elementos del ArrayList: " + a.size());

        // Añadimos elementos al ArrayList
        a.add("rojo");
        a.add("verde");
        a.add("azul");

        // Imprimimos de nuevo el número de elementos
        System.out.println("Nº elementos del ArrayList: " + a.size());

        // Añadimos más elementos el ArrayList
        a.add("blanco");

        // Imprimimos de nuevo el número de elementos
        System.out.println("Nº elementos del ArrayList: " + a.size());

        // Imprimimos los elementos que estan en una posición determinada
        System.out.println("El elemento que está en la posición 0: " + a.get(0));
        System.out.println("El elemento que está en la posición 3: " + a.get(3));

    }
}
