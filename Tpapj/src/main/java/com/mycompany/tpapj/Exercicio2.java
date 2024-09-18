package com.mycompany.tpapj;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int número = sc.nextInt();

        for (int a = 1; a <= 10; a++) {
            System.out.println(número + " y " + a + " = " + (número * a));
        }
    }
}
    

