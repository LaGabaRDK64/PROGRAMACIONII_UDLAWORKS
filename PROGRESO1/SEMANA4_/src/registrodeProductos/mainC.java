package registrodeProductos;

import java.sql.ClientInfoStatus;

public class mainC {
    public static void mostrarInformacion(clientes _placeholder){
        System.out.println("NOMBRE: " + _placeholder.getNombre());
        System.out.println("CORREO: " + _placeholder.getCorreo());
        System.out.println("ID: " + _placeholder.getId());
        System.out.println("ESTADO: " + _placeholder.isActivo() + "\n");
    }

    public static void main(String[] args) {

        clientes cliente1 = new clientes("Ana Perez", "ana@gmail.com");
        clientes cliente2 = new clientes("Camila Gomez", "cami@gmail.com");
        clientes cliente3 = new clientes("David Jones","davi@gmail.com");

        System.out.println("El numero de clientes son " + cliente1.getTotalClientes() + "\n");
        cliente2.desactivar();
        cliente3.desactivar();

        mostrarInformacion(cliente1);
        mostrarInformacion(cliente2);
        mostrarInformacion(cliente3);

    }
}
