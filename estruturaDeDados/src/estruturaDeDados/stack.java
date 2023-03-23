package estruturaDeDados;

import java.util.Stack;
import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		
		int menu;
		String nomeLivro = null,retiraLivro;
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		
		do {
			System.out.println("\n****************************************");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("\n2 - Listar Todos os Livros");
			System.out.println("\n3 - Retirar Livro da Pilha");
			System.out.println("\n0 - Sair");
			System.out.println("****************************************");
			System.out.println("\nEntre com a opção desejada: ");
			menu = leia.nextInt();
			
			switch(menu) {
				case 1:
				leia.nextLine();
				System.out.print("\nDigite o nome: ");		
				nomeLivro = leia.nextLine();
				pilha.add(nomeLivro);
				System.out.print("\nLivro adicionado!");	
				break;
		
			case 2:
				if (pilha.size() == 0){
					System.out.print("\nA pilha está vazia! ");
				}else {
				leia.nextLine();
				System.out.println("\nPilha");
				System.out.print(pilha);
				}
				break;
			
			case 3:
				if (pilha.size() == 0){
					System.out.print("\nA pilha está vazia! ");
				}else {
					leia.nextLine();
					System.out.println("\nFila: "+ pilha);
					System.out.println("\nRetire algúem da fila: ");
					retiraLivro = leia.nextLine();
					
					if(pilha.contains(nomeLivro)){
						pilha.remove(nomeLivro);
						System.out.println("\nUm livro foi retirado da pilha!");
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
