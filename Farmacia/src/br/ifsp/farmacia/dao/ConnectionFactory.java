package br.ifsp.farmacia.dao;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;

public class ConnectionFactory {
	public static Connection createConnection () {
		
		String stringDeConexao = "jdbc:mysql://localhost:3306/farmacia";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = null ;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 
			conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conexao ;
	}
}
