package com.mycompany.metodos;
import javax.swing.JOptionPane;
public class DiferencaValores {
     public static void main(String[] args) {
        double valor1 = lerValor("Escreva o 1º valor:");
        double valor2 = lerValor("Escreva o 2º valor:");
        double diferenca = diferenca(valor1, valor2);
        JOptionPane.showMessageDialog(null, "A diferença entre o maior e menor valor é: " + diferenca);
    }
    public static double lerValor(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    }
    public static double diferenca(double valor1, double valor2) {
        return Math.abs(valor1 - valor2);
    }
}