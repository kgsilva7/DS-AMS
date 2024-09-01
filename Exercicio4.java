
package com.mycompany.tpaexercicios;
import javax.swing.*;
public class Exercicio4 {
	public static void main(String [] args) {
		int mes;
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro entre 1 ao 12:"));
		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Este número não corresponde a nenhum mês!");
		}
                else {
				String nomedomes;
                                nomedomes = switch (mes) {
                        case 1 -> "Janeiro";
                        case 2 -> "Fevereiro";
                        case 3 -> "Março";
                        case 4 -> "Abril";
                        case 5 -> "Maio";
                        case 6 -> "Junho";
                        case 7 -> "Julho";
                        case 8 -> "Agosto";
                        case 9 -> "Setembro";
                        case 10 -> "Outubro";
                        case 11 -> "Novembro";
                        case 12 -> "Dezembro";
                        default -> "Inválido";
                    };
		JOptionPane.showMessageDialog(null, nomedomes + "O mês que você escolheu é o: ");
			}
		}
	}
          


