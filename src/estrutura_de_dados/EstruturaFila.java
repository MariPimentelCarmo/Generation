package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaFila {

	public static void main(String[] args) {
		int opcao = 0;
		
		Queue<String> fila= new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************************************************");
		System.out.println("*              Bem-Vindo ao Banco Java              *");
		
		
		do {
			System.out.println("*****************************************************");
			System.out.println("*           1 - Adicionar cliente à fila            *");
			System.out.println("*           2 - Listar todos os clientes            *");
			System.out.println("*           3 - Retirar cliente da fila             *");
			System.out.println("*           0 - Sair                                *");
			System.out.println("*****************************************************\n");
			
			
			System.out.print("* Entre com a opção desejada: ");
			opcao = sc.nextInt();
			
			
			switch (opcao){
			case 0:
				System.out.println("Programa encerrado.");
			    break;
			    
			case 1: 
				System.out.print("Digite o nome do cliente: ");
				fila.add(sc.next());
				System.out.println("Cliente adicionado com sucesso !!\n");
				break;
				
			case 2: 
				if(fila.isEmpty() == true) {
					System.out.println("A fila está vazia.\n");
				} else {
					System.out.println("Clientes na fila: " + fila + "\n");
				}
				break;
			case 3: 
				if(fila.isEmpty() == true) {
					System.out.println("A fila está vazia.\n");
				} else {
					System.out.println("Chamando " + fila.poll() + "\n");
				}
				break;
			default:
				System.out.println("Opção inválida. Por favor tente novamente.\n");
				break;
			}
			
		} while (opcao != 0);
		

	}

}
