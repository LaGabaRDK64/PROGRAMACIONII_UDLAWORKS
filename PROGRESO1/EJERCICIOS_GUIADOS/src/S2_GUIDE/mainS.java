package S2_GUIDE;

public class mainS {
    public static void main(String[] args){

        Software product1 = new Software();
        Software product2 = new Software();
        Software product3 = new Software();

        product1.nombre = "Mouse";
        product1.tipo = "Tecnologia";
        product1.activo = false;
        product1.precio = 20.5;

        product2.nombre = "Pantalla RGB";
        product2.tipo = "Tecnologia";
        product2.activo = false;
        product2.precio = 20.5;

        product3.nombre = "Teclado RGB";
        product3.tipo = "Tecnologia";
        product3.activo = true;
        product3.precio = 30.5;

        product1.mostrarInformacion();
        product2.mostrarInformacion();
        product3.mostrarInformacion();

    }
}
