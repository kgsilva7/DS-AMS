package com.mycompany.ds;
import java.util.Scanner;
public class ComparaNumero {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("Escreva o 2º número: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("São iguais.");
        } else {
            System.out.println("São diferentes.");
            if (num1 > num2) {
                System.out.println("Maior: " + num1);
                System.out.println("Menor: " + num2);
            } else {
                System.out.println("Maior: " + num2);
                System.out.println("Menor: " + num1);
            }
        }
    }    
}