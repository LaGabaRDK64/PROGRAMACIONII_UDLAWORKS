package CUENTA_DE_VENDEDOR;

public class mainV {
    public static void mostrarinformacion(Vendedor vendedor_placeholder){
        System.out.println("NOMBRE: " + vendedor_placeholder.getNombre());
        System.out.println("VENTAS: " + vendedor_placeholder.getVentas());
        System.out.println("COMISION: " + vendedor_placeholder.getComision());
        System.out.println("ESTADO: " + vendedor_placeholder.isActivo());
    }
    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor("Fabricio",10.2,30.3,false);
        Vendedor vendedor2 = new Vendedor("Carmen",20.20,30.3,true);


    }
}
