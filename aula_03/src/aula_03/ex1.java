package aula_03;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		float resultado;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float a = leia.nextFloat();
		
		System.out.println("Digite o valor de B:");
		float b = leia.nextFloat();
		
		
		System.out.println("Digite o valor de c:");
		float c = leia.nextFloat();
		
		resultado = a + b;
		
		if (resultado > c)
			System.out.printf("A soma de A + B é maior que C ");
		else if (resultado == c)
			System.out.println("A soma de A + B é igual a C ");
		else 
			System.out.println("A soma de A + B é menor do que C ");
		
		
		leia.close();
	}

}
