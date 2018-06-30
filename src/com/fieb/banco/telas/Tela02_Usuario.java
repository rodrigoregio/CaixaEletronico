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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;

public class Tela02_Usuario extends JFrame {

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
					Tela02_Usuario frame = new Tela02_Usuario();
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
	public Tela02_Usuario() {
		setTitle("Tela Identifica\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		lblNewLabel.setBounds(12, 24, 123, 133);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 11));
		textField.setEnabled(false);
		textField.setBackground(Color.WHITE);
		textField.setBounds(413, 102, 204, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente Prime");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setBounds(209, 106, 182, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Entre com a sua Identifica\u00E7\u00E3o!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(153, 0, 102));
		lblNewLabel_2.setBounds(162, 24, 477, 35);
		contentPane.add(lblNewLabel_2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto=texto+"1";
				textField.setText(texto);
			}
		});
		btn1.setForeground(new Color(153, 0, 102));
		btn1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn1.setBounds(413, 180, 56, 35);
		contentPane.add(btn1);
		
		JButton btnSenha = new JButton("Limpar");
		btnSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnSenha.setForeground(new Color(153, 0, 102));
		btnSenha.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSenha.setBounds(482, 329, 123, 34);
		contentPane.add(btnSenha);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto=texto+"2";
				textField.setText(texto);
			}
		});
		btn2.setForeground(new Color(153, 0, 102));
		btn2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn2.setBounds(481, 180, 56, 35);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"3";
				textField.setText(texto);
			}
		});
		btn3.setForeground(new Color(153, 0, 102));
		btn3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn3.setBounds(549, 180, 56, 35);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"4";
				textField.setText(texto);
			}
		});
		btn4.setForeground(new Color(153, 0, 102));
		btn4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn4.setBounds(413, 228, 56, 35);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"5";
				textField.setText(texto);
			}
		});
		btn5.setForeground(new Color(153, 0, 102));
		btn5.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn5.setBounds(481, 228, 56, 35);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"6";
				textField.setText(texto);
			}
		});
		btn6.setForeground(new Color(153, 0, 102));
		btn6.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn6.setBounds(549, 228, 56, 35);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"7";
				textField.setText(texto);
			}
		});
		btn7.setForeground(new Color(153, 0, 102));
		btn7.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn7.setBounds(413, 275, 56, 35);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"8";
				textField.setText(texto);
			}
		});
		btn8.setForeground(new Color(153, 0, 102));
		btn8.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn8.setBounds(481, 275, 56, 35);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"9";
				textField.setText(texto);
			}
		});
		btn9.setForeground(new Color(153, 0, 102));
		btn9.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn9.setBounds(549, 275, 56, 35);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"0";
				textField.setText(texto);
			}
		});
		btn0.setForeground(new Color(153, 0, 102));
		btn0.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn0.setBounds(413, 328, 56, 35);
		contentPane.add(btn0);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(new Color(153, 0, 102));
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnVoltar.setBounds(689, 376, 124, 34);
		contentPane.add(btnVoltar);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_2.setBounds(667, 24, 146, 65);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\Cadeado.jpg"));
		label.setBounds(250, 207, 100, 100);
		contentPane.add(label);
		
		JButton button = new JButton("Entrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				int digitado=Integer.parseInt(texto);
				//BuscaClientePorIDCONTA buscar=new BuscaClientePorIDCONTA();
				
				Cliente cli=src.com.fieb.banco.classes.BuscaClientePorIDCONTA.buscar(digitado);
				if(cli != null) {
					Tela03_Senha senha=new Tela03_Senha(cli);
					senha.setVisible(true);
					dispose();
					JOptionPane.showMessageDialog(null, "Nome="+cli.getNomeCliente()+"\nSenha: "+cli.getSenha(), "Dados do cliente", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setForeground(new Color(153, 0, 102));
		button.setFont(new Font("Arial Black", Font.BOLD, 20));
		button.setBounds(413, 376, 192, 34);
		contentPane.add(button);
	}
}
