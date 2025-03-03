package com.mycompany.ds;
import java.util.Scanner;
public class OrganizarNumero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("Escreva o 2º número: ");
        int num2 = sc.nextInt();
        System.out.print("Escreva o 3º número: ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
}