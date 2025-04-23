package Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
	
		int opcao;
		
		do {
		System.out.println("\n                                     ");
		System.out.println("            Pilha de Livros            ");
		System.out.println("\n***************************************");
		System.out.println("    1 - Adicionar livro à pilha         ");
		System.out.println("    2 - Listar todos os livros          ");
		System.out.println("    3 - Retirar livro da pilha          ");
		System.out.println("    0 - Sair                            ");
		System.out.println("***************************************");
		System.out.print("\nDigite a opção desejada: ");
			
		opcao = leia.nextInt();
		leia.nextLine();
			
		switch(opcao) {
			
		case 1:
				System.out.print("\nDigite o nome do livro que deseja adicionar à pilha: ");
				pilha.push(leia.nextLine());
				System.out.println("Livro adicionado.");
				break;
				
		case 2:
			if (pilha.isEmpty()) 
				System.out.println("\nA pilha está vazia.");
			else 
				System.out.println("\nOs livros que estão na pilha são: " + pilha);
			break;
				
		case 3:	
			if (pilha.isEmpty()) 
				System.out.println("\nA pilha está vazia.");
			else 
				System.out.println("\nO livro '" + pilha.pop() + "' foi retirado da pilha.");
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
