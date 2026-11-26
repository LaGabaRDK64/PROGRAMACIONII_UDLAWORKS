package modelo;

public class Modulo {

    private String nombre;
    private String lenguaje;
    private int progreso;
    private boolean terminado;

    public Modulo(String nombre, String lenguaje, int progreso, boolean terminado) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.progreso = progreso;
        this.terminado = terminado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public String mostrarInformacion(){
        return "Nombre: " + getNombre()
                + "\nLenguaje: " + lenguaje
                + "\nProgreso: " + getProgreso()
                + "\nTerminado(true/false): " + isTerminado();
    }

}
