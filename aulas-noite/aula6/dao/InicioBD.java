package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InicioBD {
	private static final String URL1 = "jdbc:mysql://localhost:3316";
	private static final String URL2 = "jdbc:mysql://localhost:3316/petshop";
	
	public InicioBD() {
		String sql1 = "CREATE DATABASE petshop";
		String sql2 = "CREATE TABLE animal(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), especie VARCHAR(20), raca VARCHAR(20))";
		
		try {
			Connection conexao = DriverManager.getConnection(URL1, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql1);
			operacao.execute();
			conexao.close();
			
			conexao = DriverManager.getConnection(URL2, "root", "");
			operacao = conexao.prepareStatement(sql2);
			operacao.execute();
			conexao.close();
			
			System.out.println("BD e tabela criada com sucesso!");			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}