package excTopic1;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.print("Digite o tamanho da array: ");
		int tam = input.nextInt();
		
		int v[] = new int[tam];
		
		for(int i = 0; i < v.length; i++) {
			System.out.printf("Digite o numero %d: ", i + 1);
			v[i] = input.nextInt();
			input.nextLine();
		}
		
		
		for(int i = 0; i < v.length; i++) {
			System.out.printf("O valor do numero %d é: %d\n", i + 1, v[i]);
		} */
		
		/*
		
		System.out.printf("==================DADOS=============="
				+ "\nDigite os valores que irão realizar as operações\n");
		System.out.print("n1: ");
		int n1 = input.nextInt();
		System.out.print("n2: ");
		int n2 = input.nextInt();
		
		System.out.printf("==================MENU=============="
				+ "\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Encerrar Programa\n");
		System.out.print("\nDigite a operação desejada: ");
		int op = input.nextInt();
		if(op == 1) {
			System.out.println("O valor da soma entre " + n1 + " e " + n2 + " é de " + (n1 + n2));
		}
		else if(op == 2) {
			System.out.println("O valor da subtração entre " + n1 + " e " + n2 + " é de " + (n1 - n2));
		}
		else if(op == 3) {
			System.out.println("O valor da multiplicação entre " + n1 + " e " + n2 + " é de " + (n1 * n2));
		}
		else if(op == 4) {
			while(n2 == 0) {
				System.out.println("Por favor, insira um valor válido para o divisor");
				System.out.print("n2: ");
				n2 = input.nextInt();
			}
			
			System.out.println("O valor da divisão entre " + n1 + " e " + n2 + " é de " + (n1 / n2));
		
		}
		else if(op == 5) {
			System.out.println("Saindo....");
			System.out.println("Programa Encerrado.");
		}
		else {
			System.out.println("Opção inválida, Por Favor tente novamente.");
			System.out.print("Digite a operação desejada: ");
			op = input.nextInt();
		}
		
		
		input.close();
		*/
		
		
//		-----------------
		
//		Locale.setDefault(Locale.US);
//		
//		float raio;
//		
//		System.out.print("Digite o valor do raio: ");
//		raio = input.nextFloat();
//		
//		float area = (float) (3.14 * Math.pow(raio, 2));
//		
//		System.out.printf("O valor da área é de: %.4f", area);
		
//		---------------------------------
		
		int A;
		int B;
		int C;
		int D;
		
		System.out.print("A: ");
		A = input.nextInt();
		System.out.print("B: ");
		B = input.nextInt();
		System.out.print("C: ");
		C = input.nextInt();
		System.out.print("D: ");
		D = input.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.println("A diferença entre o produto de A/B e C/D é de: " + diferenca);
		
		
		
		
	}

}
