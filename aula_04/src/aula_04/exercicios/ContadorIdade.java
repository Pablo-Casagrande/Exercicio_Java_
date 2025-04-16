package aula_04.exercicios;

import java.util.Scanner;

public class ContadorIdade {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int 	idadeMN = 0,
				idadeM50 = 0;
				
		
		System.out.println("Insira sua idade: ");
		int idade = leia.nextInt();
		
		
		while(idade > 0) {
		
			if(idade < 21) {
				idadeMN++;
			}
		
			else if(idade > 50) {
			idadeM50++;
		}
		
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
			
		}
		

		 
		System.out.printf("\n%d Pessoa tem menos que 21 anos", idadeMN);
		
		System.out.printf("\n%d Pessoa tem mais que 50 anos", idadeM50);
			
		
		leia.close();
		
	}
}
