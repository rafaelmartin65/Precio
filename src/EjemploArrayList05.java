import java.util.ArrayList;

public class EjemploArrayList05 {
    public static void main (String [] args){
        ArrayList<String> a;
        a = new ArrayList<>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("Contenido del vector: ");
        for (String color : a){
            System.out.println(color);
        }

        a.set(2,"turquesa");
        System.out.println("Reemplazo de la 2º posición:  ");
        for (String color : a){
            System.out.println(color);

        }
    }
}
