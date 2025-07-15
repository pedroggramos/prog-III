package controlador;

import domino.Autor;
import domino.Livro;

public class Main {

	public static void main(String[] args) {
		Autor autor = new Autor("Machado de Assis");
		
		Livro livro1 = new Livro("Dom Casmurro", autor);
		Livro livro2 = new Livro("Memóras póstumas de Brás Cubas", autor);
		
		LivroController controller = new LivroController();
		
		controller.mostrarLivro(livro1);
		System.out.println();
		controller.mostrarLivro(livro2);

	}

}
