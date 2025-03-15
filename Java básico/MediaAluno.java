package com.mycompany.metodos;
import javax.swing.JOptionPane;
public class MediaAluno {
     public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Escreva o nome do aluno:");
        double nota1 = lerNota("Escreva a 1º nota:");
        double nota2 = lerNota("Escreva a 2º nota:");
        double media = calcularMedia(nota1, nota2);
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nMédia: " + media); 
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
        }
    }
    public static double lerNota(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    } 
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}