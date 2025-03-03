package studies.tdes.td2;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;

    public Curso(int codigo, String nome, int cargaHoraria){
        setCodigo(codigo);
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0 && codigo < 100) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido! Deve ser entre 1 e 99.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome.length() <= 25){
            this.nome = nome;
        }
        else{
            System.out.println("Nome Inválido! Deve ser até 25 caracteres.");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria >= 2000 && cargaHoraria < 8000){
            this.cargaHoraria = cargaHoraria;
        }
        else{
            System.out.println("Carga horária inválida! Deve ser entre 2000 e 7999.");
        }
    }
}
