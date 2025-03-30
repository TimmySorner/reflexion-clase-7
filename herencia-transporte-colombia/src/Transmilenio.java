public class Transmilenio extends TransportePublico{
    int numeroDeParadas;

    public Transmilenio(String tipo, Rutas ruta, int numeroDeParadas) {
        super(tipo, ruta);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas ruta) {
        return super.calcularDistanciaRecorrida(ruta);
    }

    @Override
    public double calcularTiempoRecorrido(Rutas ruta) {
        return super.calcularTiempoRecorrido(ruta);
    }

    public double calcularTarifaTransmilenio(Rutas ruta) {
        return tarifa = ruta.getDuracionRecorrido()*numeroDeParadas*55;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public Transmilenio(String tipo, Rutas ruta) {
        super(tipo, ruta);
        System.out.println("numero de paradas: " + numeroDeParadas);
    }
}
