package com.mycompany.tpapj;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Valor final: ");
        int f = sc.nextInt();

        int soma = 0;
        for (int a = inicio; a <= f; a++) {
            if (a % 2 != 0) {
                soma += a;
            }
        }
        System.out.println("Soma dos números ímpares: " + soma);
    }
}
