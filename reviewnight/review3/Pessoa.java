package reviewnight.review3;

public class Pessoa {
    
    // Atributos

    private String cpf;
    private String nome;
    private int     idade;

    public Pessoa(String c, String n, int i){
        super();

        this.cpf = c;
        this.nome = n;
        this.idade = i;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

}
