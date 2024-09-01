
package com.mycompany.tpaexercicios;
    import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
    double massa, altura;
    double imc;
    massa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua massa em kilos: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura em centímetros: "))/100;
    imc = massa/(altura*altura);
          
    if (imc < 18){
        JOptionPane.showMessageDialog(null, "Você está com: MAGREZA.");
    }
    else if (imc < 25){
        JOptionPane.showMessageDialog(null, "Você está: SAUDÁVEL.");
    }
    else if (imc < 30){
        JOptionPane.showMessageDialog(null, "Você está com: SOBREPESO.");
    }
    else if (imc >= 30){
        JOptionPane.showMessageDialog(null, "Você está com: OBESIDADE.");
    }
    }
}

    

