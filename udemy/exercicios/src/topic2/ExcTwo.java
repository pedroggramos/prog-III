package topic2;

import java.util.Locale;
import java.util.Scanner;

public class ExcTwo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

//		System.out.print("Digite um valor");
//		int valor = input.nextInt();
//		
//		if(valor < 0) {
//			System.out.println("NEGATIVO");
//		}
//		else {
//			System.out.println("Não Negativo");
//		}
		
//		--------------------

//		System.out.print("Digite um valor: ");
//		int valor = input.nextInt();
//		
//		if(valor % 2 == 0) {
//			System.out.println("Par");
//		}
//		else {
//			System.out.println("ímpar");
//		}

//		System.out.print("V1: ");
//		int v1 = input.nextInt();
//		System.out.print("V2: ");
//		int v2 = input.nextInt();
//		
//		if(v1 % v2 == 0 || v2 % v1 == 0) {
//			System.out.println("Múltiplos");
//		}
//		else {
//			System.out.println("Não são múltiplos");
//		}
		
//		------------------------

//		System.out.print("Inicial: ");
//		int v1 = input.nextInt();
//		System.out.print("Final: ");
//		int v2 = input.nextInt();
//
//		int duracao = 0;
//
//		if ((v1 < 24 && v1 > 0) && (v2 < 24 && v2 > 0)) {
//			if (v2 > v1) {
//				duracao = v2 - v1;
//			} else {
//				duracao = 24 - v1 + v2;
//			}
//		}
//
//		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
//		-------------------
		
//		float valorTotal = 0;
//		String continuar;
//		do {
//			System.out.println("\n -------------MENU------------\n1 - Cachorro Quente - R$4,00\n2 - X-Salada - R$4,50\n3 - X-Bacon - R$5,00\n4 - Torrada Simples - R$2,00\n5 - Refrigirante - R$1,50\n");
//			System.out.print("Digite o produto desejado: ");
//			int p = input.nextInt();
//
//			if (p == 1) {
//				valorTotal += + 4;
//			}
//			else if(p == 2) {
//				valorTotal += 4.50;
//			}
//			else if(p == 3) {
//				valorTotal += 5.00;
//			}
//			else if(p == 4) {
//				valorTotal += 2.00;
//			}
//			else if(p == 5) {
//				valorTotal += 1.50;
//			}
//			else {
//				System.out.print("Digite um valor válido: ");
//				p = input.nextInt();
//			}
//			
//			input.nextLine();
//			while(true){
//				System.out.print("Deseja continuar?: ");
//				continuar = input.nextLine().trim().toLowerCase();
//				
//				if(continuar.equals("sim") || continuar.equals("nao") || continuar.equals("não")){
//					break;
//				}
//				else {
//					System.out.println("Inválido! Digite sim ou não.");
//				}
//			}
//			
//			
//		} while (continuar.equals("sim"));
//		
//		System.out.printf("O valor total a ser pago é de: R$%.2f", valorTotal);
//		input.close();
		
		
//		-------------
		
//		
//		System.out.print("Digite o valor: ");
//		float valor = input.nextFloat();
//		
//		if(valor >= 0 && valor <= 25) {
//			System.out.println("Intervalo [0,25]");
//		}
//		else if(valor > 25 && valor <= 50) {
//			System.out.println("Intervalo (25,50]");
//		}
//		else if(valor > 50 && valor <= 75) {
//			System.out.println("Intervalo (50, 75]");
//		}
//		else if(valor > 75 && valor <= 100) {
//			System.out.println("Intervalo (75, 100]");
//		}
//		else {
//			System.out.println("Fora do intervalo");
//		}
		
		
//		-----------------------------
		
