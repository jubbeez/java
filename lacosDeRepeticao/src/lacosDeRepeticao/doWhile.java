package lacosDeRepeticao;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		int num,x=0,resultado;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número inteiro: ");
			num = leia.nextInt();
			if(num>0) {
				x+=num;
			}
		}while(num != 0);
			System.out.print("A soma dos números positivos é: "+x);


	}

}
