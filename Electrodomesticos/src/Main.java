public class Main {
    public static void main(String[] args) {
        System.out.println("--LA LAVADORA--");
        System.out.println("Inicializandola");
        Lavadora challenger = new Lavadora(2025,"Challenger","Benitocamela", "Lavar la ropa bien melo",45);
        challenger.mostrar();
        System.out.println("Sin inicializarla, poniendo getters y setters");
        Lavadora samsung = new Lavadora();
        samsung.mostrar();
        samsung.setCarga(45);
        samsung.setMarca("Samsung");
        samsung.setModelo(2022);
        samsung.setNombre("Samsung soplamondas 345");
        samsung.setUtilidad("Lavar la ropa bien azaroso");
        samsung.mostrar();
    }
}