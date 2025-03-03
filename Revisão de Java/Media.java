package com.mycompany.ds;
import java.util.Scanner;
public class Media {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Escreva a 1º nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Escreva a 2º nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Escreva a 3º nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Escreva a 4º nota: ");
        double nota4 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}