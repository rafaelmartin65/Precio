import java.util.ArrayList;

public class EjemploArrayList06 {
    public static void main (String [] args){
        ArrayList<String> a = new ArrayList<>();

        a.add("rojo");
        a.add("azul");
        a.add("verde");
        a.add("amarillo");
        a.add("blanco");

        System.out.println("contenido de la lista: ");
        for (String color : a){
            System.out.println(color);
        }

        a.add(1,"turquesa");
        System.out.println("Contenido después de insertar valor en la posición 1: ");

        for (String color : a){
            System.out.println(color);
        }



    }
}
