package model;


public class Departamento{

    // Atributos 

    private String sigla;
    private String nome;


    // Métodos

    public Departamento(String s, String n){
        super();
        this.s = sigla;
        this.n = nome;
    }


    public String getSigla() {
        return sigla;
    }


    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

}

public boolean validarSigla(String sigla){
    if(sigla == null || sigla.length()) == 0)
        return false;
    for(int i = 0; i < sigla.length(); i++){
        char c = sigla.charAt(i);
        if( ! Character.isAlphabetic(c))
            return false;
    }
    return true;
}