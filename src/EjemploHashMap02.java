import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap02 {
    public static void main(String [] args){
        // Declarar diccionario
        HashMap<Integer,String> m = new HashMap<>();

        // Introducir datos en el diccionario
        m.put(924,"Amalia Nuñez");
        m.put(921,"Ciny Nero");
        m.put(700,"Cesar Vasquez");
        m.put(219,"Victor Tilla");
        m.put(537,"Allan Brito");
        m.put(605,"Esteba Quito");

        System.out.println("Todas las entradas del dicionario extraidas con entrySet");
        System.out.println(m.entrySet());

        System.out.println("Entradas del diccionario extraidas una a una");
        for (Map.Entry entrada : m.entrySet()){
            System.out.println(entrada);
        }
    }
}
