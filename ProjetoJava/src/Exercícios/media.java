package Exercícios;
import java.util.Locale;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		System.out.print("\nMédia Final: "+media);	
	}

}
