package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class diferencaDosProdutos {

	public static void main(String[] args) {
		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("\nDigite o n1: ");
		n1 = leia.nextFloat();
		
		System.out.print("\nDigite o n2: ");
		n2 = leia.nextFloat();
		
		System.out.print("\nDigite o n3: ");
		n3 = leia.nextFloat();
		
		System.out.print("\nDigite o n4: ");
		n4 = leia.nextFloat();
		
		
		diferenca=(n1*n2)-(n3*n4);
		
		System.out.print("\nCalculo: "+diferenca);
	}

}
