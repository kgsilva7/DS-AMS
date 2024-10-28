package com.mycompany.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio6 {
     public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
        
  int[] numeros = new int[100];
  
   System.out.println("Escreva 100 Números");

    for(int i = 0; i< numeros.length; i++){

System.out.print("Número " + (i + 1) + ": ");

numeros[i] = sc.nextInt();
}

 Arrays.sort(numeros);
 
 System.out.println("Números pares: ");

for(int i = 0; i< numeros.length; i++){

if(numeros[i] % 2 !=0){

    System.out.println(numeros[i]);
}

}
    }
}
