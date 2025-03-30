public class Transmilenio extends TransportePublico{
    int numeroDeParadas;

    public Transmilenio(String tipo, String ruta, int numeroDeParadas) {
        super(tipo, ruta);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public double calcularDistanciaRecorrida(Rutas rutas) {
        return super.calcularDistanciaRecorrida(rutas);
    }

    @Override
    public double calcularTiempoRecorrido(Rutas rutas) {
        return super.calcularTiempoRecorrido(rutas);
    }

    public double calcularTarifaTransmilenio(Rutas rutas) {
        return tarifa = rutas.getDuracionRecorrido()*numeroDeParadas*55;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public Transmilenio(String tipo, String ruta) {
        super(tipo, ruta);
        System.out.println("numero de paradas: " + numeroDeParadas);
    }
}
