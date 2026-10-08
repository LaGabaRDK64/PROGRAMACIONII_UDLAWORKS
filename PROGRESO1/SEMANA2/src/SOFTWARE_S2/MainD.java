package SOFTWARE_S2;

public class MainD {
    public static void main(String[] args){

        Dispositivo producto1 = new Dispositivo();
        Dispositivo producto2 = new Dispositivo();

        producto1.nombre = "Samsung Galaxy S24";
        producto1.tipo = "SmartPhone";
        producto1.activo = false;

        producto2.nombre = "LG Oled";
        producto2.tipo = "Televisor";
        producto2.activo = true;

        System.out.println("\n------PRODUCTO 1 INFO------\n");
        producto1.mostrarInformacion();
        System.out.println("\n------PRODUCTO 2 INFO------\n");
        producto1.mostrarInformacion();

        System.out.println("\n\n------Estado de los productos------\n");
        System.out.println("producto 1: ");
        producto1.mostrarEstado();
        System.out.println("producto 2: ");
        producto2.mostrarEstado();

        System.out.println("\nCAMBIO\n");
        producto1.activar();
        producto2.desactivar();

        System.out.println("\n\n------Estado de los productos------\n");
        System.out.println("producto 1: ");
        producto1.mostrarEstado();
        System.out.println("producto 2: ");
        producto2.mostrarEstado();

    }
}