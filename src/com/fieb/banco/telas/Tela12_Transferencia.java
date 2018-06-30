package com.fieb.banco.telas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.classes.Transfere;
public class Tela12_Transferencia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TIDCONTADE;
	private JTextField TIDCONTAPARA;
	private JTextField TValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente cli=new Cliente();
					Tela12_Transferencia frame = new Tela12_Transferencia(cli);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela12_Transferencia(Cliente c) {
		setTitle("Transferencia entre contas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFieb = new JLabel("");
		lblFieb.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		lblFieb.setBounds(10, 11, 131, 133);
		contentPane.add(lblFieb);
		
		JLabel lblTransferencia = new JLabel("Transferencia");
		lblTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransferencia.setForeground(new Color(153, 0, 102));
		lblTransferencia.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblTransferencia.setBounds(151, 11, 453, 71);
		contentPane.add(lblTransferencia);
		
		JLabel lblFieblogo = new JLabel("");
		lblFieblogo.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		lblFieblogo.setBounds(614, 11, 147, 71);
		contentPane.add(lblFieblogo);
		
		JLabel lblIdconta = new JLabel("Dados conta a ser debitada");
		lblIdconta.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdconta.setForeground(new Color(153, 0, 102));
		lblIdconta.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblIdconta.setBounds(151, 93, 453, 25);
		contentPane.add(lblIdconta);
		
		JLabel lblIdConta = new JLabel("ID Conta");
		lblIdConta.setForeground(new Color(153, 0, 102));
		lblIdConta.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblIdConta.setBounds(151, 129, 125, 25);
		contentPane.add(lblIdConta);
		
		TIDCONTADE = new JTextField();
		TIDCONTADE.setEditable(false);
		TIDCONTADE.setBounds(286, 129, 318, 27);
		TIDCONTADE.setText(""+c.getIdConta());
		contentPane.add(TIDCONTADE);
		TIDCONTADE.setColumns(10);
		
		JLabel lblDadosDaConta = new JLabel("Dados da conta a ser creditada");
		lblDadosDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosDaConta.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblDadosDaConta.setForeground(new Color(153, 0, 102));
		lblDadosDaConta.setBounds(151, 165, 453, 25);
		contentPane.add(lblDadosDaConta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(151, 165, 453, 2);
		contentPane.add(separator);
		
		JLabel lblIdConta_1 = new JLabel("ID Conta");
		lblIdConta_1.setForeground(new Color(153, 0, 102));
		lblIdConta_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblIdConta_1.setBounds(151, 203, 125, 25);
		contentPane.add(lblIdConta_1);
		
		TIDCONTAPARA = new JTextField();
		TIDCONTAPARA.setBounds(286, 201, 318, 27);
		contentPane.add(TIDCONTAPARA);
		TIDCONTAPARA.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(151, 239, 453, 2);
		contentPane.add(separator_1);
		
		JLabel lblValorASer = new JLabel("Valor a ser transferido");
		lblValorASer.setForeground(new Color(153, 0, 102));
		lblValorASer.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblValorASer.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorASer.setBounds(151, 252, 453, 25);
		contentPane.add(lblValorASer);
		
		JLabel lblValorEmR = new JLabel("Valor em R$");
		lblValorEmR.setForeground(new Color(153, 0, 102));
		lblValorEmR.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblValorEmR.setBounds(151, 288, 125, 25);
		contentPane.add(lblValorEmR);
		
		TValor = new JTextField();
		TValor.setBounds(286, 288, 318, 24);
		contentPane.add(TValor);
		TValor.setColumns(10);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela1=new Tela01_Home();
				tela1.setVisible(true);
				dispose();
			}
		});
		sair.setForeground(new Color(153, 0, 102));
		sair.setFont(new Font("Arial Black", Font.BOLD, 18));
		sair.setBounds(481, 341, 123, 37);
		contentPane.add(sair);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela04_Operacoes tela4=new Tela04_Operacoes(c);
				tela4.setVisible(true);
				dispose();
			}
		});
		voltar.setForeground(new Color(153, 0, 102));
		voltar.setFont(new Font("Arial Black", Font.BOLD, 18));
		voltar.setBounds(348, 341, 123, 37);
		contentPane.add(voltar);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				if(!TIDCONTAPARA.equals("")) {
					int idpara=Integer.parseInt(TIDCONTAPARA.getText());
					Cliente clientePara=src.com.fieb.banco.classes.BuscaClientePorIDCONTA.buscar(idpara);
					if(clientePara == null) {
						JOptionPane.showMessageDialog(null, "O cliente digitado não foi encontrado!", "Numero inválido", JOptionPane.ERROR_MESSAGE);
					}else{
						int btn=JOptionPane.showConfirmDialog(null, "O nome do cliente é "+clientePara.getNomeCliente()+"?","Nome outro cliente",JOptionPane.YES_NO_OPTION);
						if(btn==JOptionPane.YES_OPTION) {
							Transfere.transferindo(c, clientePara, Integer.parseInt(TValor.getText()));
						}else {
							JOptionPane.showMessageDialog(null, "Transação cancelada", "Transação cancelada", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "Não foi digitado nenhum numero!", "Numero inválido", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnTransferir.setForeground(new Color(153, 0, 102));
		btnTransferir.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnTransferir.setBounds(151, 341, 187, 37);
		contentPane.add(btnTransferir);
	}
}
