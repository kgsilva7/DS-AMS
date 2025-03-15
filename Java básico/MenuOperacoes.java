package com.mycompany.metodos;
import javax.swing.JOptionPane;
public class MenuOperacoes {
    public static void main(String[] args) {
        int opcao;
        // Loop que continua até o usuário escolher a opção "0" para sair
        do {
            // Exibe o menu para o usuário
            System.out.println("Escolha uma operação:");
            System.out.println("1 – Soma");
            System.out.println("2 – Subtração");
            System.out.println("3 – Divisão");
            System.out.println("4 – Multiplicação");
            System.out.println("5 – Resto da Divisão");
            System.out.println("6 – Dobro");
            System.out.println("7 – Quadrado");
            System.out.println("8 – Cubo");
            System.out.println("9 – Raiz Quadrada");
            System.out.println("0 – Sair");
            // Solicita que o usuário escolha uma opção
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação (0-9):"));
            // Realiza as operações com base na opção escolhida
            double num1, num2, resultado;
            switch(opcao) {
                case 1 -> {
                    // Soma
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 1º número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 2º número:"));
                    resultado = soma(num1, num2);
                    System.out.println("Resultado da soma: " + resultado);
                }
                case 2 -> {
                    // Subtração
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 1º número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 2º número:"));
                    resultado = subtracao(num1, num2);
                    System.out.println("Resultado da subtração: " + resultado);
                }
                case 3 -> {
                    // Divisão
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 1º número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 2º número:"));
                    if (num2 != 0) {
                        resultado = divisao(num1, num2);
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                }
                case 4 -> {
                    // Multiplicação
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 1º número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 2º número:"));
                    resultado = multiplicacao(num1, num2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                }
                case 5 -> {
                    // Resto da Divisão
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 1º número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o 2º número:"));
                    resultado = restoDivisao(num1, num2);
                    System.out.println("Resultado do resto da divisão: " + resultado);
                }
                case 6 -> {
                    // Dobro
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o número:"));
                    resultado = dobro(num1);
                    System.out.println("Dobro do número: " + resultado);
                }
                case 7 -> {
                    // Quadrado
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o número:"));
                    resultado = quadrado(num1);
                    System.out.println("Quadrado do número: " + resultado);
                }
                case 8 -> {
                    // Cubo
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o número:"));
                    resultado = cubo(num1);
                    System.out.println("Cubo do número: " + resultado);
                }
                case 9 -> {
                    // Raiz Quadrada
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o número:"));
                    resultado = raizQuadrada(num1);
                    System.out.println("Raiz quadrada do número: " + resultado);
                }
                case 0 -> // Sair
                    System.out.println("Saindo...");
                default -> // Caso de uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 0); // Repete até o usuário escolher a opção "0" para sair
    }
    // Método para soma
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    // Método para subtração
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    // Método para divisão
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
    // Método para multiplicação
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    // Método para resto da divisão
    public static double restoDivisao(double num1, double num2) {
        return num1 % num2;
    }
    // Método para dobrar o número
    public static double dobro(double num1) {
        return num1 * 2;
    }
    // Método para calcular o quadrado
    public static double quadrado(double num1) {
        return num1 * num1;
    }
    // Método para calcular o cubo
    public static double cubo(double num1) {
        return num1 * num1 * num1;
    }
    // Método para calcular a raiz quadrada
    public static double raizQuadrada(double num1) {
        return Math.sqrt(num1);
    }
}