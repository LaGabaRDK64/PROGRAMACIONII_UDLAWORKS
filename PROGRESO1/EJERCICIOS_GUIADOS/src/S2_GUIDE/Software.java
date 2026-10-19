package S2_GUIDE;

public class Software {

    public String nombre;
    public double precio;
    String tipo;
    public boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("Estado: " + activo + "\n");
    }
    public void mostrarCategoria(){
        System.out.println("La categoria es: " + tipo);
    }

}
