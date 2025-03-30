public class Rutas {
    private double kilometroInicial;
    private double kilometroFinal;
    private int duracionRecorrido;

    public Rutas(int duracionRecorrido, double kilometroFinal, double kilometroInicial) {
        this.duracionRecorrido = duracionRecorrido;
        this.kilometroFinal = kilometroFinal;
        this.kilometroInicial = kilometroInicial;
    }

    public double getDuracionRecorrido() {
        return duracionRecorrido;
    }

    public void setDuracionRecorrido(int duracionRecorrido) {
        this.duracionRecorrido = duracionRecorrido;
    }

    public double getKilometroFinal() {
        return kilometroFinal;
    }

    public void setKilometroFinal(double kilometroFinal) {
        this.kilometroFinal = kilometroFinal;
    }

    public double getKilometroInicial() {
        return kilometroInicial;
    }

    public void setKilometroInicial(double kilometroInicial) {
        this.kilometroInicial = kilometroInicial;
    }
}
