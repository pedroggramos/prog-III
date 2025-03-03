import java.util.Scanner;

public class controller {
	
	public static boolean cpfCorreto(String cpf) {
		if(cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") == false) {
			return false;
		}

        cpf = cpf.replace(".", "").replace("-", "").replace(" ", "");

        int[] numeros = new int[11];
        for(int i = 0; i < 11; i++){
            numeros[i] = cpf.charAt(i) - '0';
        }

        // Calculo do primeiro digito

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }
        
        // Verificação do primeiro digito
        if (numeros[9] != primeiroDigito) {
            return false;
        }

        //Calculo do segundo digito
        
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }
        
        // Verifica o segundo dígito

        return numeros[10] == segundoDigito;
    }

        public static void main(String[] args){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva seu CPF(999.999.999-99): ");
            String cpf = scanner.nextLine();

            if(cpfCorreto(cpf)){
                System.out.println("CPF válido");
            }

            else{
                System.out.println("CPF inválido!");
            }

            scanner.close();

        }
    }



	



