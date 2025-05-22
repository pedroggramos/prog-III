package controle;

import java.util.Scanner;

public class ProgramThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			System.out.print("Digite o valor da posição " + i + ":");
			num[i] = input.nextInt();
		}
		
		
		System.out.print("Números Armazenados: ");
		for(int i = 0;i <=9;i++) {
			System.out.print(num[i] + " - ");
		}
		
	}
}
