public class CtrlPrograma {
    public static void main(String[] args) {
        try {
            Disciplina disciplina = new Disciplina("");
            System.out.println("Disciplina criada: " + disciplina.getNome());
        } catch (ModelException e) {
            System.out.println("Erro ao criar disciplina: " + e.getMessage());
        }

        try {
            Curso curso = new Curso(null);
            System.out.println("Curso criado: " + curso.getNome());
        } catch (ModelException e) {
            System.out.println("Erro ao criar curso: " + e.getMessage());
        }
    }
}
