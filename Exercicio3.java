/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpaexercicios;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args){
		Scanner receba = new Scanner(System.in);
		System.out.println("-=-=-=-=-= Menu do McDonald's -=-=-=-=-=\n");
		System.out.print("Digite seu pedido:\n 1. BigMac \n 2. Quarteirão \n 3. MacChicken \n 4. Cheddar \n 5.Cheese Burger\n	");
		int opt = receba.nextInt();
		switch (opt) {
		case 1 -> System.out.println("pedido BigMac.");
		case 2 -> System.out.println("pedido Quarteirão.");
		case 3 -> System.out.println("pedido MacChicken.");
		case 4 -> System.out.println("pedido Cheddar.");
		case 5 -> System.out.println("pedido CheeseBurguer.");
		default -> System.out.println("Esse numero de pedido não faz parte do nosso cardápio.");
		}
		System.out.println("Nós agradecemos o seu pedido!");
	} 
}
