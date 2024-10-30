package com.mycompany.vetor;
 import javax.swing.JOptionPane;
 import java.util.Arrays;
public class Vetor {
      public static void main(String[] args) {
 
             String[] nomes = new String[15];
 
             int i;
 
             for(i = 0; i < 15; i++){
 
             nomes[i] = JOptionPane.showInputDialog("Escreva " +(i + 1) + "° nomes:");
             }
             Arrays.sort(nomes);
 
             for(i = 0; i < 15; i++){
                 System.out.println((i + 1) + "° Nome: " + nomes[i]);
             }
         }
}
