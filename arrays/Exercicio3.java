package com.mycompany.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio3 {
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
        
  int[] numeros = new int[50];
  
System.out.println("Escreva 50 Números");

for(int i = 0; i< numeros.length; i++){

System.out.print("Número " + (i + 1) + ": ");

numeros[i] = sc.nextInt();
}

Arrays.sort(numeros);

for(int numero: numeros){
System.out.println(numero);
}
  
    }
}
