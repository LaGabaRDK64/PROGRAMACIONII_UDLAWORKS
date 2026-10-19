package REGISTRO_PRODUCTO;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;

        this.id = id;
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public int getContadorProductos(){
        return contadorProductos;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            nombre = "INDEFINIDO";
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        if (precio < 0){
            precio = 0;
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if (stock < 0){
            precio = 0;
        }
        this.stock = stock;
    }
}
