package CUENTA_DE_VENDEDOR;

public class Vendedor {

    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    public Vendedor(String nombre, double ventas, double comision, boolean activo) {
        setNombre(nombre);
        setVentas(ventas);
        setComision(comision);
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        if (comision < 0 || comision > 100)
            comision = 0;
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        if (ventas <= 0)
            ventas = 0;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            nombre = "INDEFINIDO";
        this.nombre = nombre;
    }

    public void registrarVenta(double cantidad_){
        if (cantidad_ > 0)
            ventas += cantidad_;
    }
}
