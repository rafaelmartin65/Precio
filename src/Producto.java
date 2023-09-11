public class Producto extends Precio{
    // variable de instancia
    public int codigo;
    // metodos publicos

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int x){
        codigo = x;
    }
    public void setProducto(int codigo, double precio){
        setCodigo(codigo);
        setEuros(precio);
    }

    public String toString(){
        return "Codigo: " + codigo + "; precio: " + euros + " euros";
    }

    public boolean equals(Object a){

        if (a instanceof Producto)
            return (codigo == ((Producto) a).getCodigo());
        else
            return false;

    }
}
