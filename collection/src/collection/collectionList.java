package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionList {
	
	public static void main(String[] args) {
		
		String leituraCores;
		
		ArrayList<String> listaCores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++){
		System.out.println("Digite uma cor: ");
		leituraCores = leia.nextLine();
		listaCores.add(leituraCores);
		}
		
		System.out.println("Lista das cores: "+listaCores);
		
		Collections.sort(listaCores);
		
		System.out.println("\nOrdem das cores: ");
		
		for(String listaElementos:listaCores) {
			System.out.println(listaElementos);
		}

	}

}
