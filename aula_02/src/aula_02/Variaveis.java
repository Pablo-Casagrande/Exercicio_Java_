package aula_02;

import java.util.Scanner;

public class Variaveis {
 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
				
				System.out.println("insira um numero");
				int numero_01 = leia.nextInt();
				
				System.out.println("insira um segundo numero");
				int numero_02 = leia.nextInt();
				
				char opcao = 'V';
				boolean menorIdade = true;
				
				System.out.println("insira seu nome");
				String nome = leia.next();
					
				// Definição da constante PI
				final double PI = 3.1415;
				
				// Atribuição de valor
				//numero_02 = 75;
				
				// Exibição em tela
				System.out.printf("Variável numero 1 é igual a: %d\n", numero_01);
				System.out.println("Variável numero 2 é igual a: " + numero_02);
				System.out.printf("Constante PI é igual a: %.2f\n", PI);
				System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
			}
		 
}
 