//		float x = 0;
//		float y = 0;
//		
//		System.out.println("Defina os valores dos eixos");
//		System.out.print("X: ");
//		x = input.nextFloat();
//		System.out.print("Y: ");
//		y = input.nextFloat();
//		
//		if(y > 0) {
//			if(x > 0) {
//				System.out.println("Q1");
//			}
//			else if(x < 0) {
//				System.out.println("Q2");
//			}
//			else {
//				System.out.println("Eixo Y");
//			}
//		}
//	
//		else if(y < 0) {
//			if(x > 0) {
//				System.out.println("Q4");
//			}
//			else if(x < 0) {
//				System.out.println("Q3");
//			}
//			else {
//				System.out.println("Eixo Y");
//			}
//		}
//		
//		else if(y == 0) {
//			if(x > 0 || x < 0) {
//				System.out.println("Eixo X");
//			}
//			
//			else {
//				System.out.println("Origem");
//			}
//
//		}
		
//		-----------------------
		
//		System.out.print("Digte sua renda: ");
//		float renda = input.nextFloat();
//		
//		float imposto = 0;
//		
//		if(renda >= 0 && renda <= 2000) {
//			System.out.println("Isento");
//			System.out.printf("Renda: R$%.2f", renda);
//		}
//		
//		else if(renda > 2000 && renda <= 3000) {
//			imposto = (float) ((renda - 2000.00) * 0.08);
//            System.out.printf("Renda: R$ %.2f\n", renda - imposto);
//		}
//		
//		else if(renda > 3000 && renda <= 4500) {
//			imposto = (float) (1000.00 * 0.08) + (float) ((renda - 3000.00) * 0.18);
//			System.out.printf("Renda: R$%.2f\n", renda - imposto);
//		}
//		
//		else {
//			imposto = (float) ((float) (1000.00 * 0.08) + (float) (1500.00 * 0.18) + ((renda - 4500)) * 0.28);
//			System.out.printf("Renda: R$%.2f\n", renda - imposto);
//		}
		
//		------------------------------
		
//		
//		System.out.print("Digite o valor de minutos: ");
//		int min = input.nextInt();
//		float conta = 50;
//		
//		if(min > 100) {
//			conta += (min - 100) * 2;
//			System.out.printf("Valor da conta é de R$%.2f", conta);
//		}
//		else {
//			System.out.printf("Valor da conta é de R$%.2f", conta);
//		}
		
//		------------------------------
//		int cont = 0;
//		float valor = 0;
//		while(true) {
//			System.out.println("============Menu==========\n" + "1 - Hamburguer: R$17,00\n" + "2 - Guaravita: R$02,00\n"
//					+ "3 - Batata Frita: R$09,00\n" + "4 - Cachorro Quente: R$12,00");
//
//			System.out.print("Digite qual produto deseja: ");
//			int p = input.nextInt();
//			
//			while (!(p > 0 && p <= 4)) {
//				System.out.print("Inválido! Digite um valor entre 1 e 4: ");
//				p = input.nextInt();
//			}
//			cont += 1;
//			
//			switch(p) {
//			case 1:
//				valor += 17.00;
//				break;
//			case 2:
//				valor += 2;
//				break;
//			case 3:
//				valor += 9;
//				break;
//			case 4:
//				valor += 12;
//				break;
//			default:
//				System.out.println("Valor inválido! Digite o correto.");
//				break;
//			}
//			
//			input.nextLine();
//			System.out.printf("%d itens já adicionados somando um valor de R$%.2f!\nDeseja adicionar algo mais?: ", cont, valor);
//			
//			String resposta = input.nextLine().trim().toLowerCase();
//			
//			while(!resposta.equals("sim") && !resposta.equals("s") && !resposta.equals("nao") && !resposta.equals("não") && !resposta.equals("n")) {
//		        System.out.print("Inválido, escreva 'Sim' ou 'Não': ");
//		        resposta = input.nextLine().trim().toLowerCase();
//		    }
//			
//			if(resposta.equals("sim") || resposta.equals("s")) {
//				System.out.println("Continuando...\n");
//				continue;
//			}
//			else {
//				System.out.println("Encerrando Pedido....\n\n PEDIDO COMPLETO!");
//				break;
//			}
//		}
//		
		input.close();
		
		
		
		
		

	}
}
