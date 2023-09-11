/*
* Ejemplo de uso de la declaración de una clase abstracta
* Declaracion de clase Rectangulo
 */
public class Rectangulo extends FiguraGeometrica{
    // Definicion atributos
    private double base;
    private double altura;

    // Definicion metodos
    public Rectangulo(double largo, double ancho){
        super("Rectangulo");
        base = largo;
        altura = ancho;
    }

    public double area(){
        return base * altura;
    }
}
