package interfaz;
import modelos.*;

public class main {
    public static void main(String[] args) {
        MetodoPago pago1 = new Tarjeta("Ana", 1000.0, "****1234");
        MetodoPago pago2 = new Transferencia("Luis", 2000.0, "Banco X");
        MetodoPago pago3 = new BilleteraDigital("Sofía", 800.0, "PayWallet");
        MetodoPago pago4 = new PagoContraEntrega("Carlos", 500.0, 3.0);

        Compra compra1 = new Compra(100.0, pago1);
        Compra compra2 = new Compra(100.0, pago2);
        Compra compra3 = new Compra(100.0, pago3);
        Compra compra4 = new Compra(100.0, pago4);

        System.out.println("=== COMPRA CON TARJETA ===");
        System.out.println(compra1.mostrarInformacion());

        System.out.println("\n=== COMPRA CON TRANSFERENCIA ===");
        System.out.println(compra2.mostrarInformacion());

        System.out.println("\n=== COMPRA CON BILLETERA DIGITAL ===");
        System.out.println(compra3.mostrarInformacion());

        System.out.println("\n=== COMPRA CONTRA ENTREGA (DESAFÍO) ===");
        System.out.println(compra4.mostrarInformacion());
    }
}
