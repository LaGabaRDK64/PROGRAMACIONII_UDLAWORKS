package VIDEOJUEGO;

public class CASSET {

    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void inciar(){
        activo = true;
    }

    void cerrar(){
        activo = false;
    }

    public  void mostrarInformacion(){
        System.out.println("El nombre del videojuego es " + nombre);
        System.out.println("El genero del juego es " + genero);
        mostrarVersion();

        if (activo)
            System.out.println("El juego " + nombre + " inicio/esta activo");
        else
            System.out.println("El juego " + nombre + " se cerro/esta desactivado");

        System.out.println("\n");
    }

    void mostrarVersion(){
        System.out.println("La version del juego es " + version);

    }

}
