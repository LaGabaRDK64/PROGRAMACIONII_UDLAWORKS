package S4_GUIDE;

public class main {
    public static void main(String[] args) {

        System.out.println("Antes de crear objetos:");
        System.out.println("Total: " + Producto.getTotalCreados());

        Producto producto1 = new Producto("Mouse", 20.0, "Tecnología");

        System.out.println("\nDespués de crear uno:");
        System.out.println("Total: " + Producto.getTotalCreados());

        Producto producto2 = new Producto("Teclado", 45.5, "Tecnología");
        Producto producto3 = new Producto("Monitor", 180.0, "Electrónica");

        System.out.println("\nDespués de crear tres:");
        System.out.println("Total: " + Producto.getTotalCreados());

        System.out.println("\n--- Verificación de IDs automáticos ---");
        System.out.println("Objeto 1 → ID " + producto1.getId() + " (" + producto1.getNombre() + ")");
        System.out.println("Objeto 2 → ID " + producto2.getId() + " (" + producto2.getNombre() + ")");
        System.out.println("Objeto 3 → ID " + producto3.getId() + " (" + producto3.getNombre() + ")");
    }
}