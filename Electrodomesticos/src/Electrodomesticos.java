public class Electrodomesticos {
    protected String nombre;
    protected String marca;
    protected String utilidad;
    protected int modelo;

    public Electrodomesticos(int modelo,String marca, String nombre, String utilidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.nombre = nombre;
        this.utilidad = utilidad;
    }

    public Electrodomesticos() {
        this.marca = "Ninguna";
        this.modelo = 0;
        this.nombre = "Sin nombre";
        this.utilidad = "Sin utilidad";
    }

    public void encender() {
        System.out.println("Encender");
    }

    public void apagar() {
        System.out.println("Apagar");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public void mostrar() {
        System.out.println("Marca "+marca);
        System.out.println("Nombre "+nombre);
        System.out.println("Utilidad "+utilidad);
        System.out.println("Modelo "+modelo);
    }
}
