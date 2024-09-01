
package com.mycompany.tpaexercicios;
import javax.swing.JOptionPane;
public class Exercicio5 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua terceira nota: "));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua quarta nota: "));
		double media = (nota1+nota2+nota3+nota4)/4;
		if (media < 2.5 || (media >= 2.5 && media < 5)) {
		    JOptionPane.showMessageDialog(null, "Você foi reprovado.");
		}
		else if (5 <= media || (media < 7)) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado.");
		}
		else if (7 <= media || (media < 9)) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado.");
		}
		else if (9 <= media) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado.");
		}
		}
}

