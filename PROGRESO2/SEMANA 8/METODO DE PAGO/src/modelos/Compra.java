package modelos;

public class Compra {

    private double total;
    private MetodoPago metodoPago;

    public Compra(double total, MetodoPago metodoPago) {
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public double getTotal() {
        return total;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public double calcularTotalConComision() {
        if (metodoPago == null) {
            return total;
        }
        return total + metodoPago.calcularComision(total);
    }

    public String mostrarInformacion() {
        String infoMetodo = (metodoPago != null) ? metodoPago.mostrarInformacion() : "Sin método de pago";
        double comision = (metodoPago != null) ? metodoPago.calcularComision(total) : 0.0;
        return "Monto base: $" + total
                + "\nMétodo: " + infoMetodo
                + "\nComisión: $" + comision
                + "\nTotal con comisión: $" + calcularTotalConComision();
    }
}