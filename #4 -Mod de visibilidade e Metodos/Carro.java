package adrielmuniz;

public class Carro {

    private String marca, colorCode;
    private double price;
    private boolean golSport;

    public Carro(){

    }

    public Carro(String marca, String colorCode, double price){
        this.colorCode = colorCode;
        this.marca = marca;
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGolSport() {
        return golSport;
    }

    public void setGolSport(boolean golSport) {
        this.golSport = golSport;
    }

    public void buzinar(){
        System.out.println("Durante percurso o motortista vai escutando o jogo do Sport no rádio e alguém faz um gol...");
        this.golSport = golSport;
        if(golSport == true){
            System.out.println("ÉÉÉ goooool do Sport!!! Cazá, cazá, cazá... na buzinaaaa");
        } else {
            System.out.println("Gool do adversário! :( Ao invés de buzinar você vai chorar.");
        }
    }

    public void exibir(){
        System.out.println("");
        System.out.println("Marca do carro: " + getMarca());
        System.out.println("Cor do carro: " + getColorCode());
        System.out.println("Preço do carro: " + getPrice());
    }

}
