package com.mycompany.matriz;
import java.util.Scanner;
public class Exercicio3 {
     public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Rscreva o número para a posição (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

    
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Número em posição (" + (i + 1) + ", " + (i + 1) + "): " + matriz[i][i]);
        }

        
        System.out.println("Diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Número em posição (" + (i + 1) + ", " + (4 - i) + "): " + matriz[i][3 - i]);
        }
  
    }
    
}
