package exerciciosLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class cobrador {

	public static void main(String[] args) {
		String nome;
		int codigo;
		float salario,reajuste = 0,novoSalario;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Colaborador, qual seu nome? ");
		nome = leia.nextLine();
		
		System.out.print("Colaborador, selecione uma das opções: ");
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
		System.out.print("5 ");
		System.out.println("6 ");
		codigo = leia.nextInt();
		
		System.out.print("Colaborador, qual seu salário? ");
		salario = leia.nextFloat();
		
		switch(codigo) {
			case 1:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Gerente");
				reajuste=10/100;
				break;
			case 2:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Vendedor");
				reajuste=7/100;
				break;
			case 3:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Supervisor");
				reajuste=9/100;
				break;
			case 4:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Motorista");
				reajuste=6/100;
				break;
			case 5:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Estoquista");
				reajuste=5/100;
				break;
			case 6:
				System.out.println("Nome: "+nome);
				System.out.println("Cargo: Técnico de TI");
				reajuste=8/100;
				break;
		}
		
		novoSalario = salario + (reajuste*salario);
		
		System.out.println("Novo salário: "+novoSalario);
	}

}
