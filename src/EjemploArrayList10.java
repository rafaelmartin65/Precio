import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList10 {
    public static void main (String [] args){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(111,"Jaime Rodríguez","Londres"));
        estudiantes.add(new Estudiante(131,"Ana Méndez","nueva York"));
        estudiantes.add(new Estudiante(121,"Silvia Suarez","Hong Kong"));

        System.out.println("Lista desordenada: ");
        for (Estudiante e : estudiantes){
            System.out.println(e + "\n-----------");
        }

        Collections.sort(estudiantes,new SortByCodigo());

        System.out.println("\nLista ordenada por codigo: ");
        for (Estudiante e : estudiantes){
            System.out.println(e + "\n-----------");
        }

        Collections.sort(estudiantes,new SortByNombre());

        System.out.println("\nLista ordenada por nombre: ");
        for (Estudiante e : estudiantes){
            System.out.println(e + "\n-----------");
        }
    }
}
