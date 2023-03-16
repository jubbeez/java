package exerciciosLacosCondicionais;

import java.util.Scanner;

public class caracAnimais {

	public static void main(String[] args) {
		int fase2_1,fase2_2,fase3_11,fase3_12,fase3_21,fase3_22,fase4;
		int selecione,ave_mam,ins_anel,carn_oni,oni_herb;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nSelecione uma das opçôes: ");
		System.out.print("\n1-Vertebrado ");
		System.out.println("2-Invertebrado");
		selecione = leia.nextInt();
		
		switch(selecione) {
			case 1:
				System.out.print("\nSelecione uma das opçôes: ");
				System.out.print("\n1-Ave ");
				System.out.println("2-Mamífero");
				ave_mam = leia.nextInt();
				switch(ave_mam) {
					case 1:
						System.out.print("\nSelecione uma das opçôes: ");
						System.out.print("\n1-Carnívoro ");
						System.out.print("2-Onívoro");
						carn_oni = leia.nextInt();
						switch(carn_oni) {
						case 1:
							System.out.print("\nÉ a águia");
							break;
						case 2:
							System.out.print("\nÉ a pomba");
							break;
						}
						break;
					case 2: 
						System.out.print("\nSelecione uma das opçôes: ");
						System.out.print("\n1-Onívoro ");
						System.out.print("2-Herbívoro");
						oni_herb = leia.nextInt();
						switch(oni_herb) {
						case 1:
							System.out.print("\nÉ o homem");
							break;
						case 2:
							System.out.print("\nÉ a vaca");
							break;
						}
						break;
				}
				break;
			case 2:
				System.out.print("\nSelecione uma das opçôes: ");
				System.out.print("\n1-Inseto ");
				System.out.println("2-Anelídeo");
				ins_anel = leia.nextInt();
				switch(ins_anel) {
				case 1:
					System.out.print("\nSelecione uma das opçôes: ");
					System.out.print("\n1-Hematógrafo ");
					System.out.print("2-Herbívoro");
					carn_oni = leia.nextInt();
					switch(carn_oni) {
					case 1:
						System.out.print("\nÉ a pulga");
						break;
					case 2:
						System.out.print("\nÉ a lagarta");
						break;
					}
					break;
				case 2: 
					System.out.print("\nSelecione uma das opçôes: ");
					System.out.print("\n1-Hematógrafo ");
					System.out.print("2-Onívoro");
					oni_herb = leia.nextInt();
					switch(oni_herb) {
					case 1:
						System.out.print("\nÉ a sanguessuga");
						break;
					case 2:
						System.out.print("\nÉ a minhoca");
						break;
					}
					break;
			}
			break;
	}
	}
}
