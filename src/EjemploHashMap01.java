import java.util.HashMap;

public class EjemploHashMap01 {
    public static void main(String [] args){
        // Declaración HashMap
        HashMap<Integer,String> m = new HashMap<>();

        // Introducir datos en el diccionario
        m.put(924,"Amalia Nuñez");
        m.put(921,"Ciny Nero");
        m.put(700,"Cesar Vasquez");
        m.put(219,"Victor Tilla");
        m.put(537,"Allan Brito");
        m.put(605,"Esteba Quito");

        System.out.println("Los elementos m son: \n" + m);


    }
}
