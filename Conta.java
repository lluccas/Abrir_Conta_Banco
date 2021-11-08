package conta_banco;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	static Scanner ler = new Scanner(System.in);
	static Random gerador = new Random();


	public static void main(String[] args) {

		
		ContaMetodos c = new ContaMetodos();
		
		String opc ;
		String opp;
		int n, operacao;
		System.out.println(
				"Digite 1- para abrir Conta Corrente:\n\nDigite 2- para abrir Conta Poupança: \n\nDgite 3- para sair: ");
		n = ler.nextInt();
		ler.nextLine();
		
		if(n == 1) {
			c.Conta();
			System.out.println("Parabéns " + c.getNome() + " o número da sua contá bancária é: Cc:" + gerador.nextInt()
			+ " Ag:00" + gerador.nextInt(26) + " - Conta Corrente");
			System.out.println("Seu saldo está em: " + " R$: " + c.getSaldo());
			do {
				
				System.out.println("\nDigite a opção para a operação que deseja!!!");

				System.out.println("\nDigite 1- para sacar:\n\nDigite 2- para pagar ou depositar:\n\nDigite 3- para consultar saldo:\n\nDigite 4- Cancelar conta:");
				operacao = ler.nextInt(); ler.nextLine();
				
				switch (operacao) {
				case 1:
					c.sacarConta();
					break;
				case 2:
					c.pagar();
					break;
				
				case 3:
					c.Consulta();
					break;
					
				case 4:
					c.cancelarConta();
					break;
				}
				System.out.println("\nDeseja fazer mais operações [s/n]: ");
				opc = ler.next();
				
			}while(opc.equalsIgnoreCase("s"));
			if(opc.equalsIgnoreCase("n"))
				System.out.println("Obrigado Finalizando...........");
		}else if(n == 2) {
			c.Conta();
			System.out.println("Parabéns " + c.getNome() + " o número da sua contá bancária é: Cc:" + gerador.nextInt()
			+ " Ag:00" + gerador.nextInt(26) + " - Conta Corrente");
			System.out.println("Seu saldo está em: " + " R$: " + c.getSaldo());
			do {
				System.out.println("\nDigite a opção para a operação que deseja!");

				System.out.println("\nDigite 1- para sacar:\n\nDigite 2- para pagar ou depositar: \n\nDigite 3- para consultar saldo: \n\nDigite 4- Cancelar conta:");
				operacao = ler.nextInt();

				switch (operacao) {
				case 1:
					c.sacarConta();
					break;
				case 2:
					c.pagar();
					break;
				case 3:
					c.Consulta();
					break;
				case 4:
					c.cancelarConta();
					break;
					
					
				}
				if(operacao > 3) {
					System.out.println("Opção inválida favor tentar novamente: ");
				}

				System.out.println("\nDeseja fazer mais operações [s/n]: ");
				opp = ler.next();
				
			} while (opp.equals("s"));
			if(opp.equalsIgnoreCase("n"))
			System.out.println("Obrigado Finalizando...........");

		}else if(n == 3){
			System.out.println("Saindo...............");
		}

	}
}

