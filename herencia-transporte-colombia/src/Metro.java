public class Metro extends TransportePublico{
    private int numeroEstaciones;

    public Metro(String tipo, Rutas ruta, int numeroEstaciones) {
        super(tipo, ruta);
        this.numeroEstaciones = numeroEstaciones;
        
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas ruta) {
        return super.calcularDistanciaRecorrida(ruta);
    }

    public double calcularTarifaMetro(Rutas ruta) {
        return tarifa = ruta.getDuracionRecorrido()*7000;
    }

    @Override
    public double calcularTiempoRecorrido(Rutas ruta) {
        return super.calcularTiempoRecorrido(ruta);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero Estaciones: " + numeroEstaciones);
    }
}
