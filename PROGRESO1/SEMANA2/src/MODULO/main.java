package MODULO;

public class main {
    public static void main(String[] args){

        MODULO reportes = new MODULO();
        MODULO login = new MODULO();
        MODULO inventario = new MODULO();

        reportes.nombre = "Reportes";
        reportes.version = "1.0";
        reportes.lenguaje = "C++";

        login.nombre = "Login/Ingresar";
        login.version = "2.0";
        login.lenguaje = "Python";

        inventario.nombre = "Inventario Usuario";
        inventario.version = "1.5";
        inventario.lenguaje = "C#";

        login.marcarTermiando();

    }
}
