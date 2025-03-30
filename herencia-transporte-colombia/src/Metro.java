public class Metro extends TransportePublico{
    private int numeroEstaciones;

    public Metro(String tipo, String ruta, int numeroEstaciones) {
        super(tipo, ruta);
        this.numeroEstaciones = numeroEstaciones;
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas rutas) {
        return super.calcularDistanciaRecorrida(rutas);
    }

    public double calcularTarifaMetro(Rutas rutas) {
        return tarifa = rutas.getDuracionRecorrido()*7000;
    }

    @Override
    public double calcularTiempoRecorrido(Rutas rutas) {
        return super.calcularTiempoRecorrido(rutas);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero Estaciones: " + numeroEstaciones);
    }
}
