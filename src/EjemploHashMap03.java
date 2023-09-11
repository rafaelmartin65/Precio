import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap03 {
    public static void main(String [] args){
        // Declarar HashMap diccionario
        HashMap<Integer,String> m = new HashMap<>();

        // Introducir datos en el diccionario
        m.put(924,"Amalia Nuñez");
        m.put(921,"Ciny Nero");
        m.put(700,"Cesar Vasquez");
        m.put(219,"Victor Tilla");
        m.put(537,"Allan Brito");
        m.put(605,"Esteba Quito");

        System.out.println("Código\tNombre\n-------\t---------------");
        for (Map.Entry pareja : m.entrySet()){
            System.out.print(pareja.getKey() + "\t\t");
            System.out.println(pareja.getValue());
        }
    }
}
