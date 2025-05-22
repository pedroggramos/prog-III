package controle;

import dominio.FrequenciaCardiaca;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContrleFrequenciaCardiaca {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("CADASTRO DE ATLETA:");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o sobrenome: ");
		String sobrenome = input.nextLine();
		System.out.print("Digite o dia de nascimento: ");
		int dia = input.nextInt();
		System.out.print("Digite o mês do nascimento: ");
		int mes = input.nextInt();
		System.out.print("Digite o ano do nascimento: ");
		int ano = input.nextInt();

		FrequenciaCardiaca frequenciacardiaca = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);

		System.out.println("DADOS DO ATLETA CADASTRADO");
		System.out.println("Nome Completo: " + frequenciacardiaca.informarNome());
		System.out.println("Data de Nascimento: " + frequenciacardiaca.informarNascimento());
		System.out.println("Idade: " + frequenciacardiaca.calcularIdade());
		System.out.println("FCM: " + frequenciacardiaca.calcularFcm());
		System.out.println("FCA: " + frequenciacardiaca.calcularFca());

	}



}
