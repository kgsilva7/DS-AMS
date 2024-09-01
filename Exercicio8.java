
package com.mycompany.tpaexercicios;
import javax.swing.*;
public class Exercicio8 {
	public static void main(String[] args) {
		double r1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do primeiro lado do triângulo: "));
		double r2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do segundo lado do triângulo: "));
		double r3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do terceiro lado do triângulo: "));
		if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
			JOptionPane.showMessageDialog(null, "Os segmentos acima podem formar um triângulo..");
			if (r1 == r2 && r2 == r3) {
				JOptionPane.showMessageDialog(null, "Equilátero!");
			}
			else if (r1 != r2 && r2 != r3 && r3 != r1){
				JOptionPane.showMessageDialog(null, "Escaleno!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Isósceles!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Os valores não irão fazer um triângulo!");	
		}
	}
}

