package com.fieb.banco.classes;
import java.sql.*;
public class ConexaoBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://localhost:1433;"  
		+ "databaseName=BancoFMB2;";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, "rodrigo", "123456");
			System.out.println("Conexao com sucesso!");
			
			// pesquisar banco
			String sql = "INSERT INTO banco (nmBanco) VALUES (?);";
			PreparedStatement estado = conn.prepareStatement(sql);
			//estado.setString(1, "2");
			estado.setString(1, "FMB");
			estado.executeUpdate();
			
			estado.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("State: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}catch (Exception e) {
		   System.out.println("Não foi possivel conectar ");
	   }
	}
}