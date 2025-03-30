public class Main {
    public static void main(String[] args) {
        System.out.println("---PRIMER TRAYECTO---");
        Rutas marinilla = new Rutas(125,245);
        marinilla.mostrarKilometaje();
        System.out.println("---SEGUNDO TRAYECTO---");
        Rutas bogota_medellin = new Rutas(245,125);
        bogota_medellin.mostrarKilometaje();
        System.out.println("---VALOR PASAJES---");

    }
}