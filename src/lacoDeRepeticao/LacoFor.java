package lacoDeRepeticao;
import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela
		 *quantos números são pares e quantos número são ímpares. */
		
		int numDigitado;
		int par = 0;
		int impar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "º número:");
			numDigitado = sc.nextInt();
			
			if(numDigitado %2==0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
			
		}
		System.out.println("__________________________________________________");
		System.out.println("| Total de números pares: " + par);
		System.out.println("| Total de números ímpares: " + impar);
		System.out.println("|_________________________________________________");

	}

}
