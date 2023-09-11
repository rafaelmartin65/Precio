import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList09 {
    public static void main (String [] args){

        // Declarar ArrayList
        ArrayList<String> a = new ArrayList<>();

        a.add("Juan");
        a.add("Pedro");
        a.add("Ana");
        a.add("Rafael");

        System.out.println("\nContenido del ArrayList en el orden original");
        for (String name : a){
            System.out.println(name);
        }

        Collections.sort(a);

        System.out.println("\nContenido después de ordenar: ");
        for (String name : a){
            System.out.println(name);
        }


    }
}
