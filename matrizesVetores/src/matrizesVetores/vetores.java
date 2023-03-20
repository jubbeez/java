package matrizesVetores;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		int numDigitado,posicao=0;
		boolean encontrado = false;
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontar: ");
		numDigitado = input.nextInt();
		
		for(int i=0;i<10;i++) {
			if(numDigitado == vetor[i]) {
				encontrado = true;
				posicao = i;
			}
		}
		
		if (encontrado) {
			System.out.println("O número "+numDigitado+" está localizado na posição "+posicao);
		}else {
			System.out.println("O número digitado não está dentro do vetor.");
		}

}
}
