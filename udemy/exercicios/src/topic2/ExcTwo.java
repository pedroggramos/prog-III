package topic2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
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
//		input.close();
		
		
		
//		-------------------
		
	System.out.print("Quantos pedidos serão realizados?: ");
	int qtd = input.nextInt();
	
	int[] pedidos = new int[qtd];
	float[] valorTotal = new float[qtd];
	int op = 0;
	boolean entradaValida;
	ArrayList<Map<String, Integer>> produtosPorPedido = new ArrayList<>();

	
	input.nextLine();
		
	for(int i = 0; i < pedidos.length; i++) {
		Map<String, Integer> produtos = new LinkedHashMap<>();
		String continuar = null;
		 entradaValida = false;
			do{
				entradaValida = false;
				do {
				System.out.print("=============MENU============\n\n1 - Hamburguer - R$10,00\n"
						+ "2 - Refrigerante - R$6,00\n"
						+ "3 - Batata Frita(P - R$10, M - R$14, G - R$20)\n"
						+ "4 - Finalizar Pedido\n");
						System.out.printf("\nDigite um produto para o pedido N°%d: ", i + 1);
						String entrada = input.nextLine();
					
				
					try {
						op = Integer.parseInt(entrada);
							
						if(op != 1 && op != 2 && op != 3 && op != 4){
							System.out.println("Digite um valor válido.");
						}
						else{
							entradaValida = true;
						}
					}catch(NumberFormatException e){
						System.out.print("Digite um número válido(somente numeros).\n\n");
					}
				}while(!entradaValida);
						
				
				switch(op) {
				case 1:
					valorTotal[i] += 10.00;
					System.out.println("Hamburguer adicionado com sucesso!");
					adicionarProduto(produtos, "Hamburguer");
					break;
				case 2:
					valorTotal[i] += 6.00;
					System.out.println("Refrigerante adicionado com sucesso!");
					adicionarProduto(produtos, "Refrigerante");
					break;
				case 3:
					System.out.print("Digite o tamanho da batata: ");
					String tam = input.nextLine().trim().toLowerCase();
					
					while(!tam.equals("p") && !tam.equals("pequeno") && !tam.equals("pequena") && !tam.equals("m") && !tam.equals("medio") && !tam.equals("médio") && !tam.equals("média") && !tam.equals("media") && !tam.equals("g") && !tam.equals("grande")) {
						System.out.print("Digite um tamanho válido: ");
						tam = input.nextLine().trim().toLowerCase();
					}
					if(tam.equals("p") || tam.equals("pequeno") || tam.equals("pequena")) {
						valorTotal[i] += 10.00;
						System.out.println("Batata pequena adicionada!");
						adicionarProduto(produtos, "Batata Pequena");
					}
					else if(tam.equals("m") || tam.equals("medio") || tam.equals("médio") || tam.equals("média") || tam.equals("media")) {
						valorTotal[i] += 14.00;
						System.out.println("Batata média adicionada!");
						adicionarProduto(produtos, "Batata Média");
					}
					else{
						valorTotal[i] += 20.00;
						System.out.println("Batata grande adicionada!");
						adicionarProduto(produtos, "Batata Grande");
					}
					break;
				case 4:
					 System.out.printf("Pedido nº %d finalizado!\n", i + 1);
					    continuar = "nao";
					    break;
				}
				
				System.out.printf("Valor até agora do pedido n°%d: R$%.2f\n", i + 1, valorTotal[i]);
			    System.out.print("Itens até o momento: ");
			    for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
                    System.out.printf("- %s: %d unidade(s)\n", entry.getKey(), entry.getValue());
                }
			    System.out.println();
			    System.out.print("Deseja adicionar mais itens a este pedido? (sim/não): ");
				continuar = input.nextLine().toLowerCase();
			
			 } while (continuar.equals("sim") || continuar.equals("s") || continuar.equals("yes"));

            produtosPorPedido.add(produtos);
        }

        if (pedidos.length > 1) {
            System.out.println("Atendimentos finalizados com sucesso!");
        } else {
            System.out.println("Atendimento Finalizado com sucesso!");
        }

        input.close();
    }

    
    private static void adicionarProduto(Map<String, Integer> produtos, String nome) {
        produtos.put(nome, produtos.getOrDefault(nome, 0) + 1);
    }
}


