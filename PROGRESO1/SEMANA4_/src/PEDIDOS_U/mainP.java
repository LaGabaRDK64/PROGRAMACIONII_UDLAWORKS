package PEDIDOS_U;

public class mainP {
    public static void mostrarinformacion(Pedidos _placeholder){

        System.out.println("CLIENTE: " + _placeholder.getCliente());
        System.out.println("TOTAL A PAGAR: " + _placeholder.getTotal());
        System.out.println("ID: " + _placeholder.getNumero());
        System.out.println("ESTADO: " + _placeholder.getEstado());

    }
    public static void main(String[] args){

        Pedidos pedido1 = new Pedidos("Armando Mendoza",5.50);
        Pedidos pedido2 = new Pedidos("Juan Peña",6.50);

        mostrarinformacion(pedido1);
        mostrarinformacion(pedido2);

        pedido1.confirmar();

        mostrarinformacion(pedido1);
        mostrarinformacion(pedido2);

    }
}
