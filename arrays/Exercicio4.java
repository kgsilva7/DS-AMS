package com.mycompany.arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Exercicio4 {
     public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
        
  Integer[] numeros = new Integer[50];
  
   System.out.println("Escreva 50 Números");

    for(int i = 0; i< numeros.length; i++){

System.out.print((i + 1) + "Número " + ": ");

numeros[i] = sc.nextInt();
}

 Arrays.sort(numeros, Collections.reverseOrder());

for(int numero: numeros){
System.out.println(numero);
}
    
    }  
    
}
