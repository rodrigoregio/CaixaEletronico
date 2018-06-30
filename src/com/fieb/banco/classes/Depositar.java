package com.fieb.banco.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.Objetos.Operacoes;

public class Depositar {
	public static String Deposite(int valor,Cliente c) {
		String connectionUrl="jdbc:sqlserver://localhost:1433;"  
				+ "databaseName=BancoFMB;";
		try {
			//Realiza Conexão
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
			
			//Buscando a operação
			Operacoes o=new Operacoes();
			o.setIdConta(c.getIdConta());
			o.setIdAgencia(c.getIdAgencia());
			String sql="select * from dbo.Operacoes where DescOp like 'Depósito';";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				o.setIdOperacao(rs.getInt("IDOperacao"));
				o.setDescOperacao(rs.getString("DescOp"));
			}
			rs.close();
			st.close();
			
			//Gravando Transação
			Calendar cal=Calendar.getInstance();
			DateFormat data=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataTime=data.format(cal.getTime());
			String sql2="insert into dbo.Transacoes (IDConta,VMv,DtHr,IDAgencia,IDOperacao) values (?,?,?,?,?);";
			PreparedStatement pst2=conn.prepareStatement(sql2);
			pst2.setString(1, o.getIdConta()+"");
			pst2.setString(2, valor+"");
			pst2.setString(3, dataTime);
			pst2.setString(4, o.getIdAgencia()+"");
			pst2.setString(5, o.getIdOperacao()+"");
			pst2.executeUpdate();
			pst2.close();
		
			//Atualizando saldo do cliente
			Statement st2=conn.createStatement();
			String sql3="update dbo.Clientes set Saldo="+(c.getSaldo()+valor)+" where IDConta = "+c.getIdConta()+";";
			int updateCont=st2.executeUpdate(sql3);
			if(updateCont == 1) {
				JOptionPane.showMessageDialog(null, "Saldo atualizado com sucesso", "Saldo atualizado", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Saldo não atualizado", "Saldo não atualizado", JOptionPane.ERROR_MESSAGE);
			}	
			st2.close();
			conn.close();
			return "Depósito realizado com sucesso!";
		}catch(Exception e) {
			e.printStackTrace();
			return "Deposito não realizado!";
		}
	}
}