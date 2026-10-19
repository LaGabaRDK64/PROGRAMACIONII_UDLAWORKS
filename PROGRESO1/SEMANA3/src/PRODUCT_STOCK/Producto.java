package PRODUCT_STOCK;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    private String isVacio(String _placeholder){
        if (_placeholder == null || _placeholder.isBlank())
            _placeholder = "INDEFINIDO";
        return _placeholder;
    }
    private void setNombre(String new_nombre){
        this.nombre = isVacio(new_nombre);
    }
    private void setCategoria(String new_categoria){
        this.categoria = isVacio(new_categoria);
    }
    private void setPrecio(double new_precio){
        if (new_precio < 0)
            new_precio = 0;

        this.precio = new_precio;
    }
    private void setStock(int new_stock){
        if (new_stock < 0)
            new_stock = 0;

        this.stock = new_stock;
    }

    public Producto(String final_name, String final_categoria, int final_stock, double final_precio){

        setNombre(final_name);
        setCategoria(final_categoria);
        setPrecio(final_precio);
        setStock(final_stock);

    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCategoria(){return this.categoria;}
    public int getStock(){
        return this.stock;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void aumentarStock(int cantidad){
        if (cantidad >= 0)
            this.stock += cantidad;
    }

}
