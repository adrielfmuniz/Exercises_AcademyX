package br.com.zinzorcsgames;

public class Shirt {

    private String description, colorCode;
    private int price;

    public Shirt(){

    }

    public Shirt(String description, String colorCode, int price){
        this.colorCode = colorCode;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Informações da Camisa - Cód: " + colorCode + " | Descrição: " + description + " | Preço: R$" + price);
    }

}