package CUPON_DESCUENTO;

public class MainCD {
    public static void main(String[] args){

        CUPON cupon1 = new CUPON();
        CUPON cupon2 = new CUPON();
        CUPON cupon3 = new CUPON();

        cupon1.codigo = "BIENVENIDA10";
        cupon1.porcentajeDescuento = 10.0;
        cupon1.descripcion = "Descuento especial de bienvenida para nuevos usuarios";
        cupon1.activo = true;

        cupon2.codigo = "FREESHIP";
        cupon2.porcentajeDescuento = 25.0;
        cupon2.descripcion = "25% de rebaja en ropa de verano";
        cupon2.activo = false;

        cupon3.codigo = "BLACKGRIDAY25";
        cupon3.porcentajeDescuento = 50.0;
        cupon3.descripcion = "Descuento exclusivo para clientes VIP";
        cupon3.activo = true;

        System.out.println("=== INFORMACION CUPONES ===");
        cupon1.mostrarInformacion();
        cupon1.mostrarDescuento(150.15);
        cupon2.mostrarInformacion();
        cupon2.mostrarDescuento(50.5);
        cupon3.mostrarInformacion();
        cupon3.mostrarDescuento(125.55);

    }
}
