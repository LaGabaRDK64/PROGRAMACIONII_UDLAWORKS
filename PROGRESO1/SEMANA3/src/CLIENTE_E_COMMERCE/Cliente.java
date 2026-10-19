package CLIENTE_E_COMMERCE;

public class Cliente {

    private String nombre;
    private String correo;
    private int edad;
    private double saldo;

    private String verificarVACIO(String _text_reference){
        if (_text_reference == null || _text_reference.isBlank())
            _text_reference = "INDEFINIDO";
        return _text_reference;
    }

    private void setNombre(String _new_nombre){
        this.nombre = verificarVACIO(_new_nombre);
    }
    private void setCorreo(String _new_correo){
        this.correo = verificarVACIO(_new_correo);
    }
    private void setEdad(int _new_edad){
        if (_new_edad < 0)
            _new_edad = 0;

        this.edad = _new_edad;
    }
    private void setSaldo(double _new_saldo){
        if (_new_saldo < 0)
            _new_saldo = 0;

        this.saldo = _new_saldo;
    }

    String getNombre(){
        return this.nombre;
    }
    String getCorreo(){
        return this.correo;
    }
    int getEdad(){
        return this.edad;
    }
    double getSaldo(){
        return this.saldo;
    }

    public Cliente(String _name_final, String _correo_final, int _edad_final, double _saldo_final){
        setNombre(_name_final);
        setCorreo(_correo_final);
        setEdad(_edad_final);
        setSaldo(_saldo_final);
    }

}
