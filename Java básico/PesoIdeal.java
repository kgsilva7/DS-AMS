package com.mycompany.metodos;
import javax.swing.JOptionPane;
public class PesoIdeal {
     public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Escreva o seu sexo (M para Masculino, F para Feminino):");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua altura em metros:"));
        double pesoIdeal = calcularPesoIdeal(sexo, altura);
        JOptionPane.showMessageDialog(null, "Peso Ideal: " + pesoIdeal + " Kg");
    }
    public static double calcularPesoIdeal(String sexo, double altura) {
        if (sexo.equalsIgnoreCase("M")) {
            return (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            return (62.1 * altura) - 44.7;
        } else {
            return 0;
        }
    }
}