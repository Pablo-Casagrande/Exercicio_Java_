package ex1;

import java.util.Scanner;

public class Array {

	// Método que chama os outros métodos 
    public static void main(String[] args) {
        int[] numeros = lerNumeros();

        System.out.println("\nNúmeros digitados:");
        exibirNumeros(numeros);

        double media = calcularMedia(numeros);
        int maior = encontrarMaior(numeros);
        int menor = encontrarMenor(numeros);

        System.out.printf("\nMédia dos números: %.2f\n", media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    // Método para ler 10 números que o usuário digitou e retornar o array
    public static int[] lerNumeros() {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = leia.nextInt();
        }

        leia.close();
        return numeros;
    }

    // Método para exibir os números do array
    public static void exibirNumeros(int[] numeros) {
        int i = 0;
        for (int num : numeros) {
            System.out.println("Posição " + i + ": " + num);
            i++;
        }
    }

    // Método para calcular a média dos números
    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return (double) soma / numeros.length;
    }

    // Método para encontrar o maior número do array
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    // Método para encontrar o menor número do array
    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
}
