package Exercicios;

import java.util.Scanner;

public class ImprimirIndiceVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int []vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

		
		
		System.out.println("\nDigite um número:  ");
		int numero = leia.nextInt();
		
		boolean encontrado = false
				;
		
		for (int indice = 0; indice < 10; indice++) {
			if(numero == vetor[indice] ) {
				System.out.println("O número " + numero + " está localizado no Índice:  " + indice);
				encontrado = true;
			}
		}
		if (!encontrado) 
            System.out.println("Opção Inválida");
		
		leia.close();
	}
}
