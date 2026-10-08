package TAREA_DE_DESARROLLO;

public class TAREA {

    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){

        System.out.println("TITULO TAREA: " + titulo);
        System.out.println("RESPONSABLE(autor@): " + responsable);
        System.out.println("HORAS ESTIMADAS: " + horasEstimadas);
        System.out.println("COMPLETA? : " + completada + "\n");

    }
    public void completar(){
        completada = true;
    }
    void mostrarResponsable(){
        System.out.println("El autor@ es " + responsable);
    }
    void mostrarEstado(boolean estado_){
        String estado = (estado_)?"esta completada":"no esta completada";
        System.out.println("La tarea " + titulo + " " + estado);
    }


}
