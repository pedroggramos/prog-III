package condicionais;

public class Aula {

	public static void main(String[] args) {
		
		int x = 24;
		
		if(x < 12) {
			System.out.println("Bom dia");
		}
		
		else if(x >= 13 && x < 18) {
			System.out.println("Boa Tarde");
		}
		
		else if(x >= 19 && x <= 23) {
			System.out.println("Boa Noite!");
		}
		
		else {
			System.out.println("Inválido");
		}
	
	}
}
