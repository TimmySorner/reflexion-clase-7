public class Rutas {
    private float kilometroInicial;
    private float kilometroFinal;

    public Rutas( float kilometroInicial,float kilometroFinal) {
        this.kilometroInicial = kilometroInicial;
        this.kilometroFinal = kilometroFinal;
    }

    public float getKilometroFinal() {
        return kilometroFinal;
    }

    public void setKilometroFinal(float kilometroFinal) {
        this.kilometroFinal = kilometroFinal;
    }

    public float getKilometroInicial() {
        return kilometroInicial;
    }

    public void setKilometroInicial(float kilometroInicial) {
        this.kilometroInicial = kilometroInicial;
    }

    public float intervaloKilometraje(){
        if(kilometroInicial > kilometroFinal){
            return kilometroInicial-kilometroFinal;
        } else {
            return kilometroFinal-kilometroInicial;
        }

    }

    public void mostrarKilometaje(){
        System.out.println("Kilometro Inicial: " + kilometroInicial);
        System.out.println("Kilometro Final: " + kilometroFinal);
        System.out.println("Rango kilometro: " + intervaloKilometraje());
    }
}
