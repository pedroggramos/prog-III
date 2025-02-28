package controller;

import model.Departamento;

public class CtrlPrograma {

	public static void main(String[] args) {
		// Declaração da variável 'd1' (ponteiro para Departamento)
		// e Instanciação de um Objeto Departamento 
		Departamento d1 = new Departamento("CB","Contabilidade");
		System.out.println(d1);
		
		// Enviamos a mensagem 'getSigla()' para o objeto apontado por d1
		System.out.println("A sigla de d1 é: "  +   d1.getSigla());
		// Enviamos a mensagem 'getNome()' para o objeto apontado por d1
		System.out.println("O nome de d1 é: "   +   d1.getNome());
				
		// Tentamos realizar as alterações, mas não iremos conseguir
		// pois as Strings são inválidas
		d1.setSigla("123");
		d1.setNome("");
		
		// Vamos verificar que as alterações não foram promovidas
		// pois os valores eram inválidos
		System.out.println("A sigla de d1 é: "  +   d1.getSigla());
		System.out.println("O nome de d1 é: "   +   d1.getNome());
	}

}