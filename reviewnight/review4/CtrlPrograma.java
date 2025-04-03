package reviewnight.review4;

public class CtrlPrograma {
    
    public static void main(String[] args){
        Departamento d1 = new Departamento =("CB", "Contabilidade");
        System.out.println(d1);

        System.out.println("A silgla de d1 é: " + d1.getSigla());
        System.out.println("O nome é de d1 é: " + d1.getNome());

        // Tentamos realizar as alterações, mas não iremos conseguir
		// pois as Strings são inválidas
		// d1.setSigla("123");
		// d1.setNome("");

        // Vamos verificar que as alterações não foram promovidas
		// pois os valores eram inválidos
		// System.out.println("A sigla de d1 é: "  +   d1.getSigla());
		// System.out.println("O nome de d1 é: "   +   d1.getNome());
	}
    }
}
