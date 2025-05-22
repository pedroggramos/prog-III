package controle;

import java.util.Scanner;

import dominio.Cliente;

public class ControleCliente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.println("Digite o nomme: ");
		String nome = input.nextLine();
		System.out.print("Digite o CPF(somente numeros): ");
		String cpf = input.nextLine();
		System.out.println("Digite a data(somente números): ");
		String data = input.nextLine();
		
		Cliente cliente = new Cliente(nome, cpf, data);
		
		System.out.println("Data formtada: " + cliente.formatarData());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: "+ cliente.formatarCPF());
		System.out.println("CLIENTE CADASTRADO");
		
	}
}
