package src.com.fieb.banco.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.fieb.banco.Objetos.*;

public class BuscaClientePorIDCONTA {
	public static void main(String[] args) {

	}
	public static Cliente buscar(int id) {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;"  
				+ "databaseName=BancoFMB;";
		try {
			//Realiza Conexão
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
			//System.out.println("Conexao com sucesso!");
			
			String sql="select * from dbo.Clientes where idConta = "+id+";";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			Cliente cliente=null;
			while(rs.next()) {
				cliente=new Cliente();
				cliente.setIdConta(rs.getInt("IDConta"));
				cliente.setNomeCliente(rs.getString("NmCliente"));
				cliente.setSenha(rs.getString("Senha"));
				cliente.setIdAgencia(rs.getInt("IDAgencia"));
				cliente.setSaldo(Double.parseDouble(rs.getString("Saldo")));
			}
			rs.close();
			st.close();
			conn.close();
			return cliente;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
