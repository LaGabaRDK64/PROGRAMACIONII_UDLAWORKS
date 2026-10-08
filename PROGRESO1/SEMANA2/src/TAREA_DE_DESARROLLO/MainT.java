package TAREA_DE_DESARROLLO;

public class MainT {
    public static void main(String[] args){

        TAREA mat_tarea = new TAREA();
        TAREA leng_tarea = new TAREA();
        TAREA prog_tarea = new TAREA();

        mat_tarea.titulo = "OPERACIONES CON MATRICES";
        mat_tarea.responsable = "Carlos Mendoza";
        mat_tarea.horasEstimadas = 8.5;
        mat_tarea.completada = false;

        leng_tarea.titulo = "CLASIFICACION DE LIBROS POR GENERO LITERARIO";
        leng_tarea.responsable = "Ana Gómez";
        leng_tarea.horasEstimadas = 4.0;
        leng_tarea.completada = false;

        prog_tarea.titulo = "PRUEBAS UNITARIAS DE API";
        prog_tarea.responsable = "Luis Torres";
        prog_tarea.horasEstimadas = 3.0;
        prog_tarea.completada = false;

        System.out.println("===INFORMACION TAREAS===");
        mat_tarea.mostrarInformacion();
        leng_tarea.mostrarInformacion();
        prog_tarea.mostrarInformacion();

        mat_tarea.mostrarEstado(mat_tarea.completada);
        leng_tarea.mostrarEstado(leng_tarea.completada);
        prog_tarea.mostrarEstado(prog_tarea.completada);

        prog_tarea.completar();
        leng_tarea.completar();

        System.out.println("=== CAMBIOS ===");

        mat_tarea.mostrarEstado(mat_tarea.completada);
        leng_tarea.mostrarEstado(leng_tarea.completada);
        prog_tarea.mostrarEstado(prog_tarea.completada);

    }
}
