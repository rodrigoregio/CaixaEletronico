package com.fieb.banco.telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Tela01_Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01_Home frame = new Tela01_Home();
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
	public Tela01_Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tela Home");
		setBackground(new Color(153, 0, 102));
		setBounds(100, 100, 869, 507);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 0, 51));
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOpcoesSemCartao = new JButton("Opções sem Cartão");
		btnOpcoesSemCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela02_Usuario tela02 = new Tela02_Usuario();
				tela02.setVisible(true);
				dispose();
			}
		});
		btnOpcoesSemCartao.setForeground(new Color(153, 0, 102));
		btnOpcoesSemCartao.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnOpcoesSemCartao.setBackground(new Color(255, 255, 255));
		btnOpcoesSemCartao.setBounds(31, 180, 226, 74);
		contentPane.add(btnOpcoesSemCartao);
		
		JButton btnTelUteis = new JButton("Telefones Uteis");
		btnTelUteis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela05_TelUteis tela05 = new Tela05_TelUteis();
				tela05.setVisible(true);
				dispose();
			}
		});
		btnTelUteis.setForeground(new Color(153, 0, 102));
		btnTelUteis.setBackground(new Color(255, 255, 255));
		btnTelUteis.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnTelUteis.setBounds(31, 282, 226, 65);
		contentPane.add(btnTelUteis);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(30, 27, 125, 120);
		contentPane.add(label);
		
		JLabel lblPropaganda01 = new JLabel("New label");
		lblPropaganda01.setBackground(new Color(153, 204, 102));
		lblPropaganda01.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\Antecipe sua Restitui\u00E7\u00E3o.png"));
		lblPropaganda01.setBounds(295, 180, 525, 250);
		contentPane.add(lblPropaganda01);
		
		JLabel lblFiebPrime = new JLabel("FiEB PRIME");
		lblFiebPrime.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiebPrime.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblFiebPrime.setForeground(new Color(153, 0, 102));
		lblFiebPrime.setBounds(271, 27, 281, 39);
		contentPane.add(lblFiebPrime);
		
		JLabel lblOSeuBanco = new JLabel("O SEU BANCO");
		lblOSeuBanco.setHorizontalAlignment(SwingConstants.CENTER);
		lblOSeuBanco.setForeground(new Color(153, 0, 102));
		lblOSeuBanco.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblOSeuBanco.setBounds(167, 53, 508, 39);
		contentPane.add(lblOSeuBanco);
		
		JLabel lblOperacoes = new JLabel("Saque / Saldo / Extrato / Dados da Conta");
		lblOperacoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperacoes.setForeground(new Color(153, 0, 102));
		lblOperacoes.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblOperacoes.setBounds(239, 111, 508, 39);
		contentPane.add(lblOperacoes);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		lblNewLabel_4.setBounds(662, 27, 145, 65);
		contentPane.add(lblNewLabel_4);
		
		JButton btnDadosGrupo = new JButton("Dados do Grupo");
		btnDadosGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela09_DadosGrupo tela09 = new Tela09_DadosGrupo();
				tela09.setVisible(true);
				dispose();
			}
		});
		btnDadosGrupo.setForeground(new Color(153, 0, 102));
		btnDadosGrupo.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnDadosGrupo.setBackground(Color.WHITE);
		btnDadosGrupo.setBounds(31, 365, 226, 65);
		contentPane.add(btnDadosGrupo);
	}
}
