package PEDIDOS_U;

public class Pedidos {

    private int numero;
    private String cliente;
    private double total;
    private String estado;

    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedidos(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        setCliente(cliente);
        setTotal(total);
        this.estado = "Pendiente";
    }

    private void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank())
            cliente = "INDEFINIDO";
        this.cliente = cliente;
    }

    private void setTotal(double total){
        if (total < 0){
            total = 0;
        }
        this.total = total;
    }

    public void confirmar(){
        if (estado == "Pendiente"){
            estado = "Confirmado";
            ventasTotales++;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }
}
