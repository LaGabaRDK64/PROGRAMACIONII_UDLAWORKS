package modelos;

public class Tarea {

    private String codigo;
    private String titulo;
    private double horasEstimadas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horasEstimadas, boolean completada) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.completada = completada;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public String mostrarInformacion(){
        return "Código: " + codigo
                + "- Titulo : " + titulo
                + "- Horas : " + horasEstimadas
                + "- Completada : " + completada;
    }

}
