package SOFTWARE_S2;

public class Dispositivo {

    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion(){

        System.out.println("NOMBRE DEL PRODUCTO: " + nombre);
        System.out.println("TIPO DE PRODUCTO: " + tipo);
        System.out.println("ESTADO: " + activo);

    }
    void mostrarEstado(){

        String message;

        message = (activo)?"Esta Activo":"Esta Desactivado";

        System.out.println(message);

    }
    void activar(){
        activo = true;
    }
    void desactivar(){
        activo = false;
    }

    /*
    ¿Cuáles atributos son public?
        nombre y activo.
    ¿Cuáles tienen acceso por defecto?
        solo tipo.
    ¿Qué diferencia observas entre ambos tipos de declaración?
        para public usamos la palabra reservada, public, lo que nos permite usarlos
        en diferentes puntos del programa sin restricciones, por default solo en
        archivos del paquete, fuera del paquete no se puede usar.
    ¿Qué ocurre con los otros productos cuando modificas uno?
        Solo se modifica el producto al que mandamos a llamar el metodo para que lo modifique,
        los demas se quedan intactos
    */

}
