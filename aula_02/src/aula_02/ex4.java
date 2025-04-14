package aula_02;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("---Calculadora de diferencial---");
		
		
		System.out.println("\n\nDigite o primeiro número: ");
		float num1 = leia.nextFloat();

		System.out.println("\n\nDigite o segundo número: ");
		float num2 = leia.nextFloat();
		
		System.out.println("\n\nDigite o terceiro número: ");
		float num3 = leia.nextFloat();
		
		System.out.println("\n\nDigite o quarto número: ");
		float  num4 = leia.nextFloat();	
		
		System.out.printf("(%.2f * %.2f) - (%.2f * %.2f) O diferencial é = %.2f", num1, num2, num3, num4, (num1 * num2) - (num3 * num4));
		
		
	}

}
