package com.mycompany.ds;
import java.util.Scanner;
public class NumeroDecrescente {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int num = sc.nextInt();
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}