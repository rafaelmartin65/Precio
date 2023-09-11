import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemploArrayList08 {
    public static void main (String [] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(67);
        numeros.add(78);
        numeros.add(10);
        numeros.add(7);

        System.out.println("\nnúmeros en el orden original");
        for (Integer n : numeros){
            System.out.println(n);
        }

        Collections.sort(numeros);
        System.out.println("\nNúmeros ordenados");
        for (Integer n : numeros){
            System.out.println(n);
        }
    }
}
