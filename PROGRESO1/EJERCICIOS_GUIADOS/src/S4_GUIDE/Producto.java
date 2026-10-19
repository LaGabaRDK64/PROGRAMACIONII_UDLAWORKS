package S4_GUIDE;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    private static int contador = 0;

    public Producto(String nombre, double precio, String categoria) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }


    public static int getTotalCreados() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
