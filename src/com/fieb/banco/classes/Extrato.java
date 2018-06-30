package com.fieb.banco.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fieb.banco.Objetos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Extrato {
	public static String extrair(Cliente c) {
		String connectionUrl="jdbc:sqlserver://localhost:1433;"  
				+ "databaseName=BancoFMB;";
		try {
			//Realiza Conexão
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
			//System.out.println("Conexao com sucesso!");
			
			//Buscando Operações no banco de dados
			ArrayList <Operacoes> lista=new ArrayList<Operacoes>();
			
			String sql="select IDOperacao,DescOp from dbo.Operacoes;";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				Operacoes o=new Operacoes();
				o.setIdOperacao(rs.getInt("IDOperacao"));
				o.setDescOperacao(rs.getString("DescOp"));
				lista.add(o);
			}
			rs.close();
			st.close();
			
			//Buscando Transações
			ArrayList <Transacao> listT=new ArrayList<Transacao>();
			ArrayList <String> listaData=new ArrayList<String>();
			//ArrayList <String> listaHora=new ArrayList<String>();
			
			String sql2="select IDTransacao,IDConta,VMv,DtHr,IDAgencia,IDOperacao from dbo.Transacoes where IDConta = "+c.getIdConta()+" order by IDTransacao desc;";
			Statement stt=conn.createStatement();
			ResultSet rs2=stt.executeQuery(sql2);
			while(rs2.next()) {
				Transacao t=new Transacao();
				t.setIdTransaca(rs2.getInt("IDTransacao"));
				t.setIdConta(rs2.getInt("IDConta"));
				t.setValorMovi(rs2.getInt("VMv"));
				DateFormat formato=new SimpleDateFormat("dd/MM/yyyy HH:mm");
				String dataformatada=formato.format(rs2.getTimestamp("DtHr"));
				listaData.add(dataformatada);
				/*DateFormat formato2=new SimpleDateFormat("HH:mm");
				String horaformatada=formato2.format(rs2.getDate("DtHr"));
				listaHora.add(horaformatada);*/
				t.setIdAgencia(rs2.getInt("IDAgencia"));
				t.setIdOperacao(rs2.getInt("IDOperacao"));
				listT.add(t);
			}
			rs2.close();
			stt.close();
			conn.close();
			
			String textao="IDTransacao | IDConta | Valor Movimento | Data e Hora | IDAgencia | Operacao realizada\n";
			for(int i=0;i<listT.size();i++) {
				Transacao tr =listT.get(i);
				textao=textao
						+""+tr.getIdTransacao()+" | "+tr.getIdConta()+" | "+tr.getValorMovi()+" | "+listaData.get(i)/*+" "+listaHora.get(i)*/+" | "+tr.getIdAgencia()+" | ";
				if(tr.getIdOperacao() == 1) {
					textao=textao+"Saque ATM \n";
				}else if(tr.getIdOperacao() == 2) {
					textao=textao+"Deposito ATM \n";
				}
			}
			return textao;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar extrato!\n "+e.getMessage(), "Erro ao gerar extrato", JOptionPane.ERROR_MESSAGE);
			return "Extrato não obtido\n"+e.getStackTrace();
		}
	}
}
