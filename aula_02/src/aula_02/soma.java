package aula_02;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Programa de soma e concatenação");
		System.out.println("\nInsira um número para soma");
		int num1 = leia.nextInt();
		
		System.out.println("Insira outro número");
		int num2 = leia.nextInt();
		
		System.out.printf("\nSoma: %d + %d = %d", num1, num2, (num1 + num2));
		
		
		System.out.println("\n\nAgora insira um número para ser concatenado");
		String nums1 = leia.next();
		
		System.out.println("Insira outro7 número ");
		String nums2 = leia.next();
		
		System.out.printf("\nConcatenação: %s + %s = %s", nums1, nums2, (nums1 + nums2));
	}

}
