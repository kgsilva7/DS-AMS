package com.mycompany.matriz;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;
        int jogadas = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (jogoEmAndamento) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + ", Linha e coluna de 0 a 2): ");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                
                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                    System.out.println("Jogada inválida.");
                    continue;
                }
                
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;
                
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " Ganhou");
                    jogoEmAndamento = false;
                } else if (jogadas == 9) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Empatou");
                    jogoEmAndamento = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }
    }
