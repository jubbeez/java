package exerciciosLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class doarSangue {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean jaDoou;
		
		
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("\nDigite seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("\nDigite sua idade: ");
		idade = leia.nextInt();
		


		if(idade>=60 && idade<=69){
			System.out.print("\nPrimeira doação de sangue?: ");
			jaDoou = leia.nextBoolean();
			if(jaDoou==true) {
				System.out.print("\n"+nome+" você não está apto a doar sangue!");
				}else if(jaDoou==false) {
					System.out.print("\n"+nome+" você está apto a doar sangue!");
				}
		}else if (idade>=18 && idade<=69) {
			System.out.print("\n"+nome+" você está apto a doar sangue!");
		}else {
				System.out.print("\n"+nome+" você não está apto a doar sangue!");
			}
		}
	}
		
	

