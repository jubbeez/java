package exerciciosLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class oqueEoqueE {

	public static void main(String[] args) {
		int entrada,resto;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("\nDigite um número: ");
		entrada=leia.nextInt();
		
		resto = entrada%2;
		
		if (entrada>=0 && resto==0) {
			System.out.print("\nO número "+entrada+" é par e positivo!");
		}else if(entrada<0 && resto==0) {
			System.out.print("\nO número "+entrada+" é par e negativo!");
		}else if (entrada>=0 && resto!=0) {
			System.out.print("\nO número "+entrada+" é ímpar e positivo!");
		}else if(entrada<0 && resto!=0) {
			System.out.print("\nO número "+entrada+" é ímpar e negativo!");
		}else {System.out.print("\nNúmero inválido");
		}
			
		}
}
