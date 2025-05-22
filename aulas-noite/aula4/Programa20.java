package controle;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();
		
//		variavel.lenght() - metodo - calcula a quantidade de caracteres de uma string. lenght - função - usado no array.

		int qtd = palavra.length();
		System.out.println("A qtd de caracteres é " + qtd);
//		System.out.println("A qtd de caracteres é " + palavra.length());
		
		
//		variavel.charAt() - retorna o caractere da posição informarda

		
//		char pri = palavra.charAt(0);
//		System.out.println("A primeira letra é " + pri);
//		
//		char tri = palavra.charAt(2);
//		System.out.println("A primeira letra é " + tri);
//		
//		char ult = palavra.charAt(palavra.length() - 1);
//		System.out.println("A ultima letra é: " + ult);
		
		
//		variavel.indexOf('carcatere') - retorna o numero da primeria posição que o caractere informado é encontrado / para retornar a ultima posição de um caractere informado, utiliza-se variavel.lastIndexOf()
//		quando o carctere não é encontrado, retorna -1.
		
		
//		System.out.println("A primeira posição que aparece a letra A é: " + palavra.indexOf('a'));
		
//		int pos1 = palavra.indexOf('a');
//		int pos = pos1 + 1;
//		System.out.println("Primeira ocorrência de 'a': " + pos);
////		
//		int ultimapos = palavra.lastIndexOf('a');
//		System.out.println("Ultima ocorrência de 'a': " + ultimapos);
		
//		variavel.substring(posInicial, posFinal) - retorna um trecho da string que está entre 2 posições informadas
//			posInicial - inclusive/ posFinal - exclusive
		
//		System.out.println("o Trecho entre a posição 4 e 8 é: " + palavra.substring(4,8));
		
//		int posInicial = 4;
//		int posFinal = 8;
//		
//		String trecho = palavra.substring(4,8);
//		String trecho2 = palavra.substring(posInicial, posFinal);
//		System.out.println("o Trecho entre a posição 4 e 8 é: " + trecho);
//		System.out.println("O trecho entre 4 e 8 é: " + trecho2);
//		System.out.println("O trecho entre 4 e 8 é: " + palavra.substring(posInicial, posFinal));
//		String trecho3 = palavra.substring(pos1, ultimapos);
//		System.out.println("O trecho entre 4 e 8 é: " + trecho3);
		
//		variavel.toUpperCase() - Converte a string para letra maiúscula
//		variavel.toLowerCase() - Converte a string para letra minuscula
		
		System.out.println("Em letra maiúscula: " + palavra.toUpperCase());
		System.out.println("Em letra minúscula: " + palavra.toLowerCase());
		
//		vriavel.compareTo() - compara duas strings e retorna os seguintes resultados: 0(zero) = exatamente iguais / Numero negativo = quando a primeira string for menor que a segunda / Numero positivo = quando a string for maior que a segunda
		
		System.out.println("Comparação: " + palavra.compareTo("banana"));
		
		
		
	}

}
