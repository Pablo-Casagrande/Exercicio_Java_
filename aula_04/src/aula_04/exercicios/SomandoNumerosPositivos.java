package aula_04.exercicios;

import java.util.Scanner;

public class SomandoNumerosPositivos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int somaNumeros = 0, numero;
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				somaNumeros += numero;
			}
		} while(numero != 0);

		System.out.printf("\nA soma dos números positivos é: %d",somaNumeros);
		
		leia.close();
		
	}
}