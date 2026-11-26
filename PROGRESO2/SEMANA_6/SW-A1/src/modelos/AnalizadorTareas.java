package modelos;

public class AnalizadorTareas {

    private Tarea[] tareas;

    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public int contarCompletas(){
        if (tareas==null)
            return 0;
        int contador = 0;
        for (Tarea t : tareas){
            if (t != null && t.isCompletada())
                contador++;
        }
        return contador;
    }

    public double calcularHorasTotales(){
        if (tareas==null)
            return 0;
        double total = 0.0;
        for (Tarea t : tareas){
            if (t != null)
                total += t.getHorasEstimadas();
        }
        return total;
    }

    public Tarea buscarPorCodigo(String codigo){
        if (tareas == null || codigo == null)
            return null;
        for (Tarea t : tareas){
            if (t != null && codigo.equals(t.getCodigo()))
                return t;
        }
        return null;
    }
    public Tarea obtenerTareaMayorDuracion() {
        if (tareas == null) {
            return null;
        }
        Tarea mayor = null;
        for (Tarea t : tareas) {
            if (t != null) {
                if (mayor == null || t.getHorasEstimadas() > mayor.getHorasEstimadas()) {
                    mayor = t;
                }
            }
        }
        return mayor;
    }
    public double calcularPorcentajeCompletadas() {
        if (tareas == null) {
            return 0.0;
        }
        int validas = 0;
        int completadas = 0;
        for (Tarea t : tareas) {
            if (t != null) {
                validas++;
                if (t.isCompletada()) {
                    completadas++;
                }
            }
        }
        return validas == 0 ? 0.0 : (completadas * 100.0) / validas;
    }

}
