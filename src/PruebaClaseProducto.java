public class PruebaClaseProducto {

    public static void main(String [] args){
        Producto p = new Producto();

        p.setProducto(200201,15.8);
        System.out.println(p.toString());

        Producto q = new Producto();
        q.setCodigo(200202);
        q.setEuros(34.3);
        System.out.println(q.toString());


    }
}
