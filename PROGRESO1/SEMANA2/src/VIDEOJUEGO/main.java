package VIDEOJUEGO;

public class main {
    public static void main(String[] args){

        CASSET videogame1 = new CASSET();
        CASSET videogame2 = new CASSET();
        CASSET videogame3 = new CASSET();

        videogame1.nombre = "Minecraft";
        videogame1.genero = "SandBox";
        videogame1.version = "1.20";

        videogame1.nombre = "Mario Bros";
        videogame1.genero = "Plataformero";
        videogame1.version = "3.5";

        videogame1.nombre = "Elder Ring";
        videogame1.genero = "RPG";
        videogame1.version = "1.10";

        videogame1.inciar();

        System.out.println("----INFORMACION VIDEOJUEGOS----\n\n");

        videogame1.mostrarInformacion();
        videogame2.mostrarInformacion();
        videogame3.mostrarInformacion();

        System.out.println("\n----CONSULTAR VERSION APARTE----\n\n");
        System.out.println("MARIO BROS");
        videogame1.mostrarVersion();

    }
}
