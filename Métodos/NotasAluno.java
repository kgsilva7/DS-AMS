package prova;
import javax.swing.JOptionPane;
public class NotasAluno {
    public static double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
    public static double maiorNota(double n1, double n2, double n3, double n4) {
        double maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;
        if (n4 > maior) maior = n4;
        return maior;
    }
    public static double menorNota(double n1, double n2, double n3, double n4) {
        double menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        return menor;
    }
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

        double media = calcularMedia(nota1, nota2, nota3, nota4);
        double maior = maiorNota(nota1, nota2, nota3, nota4);
        double menor = menorNota(nota1, nota2, nota3, nota4);
        String mensagem = "Resultado:\n" +
                          "Média das notas: " + media + "\n" +
                          "Maior nota: " + maior + "\n" +
                          "Menor nota: " + menor;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}