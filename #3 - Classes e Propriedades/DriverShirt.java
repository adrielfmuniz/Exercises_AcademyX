package br.com.zinzorcsgames;

public class DriverShirt {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setColorCode("SC-Azul");
        shirt.setDescription("Manga Longa");
        shirt.setPrice(60);

        //Alternativa de uso para exibir os atributos instanciados
        System.out.println(shirt.getColorCode() + " || " + shirt.getDescription() + " || " + shirt.getPrice());

        shirt.display();
    }

}
