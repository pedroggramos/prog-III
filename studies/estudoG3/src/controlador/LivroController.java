package controlador;

import domino.Livro;

public class LivroController {
	
	public void mostrarLivro(Livro livro) {
		System.out.println("Livro: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor().getNome());
	}

}
