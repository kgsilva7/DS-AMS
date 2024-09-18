package com.mycompany.tpapj;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();
        int inicio = Math.min(num1, num2);
        int f = Math.max(num1, num2);

        for (int a = f; a >= inicio; a--) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
