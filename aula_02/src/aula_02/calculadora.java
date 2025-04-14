package aula_02;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Calculadora");
		
		System.out.println("Digite primeiro valor: ");
		double num_01 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double num_02 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f", num_01, num_02, (num_01 + num_02));
		System.out.printf("\n%.2f - %.2f = %.2f", num_01, num_02, (num_01 - num_02));
		System.out.printf("\n%.2f * %.2f =  %.2f", num_01, num_02, (num_01 * num_02));
		System.out.printf("\n%.2f / %.2f =  %.2f", num_01, num_02, (num_01 / num_02));
		System.out.printf("\n%.2f ^ %.2f =  %.2f", num_01, num_02, Math.pow(num_01, num_02));
		System.out.printf("\n%.2f R %.2f =  %.2f", num_01, num_02, Math.sqrt(num_01));
	}

}
