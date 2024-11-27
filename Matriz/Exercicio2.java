package com.mycompany.matriz;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        boolean temRepetidos = false;

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Escreva o número para a posição (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = i; k < 3; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < 5; l++) {
                        if (matriz[i][j] == matriz[k][l]) {
                            temRepetidos = true;
                            break;
                        }
                    }
                    if (temRepetidos) break;
                }
                if (temRepetidos) break;
            }
            if (temRepetidos) break;
        }

        if (temRepetidos) {
            System.out.println("Tem números repetidos.");
        } else {
            System.out.println("Não tem números repetidos.");
        }

        
        int countPares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    countPares++;
                }
            }
        }
        System.out.println("Números pares: " + countPares);

        
        int countImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    countImpares++;
                }
            }
        }
        System.out.println("Números ímpares: " + countImpares);
       
     
     
     }
    
}
