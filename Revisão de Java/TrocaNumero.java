package com.mycompany.ds;
import java.util.Scanner;
public class TrocaNumero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o valor de NumA: ");
        int numA = sc.nextInt();
        System.out.print("Escreva o valor de NumB: ");
        int numB = sc.nextInt();
        System.out.println("Antes de trocar: NumA = " + numA + ", NumB = " + numB);
        int temp = numA;
        numA = numB;
        numB = temp;
        System.out.println("Após trocar: NumA = " + numA + ", NumB = " + numB);
    }
}