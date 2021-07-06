package adrielmuniz;

public class CarroPrincipal {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setColorCode("Prata");
        carro.setMarca("Lexus");
        carro.setPrice(200000.00);
        carro.setGolSport(false);

        carro.buzinar();

        carro.exibir();

    }

}
