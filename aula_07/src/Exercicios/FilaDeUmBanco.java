package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDeUmBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
	
		int opcao;
		
	do {
		System.out.println("\n                                     ");
		System.out.println("    Fila de Atendimento de um Banco    ");
		System.out.println("\n***************************************");
		System.out.println("    1 - Adicionar cliente à fila        ");
		System.out.println("    2 - Listar todos os clientes        ");
		System.out.println("    3 - Retirar cliente da fila         ");
		System.out.println("    0 - Sair                            ");
		System.out.println("****************************************");
		System.out.println("\nDigite a opção desejada: ");
			
		opcao = leia.nextInt();
		leia.nextLine();
			
		switch(opcao) {
			
		case 1:
				System.out.println("\nDigite o nome que deseja adicionar à fila: ");
				fila.add(leia.nextLine());
				System.out.println("Cliente adicionado.");
				break;
				
		case 2:
			if (fila.isEmpty()) 
				System.out.println("\nA fila está vazia."); 
			else 
				System.out.println("\nOs clientes que estão na fila são: " + fila);
			break;
				
		case 3:	
			if (fila.isEmpty()) 
				System.out.println("\nA fila está vazia.");
			else 
				System.out.println("\nO cliente " + fila.poll() + " foi chamado.");
			break;
				
		case 0:	
				System.out.println("\nEncerrando o programa...");
			break;
				
		default:	
				System.out.println("\nOpção inválida.");
			}
			
		} while(opcao != 0);
		
		leia.close();
	}

}
