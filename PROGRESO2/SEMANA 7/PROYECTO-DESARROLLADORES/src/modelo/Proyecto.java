package modelo;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void agregarDesarrollador(Desarrollador desarrollador){
        if (desarrollador != null)
            desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion){
        if (desarrolladores == null)
            return null;

        for (Desarrollador j : desarrolladores){
            if (identificacion != null && identificacion.equalsIgnoreCase(j.getIdentificacion()))
                return j;
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion){

        Desarrollador eliminar = buscarDesarrollador(identificacion);

        if (eliminar != null)
            return desarrolladores.remove(eliminar);

        return false;

    }

    public double calcularTotalHoras(){
        if (desarrolladores == null)
            return 0.0;

        double total = 0.0;

        for (Desarrollador j : desarrolladores){
            if (j != null)
                total += j.getHorasAsignadas();
        }
        return total;
    }

    public Desarrollador obtenerMayorCarga() {
        if (desarrolladores == null || desarrolladores.isEmpty()) {
            return null;
        }
        Desarrollador mayor = null;
        for (Desarrollador d : desarrolladores) {
            if (d != null && (mayor == null || d.getHorasAsignadas() > mayor.getHorasAsignadas())) {
                mayor = d;
            }
        }
        return mayor;
    }

    public String mostrarEquipo(){
        if (desarrolladores.isEmpty())
            return "El proyecto " + nombre + "no tiene desarrolladors asignados.";

        String textlarge= "";

        for (Desarrollador j : desarrolladores){
            textlarge += j.mostrarInformacion();
        }

        return textlarge;

    }

    public String mostrarInfo(){

        return "Proyeto: " + nombre + "\nEquipo: \n" + mostrarEquipo();
    }

}
