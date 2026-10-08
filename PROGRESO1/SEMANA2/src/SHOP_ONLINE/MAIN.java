package SHOP_ONLINE;

public class MAIN {
    public static void main(String[] args){

        PRODUCT product1 = new PRODUCT();
        PRODUCT product2 = new PRODUCT();
        PRODUCT product3 = new PRODUCT();

        product1.nombre = "Audífonos Bluetooth";
        product1.precio = 32.50;
        product1.categoria = "Tecnologia";
        product1.disponible = false;

        product2.nombre = "Teclado RGB";
        product2.precio = 55.75;
        product2.categoria = "Tecnologia";
        product2.disponible = true;

        product3.nombre = "Mouse";
        product3.precio = 45.50;
        product3.categoria = "Tecnologia";
        product3.disponible = true;

        int i = 0;
        System.out.println("-----INFORMACION PRODUCTOS-----");
        System.out.println("||--Producto " + ++i);
        product1.mostrarInformacion();
        System.out.println("||--Producto " + ++i);
        product2.mostrarInformacion();
        System.out.println("||--Producto " + ++i);
        product3.mostrarInformacion();

        i = 0;
        System.out.println("\nCAMBIO ESTADO\n");
        product1.cambiarDisponibilidad(true);
        product2.cambiarDisponibilidad(false);
        System.out.println("||--Producto " + ++i);
        product1.mostrarDisponibilidad();
        product1.mostrarPrecio();
        System.out.println("||--Producto " + ++i);
        product2.mostrarDisponibilidad();
        product2.mostrarPrecio();
        System.out.println("||--Producto " + ++i);
        product3.mostrarDisponibilidad();
        product3.mostrarPrecio();

    }
}
