package aula_03;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um numero inteiro:  ");
		int numero = leia.nextInt();
		
		String resultado = "";
		
		 if (numero % 2 == 0)
	            resultado += "é um número par";
	        else
	            resultado += "é um número ímpar";
	        
	        if (numero >= 0)
	            resultado += " e positivo.";
	        else
	            resultado += " e negativo.";
	        
	        System.out.println("O número " + numero + " " + resultado);
			
			
		leia.close();
	}

}
