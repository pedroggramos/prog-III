package controle;

import dao.DaoAnimal;
import dominio.Animal;

public class ControleAnimal {
	Animal animal = new Animal();
	DaoAnimal daoAnimal = new DaoAnimal();

	public void cadastrar(String nome, String especie, String raca) {
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
		
		daoAnimal.inserir(animal);
		
	}
	
	public Animal consultar(int id) {
		animal = daoAnimal.consultar(id);
		
		return animal;
	}
	
	public void alterar(int id, String nome, String especie, String raca) {
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
		
		daoAnimal.alterar(id, animal);
		
	}
	
	public void excluir(int id) {
		daoAnimal.excluir(id);
	}
}
