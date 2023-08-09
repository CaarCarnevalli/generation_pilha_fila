package generation_pilha_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> Numero = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		int x;

		do {
			System.out.println("=======================================");
			System.out.println("1:Adicionar o nome do Cliente na fila: ");
			System.out.println("2 :Listar todos os Clientes na fila:  ");
			System.out.println("3:Chamar uma pessoa da fila: ");
			System.out.println("0: O programa deve ser finalizado.");
			System.out.println("=======================================");
			System.out.println("Escolha uma opção: ");

			x = leia.nextInt();

			switch (x) {

			case 1:

				System.out.println("Adicione o nome do cliente: ");
				String nome = leia.next();
				Numero.add(nome);
				break;

			case 2:

				System.out.println("A fila de clientes são: " + Numero);
				break;

			case 3:
				System.out.println("O cliente chamado foi: " + Numero.poll());
				break;
			}
		} while (x != 0);
		System.out.println("Programa foi finalizado.");

	}

}
