/*
* Declaración de la clase abstracta FiguraGeometrica
*
 */


public abstract class FiguraGeometrica {
    // Declaracion atributos
    private String nombre;

    // Declaracion metodos
    abstract public double area();
    public FiguraGeometrica(String nombreFigura){
        nombre = nombreFigura;
    }

    final public boolean mayorQue(FiguraGeometrica otra){
        return area() > otra.area();
    }

    final public String toString(){
        return nombre + " con area = " + area();
    }
}
