
package com.mycompany.tpaexercicios;
    import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {    
    int hc;
    hc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora em que você chega no trabalho: "));
        switch (hc) {
            case 5 -> JOptionPane.showMessageDialog(null, "Você trabalha no turno manhã.");
            case 13 -> JOptionPane.showMessageDialog(null, "Você trabalha no turno tarde.");
            case 21 -> JOptionPane.showMessageDialog(null, "Você trabalha no turno noite.");
            default -> {
            }
        }
    }
}
