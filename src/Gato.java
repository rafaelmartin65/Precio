public class Gato {

    private String nombre;
    private String color;
    private String raza;

    public Gato() {
    }

    public Gato(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return
                "nombre= " + nombre + "\n" +
                "color= " + color + "\n" +
                "raza= " + raza + "\n+++++++++";
    }
}
