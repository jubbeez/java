package matrizesVetores;

import java.util.Scanner;

public class matrizes {
		    public static void main(String[] args) {
		        // Inicializa a matriz com zeros
		        int[][] matriz = new int[3][3];

		        // Cria um scanner para ler a entrada do usuário
		        Scanner sc = new Scanner(System.in);

		        // Lê os valores da matriz
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
		                matriz[i][j] = sc.nextInt();
		            }
		        }

		        // Mostra a matriz na tela
		        System.out.println("Matriz lida:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(matriz[i][j] + " ");
		            }
		            System.out.println();
		        }

		        // Mostra os elementos da diagonal principal
		        System.out.println("Elementos da diagonal principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][i]);
		        }

		        // Mostra os elementos da diagonal secundária
		        System.out.println("Elementos da diagonal secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][2 - i]);
		        }

		        // Calcula a soma dos elementos da diagonal principal
		        int somaDiagonalPrincipal = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matriz[i][i];
		        }
		        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

		        // Calcula a soma dos elementos da diagonal secundária
		        int somaDiagonalSecundaria = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalSecundaria += matriz[i][2 - i];
		        }
		        
		        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
		        
		    }
}