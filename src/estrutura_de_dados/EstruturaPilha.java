package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaPilha {

	public static void main(String[] args) {
		int opcao = 0;

		Stack<String> pilha = new Stack<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("*****************************************************");
		System.out.println("*            Bem-Vindo à Biblioteca Java            *");

		do {
			System.out.println("*****************************************************");
			System.out.println("*           1 - Adicionar novo livro                *");
			System.out.println("*           2 - Listar todos os livros              *");
			System.out.println("*           3 - Retirar um livro da pilha           *");
			System.out.println("*           0 - Sair                                *");
			System.out.println("*****************************************************\n");

			System.out.print("* Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado.");
				break;

			case 1:
				System.out.print("Digite o título do livro: ");
				sc.nextLine();
				pilha.push(sc.nextLine());
				System.out.println("Livro adicionado com sucesso !!\n");
				break;

			case 2:
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia.\n");
				} else {
					System.out.println("livros na pilha: " + pilha + "\n");
				}
				break;
			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia.\n");
				} else {
					pilha.pop();
					System.out.println("Um livro foi retirado da pilha \n");
				}
				break;
			default:
				System.out.println("Opção inválida. Por favor tente novamente.\n");
				break;
			}

		} while (opcao != 0);

	}

}
