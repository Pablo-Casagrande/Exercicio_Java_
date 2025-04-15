package aula_03;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double precoFinal;
		String escolha = "";
		
		
		System.out.println("-----------Lanchonete----------");
		System.out.println("                               ");
		System.out.println("1 -     Cachorro  Quente       ");
		System.out.println("2 -         X-Salada           ");
		System.out.println("3 -         X-Bacon            ");
		System.out.println("4 -          Bauru             ");
		System.out.println("5 -      Refrigerante          ");
		System.out.println("6 -     Suco de laranja        ");
		System.out.println("                               ");
		
		System.out.println("Digite a opção desejada:       ");
		int opcao = leia.nextInt();
		
		System.out.println("Agora digite a quantidade desejada");
		int quantidade = leia.nextInt();
		
		switch(opcao) {
		
		case 1:
			precoFinal = quantidade * 10;
			escolha = "Cachorro Quente";
			break;
			
		case 2:
			precoFinal = quantidade * 15;
			escolha = "X-Salada";
			break;
			
		case 3:
			precoFinal = quantidade * 18;
			escolha = "X-Bacon";
			break;
			
		case 4:
			precoFinal = quantidade * 12;
			escolha = "Bauru";
			break;
			
		case 5:
			precoFinal = quantidade * 8;
			escolha = "Refrigerante";
			break;
			
		case 6:
			precoFinal = quantidade * 13;
			escolha = "Suco de laranja";
			break;
		default:	
			System.out.println("Opção inválida");
			leia.close();
			return;
		}
		
		System.out.printf(" %d %s fica no valor de: %.2f R$",quantidade, escolha, precoFinal);
		
		
		
		leia.close();
	}

}
