package com.mycompany.vetor;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Exercicio3 {
     public static void main(String[] args){
    
    int[] numeros = new int[5];
        
        
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Escreva " + (i + 1) + "° número:");
            numeros[i] = Integer.parseInt(input);  
        }
        
        
        Arrays.sort(numeros);
        
        for (int i = 0; i < 5; i++) {
           System.out.println((i + 1) + "° Número: " + numeros[i]); 
        }
    }
}
