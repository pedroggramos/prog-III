//package controle;
//
//import java.util.Scanner;
//
//public class Programa18 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		//String[] nomes = new String[5];
//	String[] nomes = {"João", "Mariana", "Gabriel", "Fernanda", "Tainá"};
//	float[] notas = new float[5];
//	
//	System.out.println("CADASTRO DAS NOTAS");
//	for(int i = 0; i < nomes.length; i++) {
//		System.out.println("ALUNO " + (i+1));
//		System.out.println("Nome: " + nomes[i]);
//		System.out.print("Nota: ");
//		notas[i] = input.nextFloat();
//	}
//	
//	System.out.println("ALUNOS APROVADOS");
//	for(int i = 0; i < notas.length; i++) {
//		if(notas[i] >= 6) {
//			System.out.print(nomes[i] + " | ");
//			}
//		}
//	
//	System.out.println("ALUNOS REPROVADOS");
//	for(int i = 0; i < notas.length; i++) {
//		if(notas[i] < 6) {
//			System.out.print(nomes[i] + " | ");
//			}
//		}
//				
//	}
//}
