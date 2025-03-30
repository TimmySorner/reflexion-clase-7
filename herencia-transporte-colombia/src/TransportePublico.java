public class TransportePublico {

    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido;

    public TransportePublico(double distanciaRecorrida, String ruta, double tarifa, int tiempoRecorrido, String tipo) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.ruta = ruta;
        this.tarifa = tarifa;
        this.tiempoRecorrido = tiempoRecorrido;
        this.tipo = tipo;
    }

    public TransportePublico() {
        this.distanciaRecorrida = 0;
        this.ruta = "Movimiento generico";
        this.tarifa = 0;
        this.tiempoRecorrido = 0;
        this.tipo = "Transporte generico";

    }

    public void calcularTarifa() {
    tarifa = distanciaRecorrida * tarifa;
    }

    public void calcularDistanciaRecorrida() {
    distanciaRecorrida = distanciaRecorrida;
    }

    public void calcularTiempoRecorrido() {

    }
    public void informacionTiquete() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Tarifa: " + tarifa);
        System.out.println("Distancia recorrida: " + distanciaRecorrida);
        System.out.println("Tiempo recorrido: " + tiempoRecorrido);
    }


}
