package CONTRASEÑAS;

public class mainC {

    public class Main {
        public static void main(String[] args) {
            System.out.println("--- PRUEBA 1: Usando el constructor ---");
            Usuario usuario1 = new Usuario("Carlos", "carlos@gmail.com", "123456");

            System.out.println("Nombre: " + usuario1.getNombre());
            System.out.println("Correo: " + usuario1.getCorreo());

        }
    }
}
