import java.util.HashMap;

public class EjemploHashMap011 {
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

        System.out.println(m.get(921));
        System.out.println(m.get(605));
        System.out.println(m.get(888));
    }
}
