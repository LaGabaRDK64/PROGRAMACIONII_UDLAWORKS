package modelo;

public class AnalizadorCatalogo {

    private Producto[] productos;

    public AnalizadorCatalogo(Producto[] productos){
        this.productos = productos;
    }

    public String listarProductos(){
        if (productos == null)
            return "";

        String resultado = "";

        for (Producto j : productos){
            if (j != null){
                resultado += j.mostrarInformacion() + "\n";
            }
        }

        return resultado;
    }

    public int contarDisponibles(){
        if (productos == null)
            return 0;

        int contador = 0;

        for (Producto j : productos){
            if ( j != null && j.isDisponible())
                contador++;
        }

        return contador;
    }

    public double calcularPrecioPromedio(){
        if (productos == null)
            return 0;

        double suma = 0.0;
        int contador = 0;

        for (Producto j : productos){
            if (j != null){
                suma += j.getPrecio();
                contador++;
            }
        }
        return contador == 0 ? 0.0 : suma/contador;
    }

    public Producto buscarPorCodigo(String codigo){
        if (productos == null)
            return null;

        for (Producto k : productos){
            if (k != null){
                if (codigo.equals(k.getCodigo()))
                    return k;
            }
        }
        return null;
    }

    public Producto obtenerProductoMasCaro(){
        if (productos == null){
            return null;
        }

        Producto productoMasCaro = null;

        for (Producto j : productos){
            if (j != null){
                if (productoMasCaro == null || j.getPrecio() > productoMasCaro.getPrecio()){
                    productoMasCaro = j;
                }
            }
        }
        return productoMasCaro;
    }
}
