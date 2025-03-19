public class Disciplina {
    private String nome;

    public Disciplina(String nome) throws ModelException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ModelException("Nome da disciplina não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
