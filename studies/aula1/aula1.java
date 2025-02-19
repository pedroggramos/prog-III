package controller;

import java.util.Scanner;

public class CtrlPrograma {
	
	public static int contaVogais(String texto) {
		int contador = 0;
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				contador++;
		}
		return contador;		
	}
	
	public static boolean ehPar(int numero) {
		if(numero % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com um texto: ");
		String frase = teclado.nextLine();
		System.out.println("O texto possui " + contaVogais(frase) + " vogais!");

		System.out.print("Entre com um valor: ");
		int valor = teclado.nextInt();
		if(ehPar(valor))
			System.out.println(valor + " é um número par");
		else
			System.out.println(valor + " é um número ímpar");
		
	}

}
