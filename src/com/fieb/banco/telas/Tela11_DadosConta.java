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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;

public class Tela11_DadosConta extends JFrame {
	Cliente cli=new Cliente();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Cliente c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela11_DadosConta frame = new Tela11_DadosConta(c);
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
	public Tela11_DadosConta(Cliente c) {
		Cliente cli=src.com.fieb.banco.classes.BuscaClientePorIDCONTA.buscar(c.getIdConta());
		setTitle("Tela Dados da conta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 775, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados da Conta");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 56, 406, 58);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label_2.setBounds(33, 29, 123, 133);
		contentPane.add(label_2);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnSair_1.setForeground(new Color(153, 0, 102));
		btnSair_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSair_1.setBounds(535, 409, 123, 37);
		contentPane.add(btnSair_1);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela04_Operacoes tela04 = new Tela04_Operacoes(cli);
				tela04.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(new Color(153, 0, 102));
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSair.setBounds(324, 409, 123, 37);
		contentPane.add(btnSair);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(33, 173, 694, 225);
		contentPane.add(textArea);
		textArea.setText("Dados da Conta:\n"
					   + "-------------------------------\n"
					   + "IDConta: "+c.getIdConta()+"\n"
					   + "Nome do cliente: "+c.getNomeCliente()+"\n"
					   + "Senha: Dado confidencial\n"
					   + "IDAgencia: "+c.getIdAgencia()+"\n"
					   + "Saldo: "+c.getSaldo()+"");
		
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label.setBounds(582, 29, 145, 65);
		contentPane.add(label);
	}
}
