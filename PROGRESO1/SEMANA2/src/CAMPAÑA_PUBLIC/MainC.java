package CAMPAÑA_PUBLIC;

public class MainC {
    public static void main(){

        Campania instagramC = new Campania();
        Campania tiktokC = new Campania();
        Campania facebookC = new Campania();

        instagramC.nombre = "Campaña Instagram";
        instagramC.presupuesto = 4500.55;
        instagramC.plataforma = "Google Ads";
        instagramC.activa = false;

        tiktokC.nombre = "Campaña Tiktok";
        tiktokC.presupuesto = 5000.55;
        tiktokC.plataforma = "Tik Tok Ads";
        tiktokC.activa = true;

        facebookC.nombre = "Campaña Facebook";
        facebookC.presupuesto = 3500.55;
        facebookC.plataforma = "Meta Ads";
        facebookC.activa = true;

        System.out.println("----INFORMACION----\n" + "TEST 1: ");
        tiktokC.mostrarInformacion();
        instagramC.mostrarInformacion();
        facebookC.mostrarInformacion();

        tiktokC.descativar();
        System.out.println("----CAMBIO----\n");
        tiktokC.mostrarInformacion();
        instagramC.mostrarInformacion();
        facebookC.mostrarInformacion();

    }
}
