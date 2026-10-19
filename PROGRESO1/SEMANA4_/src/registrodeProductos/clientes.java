package registrodeProductos;

public class clientes {

    private int id;
    private String nombre;
    private String correo;
    private boolean activo;
    private static int contadorClientes = 0;

    public clientes(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        setNombre(nombre);
        setCorreo(correo);
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            nombre = "INDEFINIDO";
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isBlank())
            correo = "INDEFINIDO";
        this.correo = correo;
    }

    public void activar(){
        activo = true;
    }
    public void desactivar(){
        activo = false;
    }
    public static int getTotalClientes(){
        return contadorClientes;
    }

}
