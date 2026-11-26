package interfaz;


import modelo.Desarrollador;
import modelo.Proyecto;

public class mainD {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println(proyecto.mostrarEquipo());

        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Sofía", "QA", 25);

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println(proyecto.mostrarInfo());
        System.out.println("Total horas: " + proyecto.calcularTotalHoras());

        Desarrollador buscado = proyecto.buscarDesarrollador("D02");
        System.out.println("Buscar D02: " + (buscado != null ? buscado.mostrarInformacion() : "No existe"));

        Desarrollador noExiste = proyecto.buscarDesarrollador("D99");
        System.out.println("Buscar D99: " + (noExiste != null ? noExiste.mostrarInformacion() : "null"));

        Desarrollador mayor = proyecto.obtenerMayorCarga();
        System.out.println("Mayor carga: " + (mayor != null ? mayor.mostrarInformacion() : "null"));

        System.out.println("Eliminado D01: " + proyecto.eliminarDesarrollador("D01"));
        System.out.println("d1 sigue vivo: " + d1.mostrarInformacion());
        System.out.println(proyecto.mostrarEquipo());
    }
}