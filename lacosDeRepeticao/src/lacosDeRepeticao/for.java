package lacosDeRepeticao;

import java.util.Scanner;

public class intervaloDeNumeros {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
            System.out.println("Intervalo inválido");
        }else {
			System.out.print("\nNo intervalo entre "+num1+" e "+num2+":");
			
        	for(;num1 <= num2; num1++) {
    			
    			int restoPor3 = num1%3;
    			int restoPor5 = num1%5;
    			
    			if((restoPor3==0)&&(restoPor5==0)) {
    				System.out.print("\n"+num1+" é múltiplo de 3 e 5.");
    			}
        	}
		}	
	}
}
