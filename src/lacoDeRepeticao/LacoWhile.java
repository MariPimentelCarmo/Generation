package lacoDeRepeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		/* Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
		 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o 
		 * total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada
		 * ao digitar uma idade negativa. */
		
		int idade = 0;
		int menorDe21 = 0;
		int maiorDe50 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade > 0 && idade < 21) {
				menorDe21 += 1;
	
			} else if(idade > 50) {
				maiorDe50 += 1;
	
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorDe21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorDe50);

	}

}
