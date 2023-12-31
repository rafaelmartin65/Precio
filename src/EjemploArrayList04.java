import java.util.ArrayList;

public class EjemploArrayList04 {
    public static void main(String [] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("blanco");
        a.add("azul");
        a.add("blanco");

        System.out.println("Contenido de la lista: ");
        for (String color : a){
            System.out.println(color);
        }

        if (a.contains("blanco")){
            System.out.println("El blanco está en la lista");
        }

        a.remove("blanco");
        System.out.println("El contenido de la lista después de quitar la primera ocurrencia del color blanco");

        for (String color:a){
            System.out.println(color);
        }

        a.remove(2);
        System.out.println("El contenido de la lista después de quitar el contenido de la 2º posición");

        for (String color : a){
            System.out.println(color);
        }
    }
}
