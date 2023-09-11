public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " El nombre del cliente es "
                + nombre + " "
                + apellido + " y su edad es  "
                + edad + " años";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
