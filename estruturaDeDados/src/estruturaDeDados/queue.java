package estruturaDeDados;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		String nomeCliente = null,retiraNome;
		int menu;
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		do {
		
		System.out.println("\n****************************************");
		System.out.println("1 - Adicionar Clientes na Fila");
		System.out.println("\n2 - Listar todos os Clientes");
		System.out.println("\n3 - Retirar Clientes da Fila");
		System.out.println("\n0 - Sair");
		System.out.println("****************************************");
		System.out.println("\nEntre com a opção desejada: ");
		menu = leia.nextInt();
		
			
			switch(menu) {
				case 1:
					leia.nextLine();
					System.out.print("\nDigite o nome do cliente: ");		
					nomeCliente = leia.nextLine();
					fila.add(nomeCliente);
					System.out.print("\nCliente adicionado!");	
					break;
			
				case 2:
					if (fila.size() == 0){
						System.out.print("\nA fila está vazia! ");
					}else {
					leia.nextLine();
					System.out.println("\nFila de clientes: ");
					System.out.print(fila);
					}
					break;
				
				case 3:
					if (fila.size() == 0){
						System.out.print("\nA fila está vazia! ");
					}else {
						leia.nextLine();
						System.out.println("\nFila: "+ fila);
						System.out.println("\nRetire algúem da fila: ");
						retiraNome = leia.nextLine();
						
						if(fila.contains(nomeCliente)){
							fila.remove(nomeCliente);
							System.out.println("\nO cliente foi chamado!");
						}else {
							System.out.println("\nEste nome não está na fila!");
						}
					}
					break;
				
				case 0:
					System.out.println("\nPrograma finalizado!");
					break;
					
				default:
					System.out.println("\nOpção Inválida! Tente novamente.");
			}
			
		}while(menu != 0);

		

	}

}
