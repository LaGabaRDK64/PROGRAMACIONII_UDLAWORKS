package CONTRASEÑAS;

public class Usuario {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        setNombre(nombre);
        setCorreo(correo);
        setContrasena(contrasena);
    }

    private String isVacio(String _text_placeholder){
        if (_text_placeholder == null || _text_placeholder.isBlank())
            _text_placeholder = "INDEFINIDO";

        return _text_placeholder;
    }

    private boolean isGmail(String _text_placeholder){
        String temp = isVacio(_text_placeholder);
        return temp.contains("@");

    }

    private void setNombre(String _nombre_){
        this.nombre = isVacio(_nombre_);
    }

    private void setCorreo(String _correo_){

        String temp = isVacio(_correo_);
        if (isGmail(temp) != true)
            temp = "INDEFINIDO";

        this.correo = temp;

    }

    private void setContrasena(String _contrasena_){
        String temp = isVacio(_contrasena_);

        if (temp.equals("INDEFINIDO") || _contrasena_.length() > 10)
            temp = "INDEFINIDO";

        this.contrasena = temp;

    }

    public String getNombre(){
        return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }



}
