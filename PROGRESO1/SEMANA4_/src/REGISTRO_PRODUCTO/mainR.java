package REGISTRO_PRODUCTO;

public class mainR {
    public static void main (String[] args){

        Producto producto1 = new Producto("Mouse",25.50,10);
        Producto producto2 = new Producto("Telefonos",40.50,20);
        Producto producto3 = new Producto("Televisor",227.50,30);
        Producto producto4 = new Producto("Reloj Inteligente",35.50,60);
        Producto producto5 = new Producto("Diodos",55.50,50);

        System.out.println("Existen en el codigo " + producto1.getContadorProductos() + " productos");

    }
}
