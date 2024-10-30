package com.mycompany.vetor;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Arrays;
public class Exercicio4 {
    public static void main(String[] args){
    
    Integer[] numeros = new Integer[50];
        
        
        for (int i = 0; i < 50; i++) {
            String input = JOptionPane.showInputDialog("Escreva " + (i + 1) + "° número:");
            numeros[i] = Integer.valueOf(input);  
        }
        
        
       Arrays.sort(numeros, Collections.reverseOrder());        
        
        for (int i = 0; i < 50; i++) {
           System.out.println((i + 1) + "° número: " + numeros[i]); 
        }
    } 
}
