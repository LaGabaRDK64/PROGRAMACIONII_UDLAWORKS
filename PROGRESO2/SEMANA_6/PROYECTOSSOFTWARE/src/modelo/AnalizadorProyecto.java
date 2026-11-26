package modelo;

public class AnalizadorProyecto {

    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String listarModulos(){

        if (modulos == null)
            return null;

        String largetext = "";

        for (Modulo j : modulos){
            if (j != null){
                largetext += j.mostrarInformacion() + "\n";
            }
        }
        return largetext;
    }

    public int contarTerminados(){
        if (modulos == null)
            return 0;

        int total = 0;

        for (Modulo j : modulos){
            if (j != null && j.isTerminado())
                total++;
        }

        return total;
    }

    public double calcularProgresoPromedio(){
        if (modulos == null)
            return 0.0;

        double sumaProgresos = 0.0;
        int cantTotalElementos = 0;

        for (Modulo j : modulos){
            if (j != null){
                sumaProgresos += j.getProgreso();
                cantTotalElementos++;
            }
        }
        if (cantTotalElementos == 0)
            return 0.0;
        return sumaProgresos/cantTotalElementos;
    }

    public Modulo buscarModulo(String nombre){
        if (modulos == null || nombre == null)
            return null;

        for (Modulo j : modulos){
            if (j != null && nombre.equals(j.getNombre()))
                return j;
        }
        return null;
    }

    public Modulo obtenerMenorProgreso(){
        if (modulos == null)
            return null;

        Modulo menor = null;

        for (Modulo j : modulos){
            if (j != null){
                if (menor == null || j.getProgreso() < menor.getProgreso())
                    menor = j;
            }
        }
        return menor;
    }
}
