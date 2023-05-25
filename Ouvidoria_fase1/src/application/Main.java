package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ocorrencias = new String[5];
		int numReclamacoes = 0;

		int opcao = 0;
		while (opcao != 3) {
			System.out.println("============= MENU =============");
			System.out.println();
			System.out.println("1) Inserir nova reclamação");
			System.out.println("2) Listar reclamações");
			System.out.println("3) Sair");
			System.out.println();
			System.out.println("=========== OUVIDORIA ===========");
			System.out.println();
			System.out.println("Digite a sua opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sc.nextLine();
				if (numReclamacoes < ocorrencias.length) {
					System.out.println();
					System.out.print("Digite a sua reclamação: ");
					System.out.println();
					String ocorrencia = sc.nextLine();
					ocorrencias[numReclamacoes] = ocorrencia;
					numReclamacoes++;
					System.out.println();
					System.out.printf("Reclamação cadastrada com sucesso! Reclamação: %s %n", ocorrencia);
					System.out.println();
				} else {
					System.out.println("Não é possível adicionar mais reclamações. Chegou ao limite. ");
				}
				break;
			case 2:

				if (numReclamacoes == 0) {
					System.out.println();
					System.out.println("Não existem reclamações registradas.");
					System.out.println();

				} else
					sc.nextLine();
				System.out.println();
				System.out.println("Listar Reclamações: ");
				System.out.println();
				for (int x = 0; x < ocorrencias.length; x++) {
					if (ocorrencias[x] != null) {
						System.out.println((x + 1) + ". " + ocorrencias[x]);
					}
				}

				break;
			case 3:
				System.out.println();
				System.out.println("Até logo. Obrigado pelo seu feedback! ");
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("Opção inválida ");
				System.out.println();
			}

			System.out.println();
		}

		sc.close();
	}

}
