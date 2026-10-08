package CAMPAÑA_PUBLIC;

public class Campania {

    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void mostrarInformacion(){
        System.out.println("NOMBRE DE LA CAMPAÑA: " + nombre);
        System.out.println("PRESUPUESTO: " + presupuesto);
        System.out.println("PLATAFORMA: " + plataforma);
        System.out.println("ACTIVO: "+ activa);
        System.out.println("\n");
    }
    public void activar(){
        activa = true;
    }
    void descativar(){
        activa = false;
    }
    void mostrarPresupuesto(){
        System.out.println("El presupuesto disponible para la campaña es de " + presupuesto);
    }

    /*
    ¿Por qué activar una campaña no modifica los demás?
        Por qué cada campaña es un objeto independiente, es decir, están almacenadas
        en objetos diferentes, por lo que al modificar uno, los demás se mantienen
        intactos.
     */

}
