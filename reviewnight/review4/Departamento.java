package reviewnight.review4;

public class Departamento {
    
    private String sigla;
    private String nome;

    public Departamento(String sigla, String nome){
        super();

        this.setSigla(sigla);
        this.setNome(nome);

    }

    public String getSigla(){
        return this.sigla;
    }

    public void setSigla(String sigla){
        if(this.ValidarSigla(sigla))
            this.sigla = sigla;
    }
}
