public class Lavadora extends Electrodomesticos {
    private float carga;

    public Lavadora(int modelo, String marca, String nombre, String utilidad, float carga) {
        super(modelo, marca, nombre, utilidad);
        this.carga = carga;
    }

    public Lavadora() {
        this.carga = 0;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carga "+carga);
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
}
