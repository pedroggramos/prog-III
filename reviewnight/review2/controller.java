package reviewnight.review2;

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

        int soma = 0;
        for(int i = 0; i < 9;i++){
            soma += numeros[i] * (10 - i);
        }

        int primeiroDigito = 11 - (soma % 11);
        if(primeiroDigito >= 10){
            primeiroDigito = 0;
        }
        
        
    }
}
