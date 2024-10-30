package com.mycompany.vetor;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args){
    
    
    String[] nomes = new String[15];
        
        int i;
        
        for(i = 0; i < 15; i++){
        
        nomes[i] = JOptionPane.showInputDialog("Escreva um " +(i + 1) + "° nomes:");
        }
        
       Arrays.sort(nomes, Collections.reverseOrder());
        
        for(i = 0; i < 15; i++){
            System.out.println((i + 1) + "° Nome: " + nomes[i]);
        }
    }
    }
