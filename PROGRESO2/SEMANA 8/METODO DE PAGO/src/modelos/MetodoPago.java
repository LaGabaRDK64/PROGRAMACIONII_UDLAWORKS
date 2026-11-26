package modelos;

public class MetodoPago {

    private String titular;
    private double limite;

    public MetodoPago(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimite() {
        return limite;
    }

    public double calcularComision(double monto) {
        return 0.0;
    }

    public String mostrarInformacion() {
        return "\nTitular: " + titular + "\nLímite: $" + limite;
    }
}