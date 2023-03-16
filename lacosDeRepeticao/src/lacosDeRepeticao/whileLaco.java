package lacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class whileLaco {

	public static void main(String[] args) {
		int idade,contador1=0,contador2=0;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Qual sua idade? ");
		idade = leia.nextInt();
		
		while(idade>0) {
			System.out.print("Qual sua idade? ");
			idade = leia.nextInt();
			if(idade<21) {
				contador1++;
			}else if(idade>50) {
				contador2++;
			}
		}			
		System.out.println("Total de pessoas com menos de 21 anos: "+contador1);
		System.out.println("Total de pessoas com mais de 50 anos: "+contador2);
		
	}

}
