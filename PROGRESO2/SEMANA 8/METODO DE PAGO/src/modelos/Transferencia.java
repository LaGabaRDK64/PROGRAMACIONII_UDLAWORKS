package modelos;

public class Transferencia extends MetodoPago{

    private String Banco;

    public Transferencia(String titular, double limite, String banco) {
        super(titular, limite);
        Banco = banco;
    }

    public String getBanco() {
        return Banco;
    }

    @Override
    public double calcularComision(double monto){
        return 1.5;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + "\nBanco: " + Banco;
    }

}
