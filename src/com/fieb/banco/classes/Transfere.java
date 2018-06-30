package com.fieb.banco.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.Objetos.Operacoes;

public class Transfere {
	public static void transferindo(Cliente de, Cliente para, int valor) {
		if(de.getSaldo() >= valor){
			try {
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"  
						+ "databaseName=BancoFMB;";
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
				
				//Buscando operações de transferencias
				ArrayList <Operacoes> ops=new ArrayList<Operacoes>();
				String inst="SELECT * from Operacoes where DescOp like 'Transferencia%';";
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(inst);
				Operacoes o=null;
				while(rs.next()) {
					o=new Operacoes();
					o.setIdOperacao(rs.getInt("IDOperacao"));
					o.setDescOperacao(rs.getString("DescOp"));
					JOptionPane.showMessageDialog(null, o.getIdOperacao()+" e "+o.getDescOperacao(), "Operacoes", JOptionPane.INFORMATION_MESSAGE);
				}
				rs.close();
				st.close();
				
				//Gravando transação do cliente DE
				Calendar cal=Calendar.getInstance();
				DateFormat data=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dataTime=data.format(cal.getTime());
				//Pegando o id para transferencia negativa (ou seja irá tirar do cliente De)
				int idmenos = 0;
				for(int i=0;i<ops.size();i++) {
					Operacoes o2=ops.get(i);
					if(o2.getDescOperacao().equals("Transferencia -")) {
						idmenos=o2.getIdOperacao();
						JOptionPane.showMessageDialog(null, o2.getIdOperacao()+" e "+o2.getDescOperacao(), "Operacoes", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				String sql2="insert into dbo.Transacoes (IDConta,VMv,DtHr,IDAgencia,IDOperacao) values (?,?,?,?,?);";
				PreparedStatement pst2=conn.prepareStatement(sql2);
				pst2.setString(1, de.getIdConta()+"");
				pst2.setString(2, valor+"");
				pst2.setString(3, dataTime);
				pst2.setString(4, de.getIdAgencia()+"");
				pst2.setString(5, idmenos+"");
				pst2.executeUpdate();
				pst2.close();
				
				//Atualizando saldo cliente DE
				Statement st2=conn.createStatement();
				String sql="update dbo.Clientes set Saldo="+(de.getSaldo()-valor)+" where IDConta = "+de.getIdConta()+";";
				int updateCont=st2.executeUpdate(sql);
				if(updateCont == 1) {
					JOptionPane.showMessageDialog(null, "Saldo atualizado com sucesso", "Saldo atualizado", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Saldo não atualizado", "Saldo não atualizado", JOptionPane.ERROR_MESSAGE);
				}	
				st2.close();
				
				//************************************************************************************************************************************
				//para=BuscaClientePorIDCONTA.buscar(para.getIdConta());
				Calendar cal50=Calendar.getInstance();
				DateFormat data50=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dataTime50=data50.format(cal50.getTime());
				//Pegando o id para transferencia negativa (ou seja irá tirar do cliente Para)
				int idmais = 0;
				for(int i=0;i<ops.size();i++) {
					Operacoes oBusca5=ops.get(i);
					if(oBusca5.getDescOperacao() == "Transferencia +") {
						idmais=oBusca5.getIdOperacao();
					}
				}
				String sql20="insert into dbo.Transacoes (IDConta,VMv,DtHr,IDAgencia,IDOperacao) values (?,?,?,?,?);";
				PreparedStatement pst20=conn.prepareStatement(sql20);
				pst20.setString(1, para.getIdConta()+"");
				pst20.setString(2, valor+"");
				pst20.setString(3, dataTime50);
				pst20.setString(4, para.getIdAgencia()+"");
				pst20.setString(5, idmais+"");
				pst20.executeUpdate();
				pst20.close();
				
				//Atualizando saldo cliente Para
				Statement st22=conn.createStatement();
				String sql22="update dbo.Clientes set Saldo="+(de.getSaldo()+valor)+" where IDConta = "+para.getIdConta()+";";
				int updateCont22=st22.executeUpdate(sql22);
				if(updateCont22 == 1) {
					JOptionPane.showMessageDialog(null, "Saldo atualizado com sucesso", "Saldo atualizado", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Saldo não atualizado", "Saldo não atualizado", JOptionPane.ERROR_MESSAGE);
				}	
				st22.close();
				
			}catch(Exception e) {
				e.getStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(null,"Saldo menor que o valor a transferir!\nRealize algum depósito para transferir!","Saldo insuficiente",JOptionPane.ERROR_MESSAGE);
		}
	}
}