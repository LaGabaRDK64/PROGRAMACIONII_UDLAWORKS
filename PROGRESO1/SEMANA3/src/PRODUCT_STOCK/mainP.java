package PRODUCT_STOCK;

public class mainP {

    public static void mostrarinformacion(Producto producto_imprimir){

        System.out.println("NOMBRE PRODUCTO: " + producto_imprimir.getNombre());
        System.out.println("CATEGORIA: " + producto_imprimir.getCategoria());
        System.out.println("STOCK: " + producto_imprimir.getStock());
        System.out.println("PRECIO UNIDAD: " + producto_imprimir.getPrecio() + "\n");

    }

    public static void main(String[] args){

        Producto producto1 = new Producto("COCA-COLA","BEBIDAS/REFRESCOS",20,0.75);
        Producto producto2 = new Producto("DASANI-AGUA","BEBIDAS/REFRESCOS",-10,-50);

        mostrarinformacion(producto1);
        mostrarinformacion(producto2);

        System.out.println("Aumento de Stock en producto 1 y 2\n");
        producto1.aumentarStock(15);
        producto1.aumentarStock(20);

        mostrarinformacion(producto1);
        mostrarinformacion(producto2);

    }
}
