package interfaz;

import modelos.AnalizadorTareas;
import modelos.Tarea;

public class mainTareas {

    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[6];
        tareas[0] = new Tarea("T01", "Diseñar BD", 6.0, true);
        tareas[1] = new Tarea("T02", "Crear API Login", 8.0, true);
        tareas[2] = new Tarea("T03", "Validar formularios", 4.5, false);
        tareas[3] = new Tarea("T04", "Pruebas unitarias", 5.0, false);
        tareas[4] = new Tarea("T05", "Configurar CI/CD", 7.5, true);
        tareas[5] = new Tarea("T06", "Documentar endpoints", 3.0, false);

        AnalizadorTareas analizador = new AnalizadorTareas(tareas);

        System.out.println("Completadas: " + analizador.contarCompletas());
        System.out.println("Horas totales: " + analizador.calcularHorasTotales());
        System.out.println("% completadas: " + analizador.calcularPorcentajeCompletadas());

        Tarea encontrada = analizador.buscarPorCodigo("T03");
        System.out.println("Buscar T03: " + (encontrada != null ? encontrada.mostrarInformacion() : "No encontrada"));

        Tarea noExiste = analizador.buscarPorCodigo("T99");
        System.out.println("Buscar T99: " + (noExiste != null ? noExiste.mostrarInformacion() : "No encontrada (null)"));

        Tarea mayor = analizador.obtenerTareaMayorDuracion();
        System.out.println("Mayor duración: " + (mayor != null ? mayor.mostrarInformacion() : "Sin tareas"));
    }
}
