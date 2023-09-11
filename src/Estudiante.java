public class Estudiante {
    private int codigo;
    private String nombre;
    private String direccion;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, String direccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    @Override
    public String toString() {
        return  "codigo= " + codigo +
                "\nnombre= " + nombre +
                "\ndireccion= " + direccion;
    }


}
