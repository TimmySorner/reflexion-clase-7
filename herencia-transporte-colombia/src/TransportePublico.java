public class TransportePublico {

    protected String tipo;
    private Rutas ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido;

    public TransportePublico(String tipo, Rutas ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public double calcularDistanciaRecorrida(Rutas rutas) {
        return distanciaRecorrida = (rutas.getKilometroInicial()>rutas.getKilometroFinal()) ?rutas.getKilometroInicial() - rutas.getKilometroFinal():rutas.getKilometroFinal() - rutas.getKilometroInicial() ;
    }

    public double calcularTiempoRecorrido(Rutas rutas) {
        return tiempoRecorrido = (int) rutas.getDuracionRecorrido();
    }

    public double calcularTarifa() {
        return tarifa = distanciaRecorrida*tiempoRecorrido;
    }
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Tarifa: " + tarifa);
        System.out.println("Distancia recorrida: " + distanciaRecorrida);
        System.out.println("Tiempo recorrido: " + tiempoRecorrido);
        System.out.println("---INFORMACION ESPECIAL---");
    }
}
