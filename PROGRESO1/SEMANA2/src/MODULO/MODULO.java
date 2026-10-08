package MODULO;

public class MODULO {

    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {

        System.out.println("Nombre del modulo: " + nombre);
        System.out.println("Lenguaje usado: " + lenguaje);
        MostrarVersion();
        MostrarEstado();
    }

    public void marcarTermiando() {
        terminado = true;
    }

    void MostrarEstado() {

        System.out.println("¿El programa esta terminado?" + terminado);

    }
    void MostrarVersion(){

        System.out.println("Version del modulo " + version);

    }

}
