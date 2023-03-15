package Exercícios;
import java.util.Locale;
import java.util.Scanner;

public class algoritmo_pro_fluxograma {
	
	public static void main(String[] args) {
		float salario,abono,somaSalario;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		System.out.print("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		somaSalario=salario+abono;
		System.out.print("\nNovo salário: "+somaSalario);
	}	
}
