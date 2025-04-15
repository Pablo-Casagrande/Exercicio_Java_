package aula_03;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double reajuste;
		String colaborador = "";
		
		System.out.println("Qual o seu cargo na empresa escolha a baixo");
		System.out.println("                                           ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		System.out.println("                                           ");
		System.out.println("Digite o número do seu cargo");
		int cargo = leia.nextInt();
		
		System.out.println("Digite qual o seu salário atual");
		float salario = leia.nextFloat();
		
		switch(cargo) {
		
		 case 1:
			reajuste = salario + (salario  * 0.10);
			colaborador = "Gerente";
			break;
		 case 2:
				reajuste = salario + (salario  * 0.07);
				colaborador = "Vendedor";
				break;
		 case 3:
				reajuste = salario + (salario  * 0.09);
				colaborador = "Supervisor";
				break;
		 case 4:
				reajuste = salario + (salario  * 0.06);
				colaborador = "Motorista";
				break;
		 case 5:
				reajuste = salario + (salario  * 0.05);
				colaborador = "Estoquista";
				break;
		 case 6:
				reajuste = salario + (salario  * 0.08);
				colaborador = "Técnico de TI";
				break;
		 default:	
				System.out.println("Opção inválida");
				leia.close();
				return;
				
				
			}
			
			System.out.printf("%s teve um reajuste de %.2fR$ para %.2fR$", colaborador, salario, reajuste);
			
		leia.close();
	}

}
