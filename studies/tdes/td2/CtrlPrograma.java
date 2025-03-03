package studies.tdes.td2;

import studies.tdes.td2.Disciplina;
import studies.tdes.td2.Curso;

public class CtrlPrograma {
    public static void main(String[] args){
        Curso curso1 = new Curso(10, "Engenharia", 3000);
        Curso curso2 = new Curso(50, "Matemática", 4000); 

        Disciplina disciplina1 = new Disciplina("ABC1234", "Cálculo I", 4);
        Disciplina disciplina2 = new Disciplina("XYZ1234", "Física", 5);

        System.out.println("Curso 1: " + curso1.getNome() + "- Código " + curso1.getCodigo());
        System.out.println("Curso 2: " + curso2.getNome() + "- Código " + curso2.getCodigo());
        System.out.println("Disciplina 1: " + disciplina1.getNome() + "- Código " + disciplina1.getCodigo());
        System.out.println("Disciplina 2: " + disciplina2.getNome() + "- Código " + disciplina2.getCodigo());
    }
}