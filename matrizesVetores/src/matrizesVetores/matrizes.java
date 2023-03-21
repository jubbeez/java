package matrizesVetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        // Ler a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                // Soma dos elementos da diagonal principal
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }

                // Soma dos elementos da diagonal secundária
                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        // Mostrar a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar a diagonal principal
        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // Mostrar a diagonal secundária
        System.out.print("Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();

        // Mostrar a soma da diagonal principal
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);

        // Mostrar a soma da diagonal secundária
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
