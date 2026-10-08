package CUPON_DESCUENTO;

public class CUPON {

    public String codigo;
    public double porcentajeDescuento;
    String descripcion;
    Boolean activo;

    public void mostrarInformacion(){

        System.out.println("Codigo del cupon: " + codigo);
        System.out.println("Porcentaje del cupon: " + porcentajeDescuento);
        System.out.println("Descripcion:\n" + descripcion);
        System.out.println("||ACTIVO: " + activo);
        System.out.println("\n");

    }
    public void activar(){
        activo = true;
    }
    void desactivar(){
        activo = false;
    }
    void mostrarDescuento(double temp_compraTotal){

        double precDes;
        precDes = temp_compraTotal * (porcentajeDescuento/100);
        double compraTotal = temp_compraTotal - precDes;

        System.out.println("El precio de su compra sin descuento es " + temp_compraTotal);
        System.out.println("El porcentaje del descuento es " + porcentajeDescuento);
        System.out.println("Representa $" + precDes + " del total");
        System.out.println("El valor de compra total sera " + compraTotal);
        System.out.println("\n");

    }
}
