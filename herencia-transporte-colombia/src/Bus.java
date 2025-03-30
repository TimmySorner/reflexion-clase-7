public class Bus extends TransportePublico{
    private int capacidad;

    public float calcularTarifaBus() {
        return 1124*capacidad;
    }

    public Bus(double distanciaRecorrida, String ruta, double tarifa, int tiempoRecorrido, String tipo, int capacidad) {
        super(distanciaRecorrida, ruta, tarifa, tiempoRecorrido, tipo);
        this.capacidad = capacidad;
    }

    public Bus() {
        this.capacidad = 0;
    }

    @Override
    public void informacionTiquete() {
        super.informacionTiquete();
        System.out.println("Capacidad: " + capacidad);
    }
}
