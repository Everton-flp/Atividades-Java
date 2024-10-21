/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade3 {
    private static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    private static final char JOGADOR = 'X';
    private static final char COMPUTADOR = 'O';
    private static final char VAZIO = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            System.out.println("Escolha o modo de jogo:");
            System.out.println("a. Normal");
            System.out.println("b. Difícil");
            char modo = scanner.nextLine().charAt(0);
            resetarTabuleiro();
            boolean jogoAtivo = true;

            while (jogoAtivo) {
                mostrarTabuleiro();
                fazerJogada(scanner);
                if (verificarVencedor(JOGADOR)) {
                    mostrarTabuleiro();
                    System.out.println("Você venceu!");
                    jogoAtivo = false;
                    break;
                }
                if (isTabuleiroCheio()) {
                    mostrarTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                    break;
                }

                if (modo == 'a') {
                    jogadaComputadorAleatoria();
                } else {
                    jogadaComputadorDificil();
                }
                if (verificarVencedor(COMPUTADOR)) {
                    mostrarTabuleiro();
                    System.out.println("O computador venceu!");
                    jogoAtivo = false;
                }
                if (isTabuleiroCheio()) {
                    mostrarTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.nextLine().equalsIgnoreCase("s");
        } while (jogarNovamente);

        scanner.close();
    }

    private static void resetarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    private static void mostrarTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static void fazerJogada(Scanner scanner) {
        int linha, coluna;
        while (true) {
            System.out.print("Digite a linha e coluna (ex: 1 1): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == VAZIO) {
                tabuleiro[linha][coluna] = JOGADOR;
                break;
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }

    private static void jogadaComputadorAleatoria() {
        Random random = new Random();
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != VAZIO);
        tabuleiro[linha][coluna] = COMPUTADOR;
    }

    private static void jogadaComputadorDificil() {
        // Verifica se o computador pode ganhar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = COMPUTADOR;
                    if (verificarVencedor(COMPUTADOR)) return;
                    tabuleiro[i][j] = VAZIO; // Desfaz jogada
                }
            }
        }

        // Bloqueia se o jogador pode ganhar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = JOGADOR;
                    if (verificarVencedor(JOGADOR)) {
                        tabuleiro[i][j] = COMPUTADOR;
                        return;
                    }
                    tabuleiro[i][j] = VAZIO; // Desfaz jogada
                }
            }
        }

        // Se não puder ganhar ou bloquear, joga aleatoriamente
        jogadaComputadorAleatoria();
    }

    private static boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
               (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    private static boolean isTabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) return false;
            }
        }
        return true;
    }
}
