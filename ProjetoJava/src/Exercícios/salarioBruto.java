package Exercícios;
import java.util.Locale;
import java.util.Scanner;

public class salarioBruto {

	public static void main(String[] args) {
		float salario,adicNoturno,extras,descontos,somaSalario;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("\nDigite seu salário bruto: ");
		salario = leia.nextFloat();
		
		System.out.print("\nAdicional Noturno: ");
		adicNoturno = leia.nextFloat();
		
		System.out.print("\nHoras Extras: ");
		extras = leia.nextFloat();
		
		System.out.print("\nDescontos: ");
		descontos = leia.nextFloat();
		
		
		somaSalario=salario+adicNoturno+(extras*5)-descontos;
		
		System.out.print("\nNovo salário: "+somaSalario);
	}

}
