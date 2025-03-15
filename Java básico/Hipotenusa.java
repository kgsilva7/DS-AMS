package com.mycompany.metodos;
import javax.swing.JOptionPane;
public class Hipotenusa {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Escreva a base do triângulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Escreva a altura do triângulo:"));      
        double hipotenusa = calcularHipotenusa(base, altura);
        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + hipotenusa);
    } 
    public static double calcularHipotenusa(double base, double altura) {
        return Math.sqrt((base * base) + (altura * altura));
    }
}