package aula_04.exercicios;

import java.util.Scanner;

public class MutiplosDe3e5 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);{
		
		int contador;
		
		System.out.println("Insira um número inteiro:  ");
		int numero1 = leia.nextInt();
		
		System.out.println("Insira um número inteiro:  ");
		int numero2 = leia.nextInt();
		
		
		if (numero1 < numero2) {
			System.out.println("\nNo intervalo entre "+ numero1 + " e " + numero2 + " os números divisiveis por 3 e 5 sao: " );
			
			
		for( contador = numero1; contador <= numero2; contador ++ ) {
		 		if (contador % 3 == 0 && contador % 5 == 0) {
		 			System.out.printf( contador + " ");
		 		
		 		}
		
			}
		
		}

		else
			System.out.println("Opcao invalida");
		
		leia.close();}
	}
}

