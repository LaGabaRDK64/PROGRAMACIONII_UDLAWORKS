package interfaz;

import modelo.AnalizadorProyecto;
import modelo.Modulo;

public class mainProyectos {
    public static void main(String[] args){
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticación","Java",100,true);
        modulos[1] = new Modulo("Inventario","Java",75,false);
        modulos[2] = new Modulo("Reportes","SQL",100,true);
        modulos[3] = new Modulo("Notificaciones","Python",40,true);
        modulos[4] = new Modulo("Pagos","Java",15,false);

        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);
        System.out.println(analizador.listarModulos());

        System.out.println("Modulos terminados: " + analizador.contarTerminados());
        System.out.println("Progreso promedio: " + analizador.calcularProgresoPromedio());

        Modulo encontrado = analizador.buscarModulo("Autenticación");
        System.out.println("\nBusqueda exito:\n");
        if (encontrado != null)
            System.out.println(encontrado.mostrarInformacion());
        else
            System.out.println("Modulo no encontrado");

        Modulo noEncontrado = analizador.buscarModulo("Hola");
        System.out.println("\nBusqueda exito:\n");
        if (encontrado != null)
            System.out.println(encontrado.mostrarInformacion());
        else
            System.out.println("Modulo no encontrado");

        Modulo menorProgreso = analizador.obtenerMenorProgreso();
        System.out.println("\nMenor Progreso:\n");
        if (menorProgreso != null)
            System.out.println(menorProgreso.mostrarInformacion());
        else
            System.out.println("No hay módulos disponibles");


    }
}
