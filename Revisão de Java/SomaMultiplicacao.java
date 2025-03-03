package com.mycompany.ds;
public class SomaMultiplicacao {
     public static void main(String[] args) {
        int somaImpares = 0;
        int multiplicaPares = 1;
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                multiplicaPares *= i; 
            } else {
                somaImpares += i; 
            }
        }
        System.out.println("Adição dos ímpares: " + somaImpares);
        System.out.println("Multiplicação dos pares: " + multiplicaPares);
    }   
}
