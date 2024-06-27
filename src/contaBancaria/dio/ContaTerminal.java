package contaBancaria.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Exibir as mensagem para o usuario
		System.out.println("____________________________");
		System.out.println("Digite o numero da Conta");
		String conta = scanner.next();
		
		System.out.println("Digite o numero da Agencia");
		String agencia = scanner.next();
		
		System.out.println("Digite seu Nome");
		String nome = scanner.next();
		
		System.out.println("Digite seu Saldo");
		Double saldo = scanner.nextDouble();
		
		System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+conta+" e"
				+ " seu saldo "+saldo+" já está disponível para saque");
		//Obter pela classe Scanner os valores digitados no terminal
		
		//Exibir a mensagem final da conta criada

	}

}
