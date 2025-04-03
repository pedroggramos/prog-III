package reviewnight.review3;

// import model.Pessoa;

public class CrtlProgram {
    

    public static void main(String[] args){

        Pessoa p1 = new Pessoa("123.456.789-09", "José da Silva", 23);

        System.out.println("p1 está apontando para um objeto Pessoa cujo cpf é: " + p1.getCpf() + 
                   ", o nome é " + p1.getNome() + 
                   " e sua idade é " + p1.getIdade());

        Pessoa p2 = new Pessoa("178.643.757-07", "Pedro Gabriel Guimrães Ramos", 20);

        System.out.println("p2 está apontando pra pessoa cujo o cpf é: " + p2.getCpf() +
                            ", o nome é " + p2.getNome() +
                            "e sua idade é " + p2.getIdade());
        


    }
}
