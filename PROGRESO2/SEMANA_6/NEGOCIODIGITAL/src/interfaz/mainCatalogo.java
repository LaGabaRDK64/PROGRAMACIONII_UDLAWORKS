package interfaz;
import modelo.*;

public class mainCatalogo {
    public static void main(String[] args){
        Producto[] productos = new Producto[5];

        productos[0] = new Producto("P01" , "Mouse", 25.5, true);
        productos[1] = new Producto("P02" , "Mouse", 25.5, true);
        productos[2] = new Producto("P03" , "Mouse", 25.5, true);
        productos[3] = new Producto("P04" , "Mouse", 25.5, true);
        productos[4] = new Producto("P05" , "Mouse", 25.5, true);

        AnalizadorCatalogo analizador = new AnalizadorCatalogo(productos);

        System.out.println(analizador.listarProductos());
        System.out.println("Disponibles: " + analizador.contarDisponibles());
        System.out.println("Precio Promedio: $" + String.valueOf(analizador.obtenerProductoMasCaro()));

        Producto encontrado = analizador.buscarPorCodigo("P02");
        System.out.println("Busqueda 'P02': " + (encontrado != null ? encontrado.mostrarInformacion() : "no se encontro"));

        Producto masCaro = analizador.buscarPorCodigo("P099");
        System.out.println("Busqueda 'P02': " + (encontrado != null ? encontrado.mostrarInformacion() : "Ninguno"));

    }

}
