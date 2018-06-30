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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;

public class Tela07_Saldo extends JFrame {
	Cliente cli=new Cliente();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOlaSraSeu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Cliente c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela07_Saldo frame = new Tela07_Saldo(c);
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
	public Tela07_Saldo(Cliente c) {
		Cliente cli=src.com.fieb.banco.classes.BuscaClientePorIDCONTA.buscar(c.getIdConta());
		setTitle("Tela Saldo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 775, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Saldo");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(353, 86, 258, 58);
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
		
		txtOlaSraSeu = new JTextField();
		txtOlaSraSeu.setEditable(false);
		txtOlaSraSeu.setBounds(33, 173, 694, 20);
		contentPane.add(txtOlaSraSeu);
		txtOlaSraSeu.setText("Ola Sr(a). "+cli.getNomeCliente()+" seu saldo e R$"+cli.getSaldo());
		txtOlaSraSeu.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label.setBounds(582, 29, 145, 65);
		contentPane.add(label);
	}
}
