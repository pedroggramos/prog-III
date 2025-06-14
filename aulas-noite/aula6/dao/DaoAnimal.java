package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Animal;

public class DaoAnimal {
	
	private static final String URL = "jdbc:mysql://localhost:3316/petshop";
	Animal animal = new Animal();
	
	public void inserir(Animal animal) {
		String sql = "INSERT INTO animal(nome, especie, raca) VALUES('" + animal.getNome() + "', '" + animal.getEspecie() + "', '" + animal.getRaca() + "')";
	
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Animal cadastrado com sucesso!");
			conexao.close();			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Animal consultar(int id) {
		String sql = "SELECT * FROM animal WHERE id = " + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado =  operacao.executeQuery();
			
			if(resultado.first()) {
			
				animal.setNome((String)resultado.getObject(2));
				animal.setEspecie((String)resultado.getObject(3));
				animal.setRaca((String)resultado.getObject(4));
			}
			
			
			System.out.println("Animal consultado com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return animal;
	}
	
	public void alterar(int id, Animal animal) {
		String sql = "UPDATE animal SET nome = '" + animal.getNome() + "', especie = '" + animal.getEspecie() + "', raca = '" + animal.getRaca() + "' WHERE id = " + id; 
	
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Animal alterado com sucesso!");
			conexao.close();			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void excluir(int id) {
		String sql = "DELETE FROM animal WHERE id = " + id;
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Animal excluido com sucesso!");
			conexao.close();			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
}
