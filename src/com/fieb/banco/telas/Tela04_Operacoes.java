package com.fieb.banco.telas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Tela04_Operacoes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente c=new Cliente();
					Tela04_Operacoes frame = new Tela04_Operacoes(c);
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
	public Tela04_Operacoes(Cliente c) {
		setTitle("Tela Opera\u00E7\u00F5es do Caixa Eletr\u00F4nico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 869, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Seja Bem Vindo!");
		lblBemVindo.setForeground(new Color(153, 0, 102));
		lblBemVindo.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setBounds(171, 31, 499, 70);
		contentPane.add(lblBemVindo);
		
		textField = new JTextField(c.getNomeCliente());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEnabled(false);
		textField.setForeground(new Color(153, 0, 102));
		textField.setFont(new Font("Arial Black", Font.BOLD, 25));
		textField.setBounds(181, 96, 467, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSaldo = new JButton("SALDO");
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela07_Saldo tela07 = new Tela07_Saldo(c);
				tela07.setVisible(true);
				dispose();
			}
		});
		btnSaldo.setForeground(new Color(153, 0, 102));
		btnSaldo.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnSaldo.setBackground(UIManager.getColor("Button.background"));
		btnSaldo.setBounds(42, 202, 210, 79);
		contentPane.add(btnSaldo);
		
		JButton btnSaque = new JButton("SAQUE");
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela06_Saque tela06 = new Tela06_Saque(c);
				tela06.setVisible(true);
				dispose();
			}
		});
		btnSaque.setForeground(new Color(153, 0, 102));
		btnSaque.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnSaque.setBackground(UIManager.getColor("Button.background"));
		btnSaque.setBounds(42, 306, 210, 79);
		contentPane.add(btnSaque);
		
		JButton btnCartao = new JButton("DEPOSITE");
		btnCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela10_DEPOSITO tela10=new Tela10_DEPOSITO(c);
				tela10.setVisible(true);
				dispose();
			}
		});
		btnCartao.setForeground(new Color(153, 0, 102));
		btnCartao.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnCartao.setBackground(UIManager.getColor("Button.background"));
		btnCartao.setBounds(42, 411, 210, 79);
		contentPane.add(btnCartao);
		
		JButton btnExtrato = new JButton("EXTRATO");
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela08_Extrato tela08 = new Tela08_Extrato(c);
				tela08.setVisible(true);
				dispose();
			}
		});
		btnExtrato.setForeground(new Color(153, 0, 102));
		btnExtrato.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnExtrato.setBackground(UIManager.getColor("Button.background"));
		btnExtrato.setBounds(593, 306, 210, 79);
		contentPane.add(btnExtrato);
		
		JButton btnDados = new JButton("DADOS\r\n DA \r\nCONTA");
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela11_DadosConta tela07 = new Tela11_DadosConta(c);
				tela07.setVisible(true);
				dispose();
			}
		});
		btnDados.setForeground(new Color(153, 0, 102));
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnDados.setBackground(UIManager.getColor("Button.background"));
		btnDados.setBounds(593, 413, 210, 79);
		contentPane.add(btnDados);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(new Color(153, 0, 102));
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setBounds(593, 144, 210, 47);
		contentPane.add(btnSair);
		
		JLabel lblPropagandaPoupar = new JLabel("");
		lblPropagandaPoupar.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\poupan\u00E7a-cheia.jpg"));
		lblPropagandaPoupar.setBounds(278, 202, 290, 288);
		contentPane.add(lblPropagandaPoupar);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label_3.setBounds(42, 34, 123, 133);
		contentPane.add(label_3);
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label.setBounds(658, 34, 145, 65);
		contentPane.add(label);
		
		JButton btnTransferencia = new JButton("Transfira");
		btnTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela12_Transferencia janela=new Tela12_Transferencia(c);
				janela.setVisible(true);
				dispose();
			}
		});
		btnTransferencia.setForeground(new Color(153, 0, 102));
		btnTransferencia.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnTransferencia.setBackground(SystemColor.menu);
		btnTransferencia.setBounds(593, 202, 210, 79);
		contentPane.add(btnTransferencia);
	}
}
