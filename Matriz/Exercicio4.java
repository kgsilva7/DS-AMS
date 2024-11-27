package com.mycompany.matriz;
import javax.swing.JOptionPane;
public class Exercicio4 {
     public static void main(String[] args){
        
  final int N_Lin = 3, N_Col = 3;
  int[][] mat = new int[N_Lin] [N_Col]; 
  int l,c;

   JOptionPane.showMessageDialog (null,"Dado na matriz entre cada posição" );


for (l = 0;l< N_Lin; l++)
{
  for (c = 0;c< N_Col; c++)
  {
mat [1][c]=Integer.parseInt(JOptionPane.showInputDialog("Linha "+(l+1)+" Coluna "+(c + 1)+" "));

  }
}


JOptionPane.showMessageDialog(null, "Dados da matriz");


for (l= 0;  l<N_Lin; l++)
    
{
for (c = 0;  c <N_Col; c++)
    
{

System.out.print(mat [1] [c]+" ");

}

System.out.print("\n"); 

}
    }
    
}
