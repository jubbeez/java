package matrizesVetores;

import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> cb150d0729c86957a9cb80126f06af5baa2c8c1d
}
=======
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
>>>>>>> cb150d0729c86957a9cb80126f06af5baa2c8c1d
