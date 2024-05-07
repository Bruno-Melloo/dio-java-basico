package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Olá, seja bem vindo.\nPor favor, digite seu nome:");
		String nome = scanner.next();

		System.out.println("Digite o número da sua agência:");
		String agencia = scanner.next();

		System.out.println("Por favor, digite o número da sua conta:");
		int numero = scanner.nextInt();

		System.out.println("Digite qual o valor deseja sacar:");
		double saldo = scanner.nextDouble();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.\nSua agência é: " + agencia
				+ ", conta: " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

		scanner.close();
	}

}
