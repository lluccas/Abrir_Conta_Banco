package conta_banco;

import java.util.Random;
import java.util.Scanner;

public class ContaMetodos {

	// atributos

	private String nome;
	private double sacar;
	private double saldo;
	private double pagar;
	private boolean cancelar = false;

	static Scanner cc = new Scanner(System.in);
	static Random gerador = new Random();

	public void Conta() {
		System.out.println("\nDigite o seu nome completo: ");
		this.setNome(cc.next()); 
		

	}

	public void sacarConta() {
		if(this.getCancelar()==false) {
		System.out.println(this.getNome() + " Seu saldo atual é de: " + this.getSaldo());
		System.out.println("\nDigite o Valor que deseja sacar: ");
		this.sacar = cc.nextInt();
		cc.nextLine();
		this.saldo = this.getSaldo() - this.sacar;
		System.out.println("\nSeu saldo atual é: R$" + this.getSaldo());
		}else if(this.getCancelar() == true){
			System.out.println("Sua conta foi cancelada favor procurar seu gerente no banco!!!!");
		}
	}

	public void pagar() {
		if(this.getCancelar()==false) {
		System.out.println(this.getNome() + " qual valor deseja pagar ou depositar? ");
		this.pagar = cc.nextDouble();
		this.saldo = this.getSaldo() + this.pagar;
		System.out.println("\n" + this.getNome() + " seu saldo atual é de: R$" + this.getSaldo());
		}else if(this.getCancelar() == true){
			System.out.println("Sua conta foi cancelada favor procurar seu gerente no banco!!!!");
		}
	}

	public void cancelarConta() {
		if (this.getSaldo() < 0)
			System.out.println(this.getNome()
					+ "Seu saldo atual está negativo, faça o pagamento do saldo pendente para poder cancela sua conta! Saldo negativado: R$:"
					+ this.getSaldo());
		if (this.getSaldo() > 0)
			System.out.println(this.getNome()
					+ " é necessário que sua conta esteja com saldo zerado para cancelar, favor sacar valor restante para cacelamento! Saque o valor restante do seu saldo R$: "
					+ this.getSaldo());
		if (this.getSaldo() == 0) {
			System.out.println(this.getNome() + " sua conta foi cancelada com sucesso!!");
			this.setCancelar(true);
		}
	}
	
	public void Consulta(){
		System.out.println(this.getNome() + " seu saldo atual é R$:" + this.getSaldo());
	}

	// metodos especiais

	public double getSacar() {
		return sacar;
	}

	public void setSacarc(double sacar) {
		this.sacar = sacar;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getPagar() {
		return pagar;
	}

	public void setPagar(double pagar) {
		this.pagar = pagar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getCancelar() {
		return cancelar;
	}

	public void setCancelar(boolean cancelar) {
		this.cancelar = cancelar;
	}

}
