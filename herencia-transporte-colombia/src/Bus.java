public class Bus extends TransportePublico{
    private int capacidad;

    public Bus(String tipo, Rutas ruta) {
        super(tipo, ruta);
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas ruta) {
        return super.calcularDistanciaRecorrida(ruta);
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa()*30;
    }

    @Override
    public double calcularTiempoRecorrido(Rutas ruta) {
        return super.calcularTiempoRecorrido(ruta);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad: " + capacidad);
    }
}
