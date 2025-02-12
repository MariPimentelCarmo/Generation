package lacoDeRepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número 
		 * zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que
		 * sejam positivos.*/
		
		int num = 0;
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		} while(num != 0);
		
		System.out.println("\n A soma dos números positivos é: " + soma);
	}

}
