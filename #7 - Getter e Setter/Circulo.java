package adrielmuniz;

import javax.swing.*;

public class Circulo {

    private double raio, area, perimetro;
    private final double pi = 3.14;

    public Circulo(){

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public void calcularArea(){
        this.area = (getRaio() * getRaio()) * pi;
        JOptionPane.showMessageDialog(null,"A área do Círculo com o Raio = ".concat(String.valueOf(getRaio())).concat(" é: ").concat(String.valueOf(area)));
    }

    public void calcularPerimetro(){
        this.perimetro = (2 * pi) * getRaio();
        JOptionPane.showMessageDialog(null, "A medida do Perímetro com o Raio = ".concat(String.valueOf(getRaio())).concat(" é: ").concat(String.valueOf(perimetro)));
    }
}