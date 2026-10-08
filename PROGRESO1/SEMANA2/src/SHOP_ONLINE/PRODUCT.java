package SHOP_ONLINE;

public class PRODUCT {

    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void mostrarInformacion(){

        System.out.println("NOMBRE: " + nombre);
        System.out.println("PRECIO: " + precio);
        System.out.println("CATEGORIA: " + categoria);
        System.out.println("DISPONIBILIDAD: " + disponible);

    }
    public void cambiarDisponibilidad(boolean nuevaDisponibilidad){
        disponible = nuevaDisponibilidad;
    }
    void mostrarPrecio(){
        System.out.println("El producto esta en $" + precio);
    }
    void mostrarDisponibilidad(){
        if (disponible)
            System.out.println("El producto " + nombre + " se encuentra disponible");
        else
            System.out.println("El producto " + nombre + " no se encuentra disponible");

    }

}
