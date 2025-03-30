public class Main {
    public static void main(String[] args) {
    Rutas marinilla_medellin = new Rutas(200,400,7);
    System.out.println(marinilla_medellin.getDuracionRecorrido());
    System.out.println(marinilla_medellin.getKilometroInicial());
    System.out.println(marinilla_medellin.getKilometroFinal());
    Metro metroMedellin = new Metro("Transporte terrestre en metro", marinilla_medellin, 7);
    metroMedellin.mostrarInformacion();
    Bus busMedellin = new Bus("Transporte terrestre en bus", marinilla_medellin);
    busMedellin.mostrarInformacion();

    }
}