package modelos;

public class PagoContraEntrega extends MetodoPago{

    private double recargoEnvio;

    public PagoContraEntrega(String titular, double limite, double recargoEnvio) {
        super(titular, limite);
        this.recargoEnvio = recargoEnvio;
    }

    public double getRecargoEnvio() {
        return recargoEnvio;
    }

    @Override
    public double calcularComision(double monto) {
        return recargoEnvio;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nPago contra entrega (recargo: $" + recargoEnvio + ")";
    }
}