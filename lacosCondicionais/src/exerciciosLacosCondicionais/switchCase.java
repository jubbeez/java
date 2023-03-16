package exerciciosLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		int codigo,quantidade;
		double preco=0,total;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("\nSelecione uma das opçôes: ");
		System.out.print("\n1");
		System.out.print("\n2");
		System.out.print("\n3");
		System.out.print("\n4");
		System.out.print("\n5");
		System.out.println("\n6");
		codigo = leia.nextInt();

		System.out.println("\nQual a quantidade comprada de produto? ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			preco=10.00;
			System.out.print("\nCachorro Quente ");
			break;
		case 2:
			preco=15.00;
			System.out.print("\n2-X-Salada ");
			break;
		case 3:
			preco=18.00;
			System.out.print("\n3-X-Bacon ");
			break;
		case 4:
			preco=12.00;
			System.out.print("\n4-Bauru ");
			break;
		case 5:
			preco=8.00;
			System.out.print("\n5-Refrigerante ");
			break;
		case 6:
			preco=13.00;
			System.out.println("\n6-Suco de laranja ");
			break;	
		default:
			System.out.print("\nOpção inválida!");
		}
	
	total=quantidade*preco;
	System.out.print(total);
	}

}
