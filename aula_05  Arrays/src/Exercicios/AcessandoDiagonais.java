package Exercicios;

public class AcessandoDiagonais {
	
	public static void main(String[] args) {
	     

        int[][] matriz = {
            {  1,  2,  3},  
            { 4, 5, 6},   
            { 7, 8, 9}   
        };

        
        System.out.print("Elementos da Diagonal Principal: ");
        int somaPrincipal = 0;
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][linha] + " ");
            somaPrincipal += matriz[linha][linha];
        }
        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);

        System.out.print("\nElementos da Diagonal Secundária: ");
        int somaSecundaria = 0;
        for (int linha = 0; linha < 3; linha++) {
            int coluna = 2 - linha;  
            System.out.print(matriz[linha][coluna] + " ");
            somaSecundaria += matriz[linha][coluna];
        } 
        System.out.println("\nSoma da Diagonal Secundária: " + somaSecundaria);
    }
}


