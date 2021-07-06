package adrielmuniz;

import javax.swing.*;

public class CirculoMain {

    public static void main(String[] args) {

        Circulo novoCirculo = new Circulo();

        do {
            novoCirculo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Qual valor do Raio?\n\nCaso queira sair digite 0")));

            if (novoCirculo.getRaio() != 0.0) {
                novoCirculo.calcularArea();
                novoCirculo.calcularPerimetro();
            } else {
                JOptionPane.showMessageDialog(null, "Programa de cálculos encerrado");
            }
            
        } while (novoCirculo.getRaio() > 0.0);
    }
}