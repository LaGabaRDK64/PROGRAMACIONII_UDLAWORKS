package CLIENTE_E_COMMERCE;

public class mainC {

    public static void mostrarInformacion(Cliente placeholder){
        System.out.println("NOMBRE: " + placeholder.getNombre());
        System.out.println("CORREO: " + placeholder.getCorreo());
        System.out.println("EDAD: " + placeholder.getEdad());
        System.out.println("SALDO: " + placeholder.getSaldo() + "\n");
    }
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Fernando Flores","fernan_flor2007@gmail.com",20,18.20);
        Cliente cliente_error = new Cliente("","",-50,-60.6);

        System.out.println("TEST...\n=== INFORMACION CLIENTES ===");
        mostrarInformacion(cliente1);
        mostrarInformacion(cliente_error);

    }
}
