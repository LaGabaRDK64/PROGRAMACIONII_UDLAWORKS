package modelos;

public class BilleteraDigital extends MetodoPago{

    private String provedor;

    public BilleteraDigital(String titular, double limite, String provedor) {
        super(titular, limite);
        this.provedor = provedor;
    }

    public String getProvedor() {
        return provedor;
    }

    @Override
    public double calcularComision(double monto){
        return monto * 0.015;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + "\nBilletera: " + provedor;
    }
}
