package com.mycompany.matriz;
import java.util.Scanner;
public class Matriz {
 public static void main(String[] args) {
         
       int[][] matriz = new int[5][5];
       
       Scanner sc = new Scanner(System.in);
         
         
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.print("Escreva o número para a posição (" + (i+1) + ", " + (j+1) + "): ");
                 matriz[i][j] = sc.nextInt();
             }
         }
 
         
         int somaImpares = 0;
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 if (matriz[i][j] % 2 != 0) {
                     somaImpares += matriz[i][j];
                 }
             }
         }
         System.out.println("Soma dos ímpares: " + somaImpares);
 
         
         System.out.println("Soma das colunas:");
         for (int j = 0; j < 5; j++) {
             int somaColuna = 0;
             for (int i = 0; i < 5; i++) {
                 somaColuna += matriz[i][j];
             }
             System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
         }
 
         
         System.out.println("Soma das linhas:");
         for (int i = 0; i < 5; i++) {
             int somaLinha = 0;
             for (int j = 0; j < 5; j++) {
                 somaLinha += matriz[i][j];
             }
             System.out.println("Linha " + (i + 1) + ": " + somaLinha);
         }
  
     }
 }
