package com.mycompany.arrays;
 import java.util.Scanner;
 import java.util.Arrays;
 public class Array {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         String[] nomes = new String[10];
         
         System.out.println("Escreva 10 nomes: ");
         
         for(int i = 0; i< nomes.length; i++){
         
             System.out.print("Nome " + (i + 1) + ": ");
              nomes[i] = sc.nextLine();
         }
        
        
         Arrays.sort(nomes);
         
         System.out.println("Nomes em sua ordem crescente:");
         
         for(String nome :  nomes ){
             System.out.println(nome);
         
         }
         
     }
 }