import java.util.HashMap;
import java.util.Scanner;

public class EjemploHashMap04 {
    public static void main(String [] args){
        // Declara diccionario HashMap
        HashMap<Integer,String> m = new HashMap<>();

        // Introducir datos en el diccionario
        m.put(924,"Amalia Nuñez");
        m.put(921,"Ciny Nero");
        m.put(700,"Cesar Vasquez");
        m.put(219,"Victor Tilla");
        m.put(537,"Allan Brito");
        m.put(605,"Esteba Quito");

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor introduzca el código: ");
        int codigoIntroducido = sc.nextInt();

        if (m.containsKey(codigoIntroducido)){
            System.out.print("El código " + codigoIntroducido + " corresponde a ");
            System.out.println(m.get(codigoIntroducido));
        }else{
            System.out.println("El código introducido no existe.");
        }
        sc.close();
    }
}
