public class Bus extends TransportePublico{
    private int capacidad;

    public Bus(String tipo, String ruta) {
        super(tipo, ruta);
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas rutas) {
        return super.calcularDistanciaRecorrida(rutas);
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa()*30;
    }

    @Override
    public double calcularTiempoRecorrido(Rutas rutas) {
        return super.calcularTiempoRecorrido(rutas);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad: " + capacidad);
    }
}
