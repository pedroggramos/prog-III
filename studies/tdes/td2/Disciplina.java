package studies.tdes.td2;

public class Disciplina {
    private String codigo;
    private String nome;
    private int numCreditos;

    public Disciplina(String codigo, String nome, int numCreditos){
        setCodigo(codigo);
        setNome(nome);
        setNumCreditos(numCreditos);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo != null && codigo.matches("[a-zA-Z0-9]{7}")){
            this.codigo = codigo;
        }
        else{
            System.out.println("Código Inválido! Deve ser exatamente 7 caracteres alfanuméricos.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome.matches("[a-zA-Z0-9 ]{1,40}")){
            this.nome = nome;
        }
        else{
            System.out.println("Nome Inválido! Deve ter até 40 caracteres alfanuméricos e espaços.");
        }
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        if(numCreditos > 0 && numCreditos <= 8){
            this.numCreditos = numCreditos;
        }
        else{
            System.out.println("Número de créditos inválido! Deve ser entre 1 e 8.");
        }
    }
}