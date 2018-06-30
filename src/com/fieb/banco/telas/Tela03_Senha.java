package com.fieb.banco.telas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.fieb.banco.Objetos.Cliente;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import src.com.fieb.banco.classes.BuscaClientePorIDCONTA;
public class Tela03_Senha extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente cli=new Cliente();
					Tela03_Senha frame = new Tela03_Senha(cli);
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
	public Tela03_Senha(Cliente c) {
		Cliente cli=BuscaClientePorIDCONTA.buscar(c.getIdConta());
		setTitle("Tela Senha");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 872, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 102));
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(12, 13, 842, 445);
		contentPane.add(panel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(12, 4, 123, 133);
		panel.add(label);
		
		JLabel lblSenhaPrime = new JLabel("Senha Prime");
		lblSenhaPrime.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaPrime.setForeground(new Color(153, 0, 102));
		lblSenhaPrime.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSenhaPrime.setBounds(209, 106, 182, 31);
		panel.add(lblSenhaPrime);
		
		JLabel lblEntreComA = new JLabel("Entre com a sua SENHA!");
		lblEntreComA.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntreComA.setForeground(new Color(153, 0, 102));
		lblEntreComA.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblEntreComA.setBounds(158, 39, 477, 35);
		panel.add(lblEntreComA);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"1";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button.setForeground(new Color(153, 0, 102));
		button.setFont(new Font("Arial Black", Font.BOLD, 20));
		button.setBounds(413, 180, 56, 35);
		panel.add(button);
		
		
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"2";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_2.setForeground(new Color(153, 0, 102));
		button_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_2.setBounds(481, 180, 56, 35);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"3";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_3.setForeground(new Color(153, 0, 102));
		button_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_3.setBounds(549, 180, 56, 35);
		panel.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"4";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_4.setForeground(new Color(153, 0, 102));
		button_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_4.setBounds(413, 228, 56, 35);
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"5";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_5.setForeground(new Color(153, 0, 102));
		button_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_5.setBounds(481, 228, 56, 35);
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"6";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_6.setForeground(new Color(153, 0, 102));
		button_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_6.setBounds(549, 228, 56, 35);
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"7";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_7.setForeground(new Color(153, 0, 102));
		button_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_7.setBounds(413, 275, 56, 35);
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"8";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_8.setForeground(new Color(153, 0, 102));
		button_8.setFont(new Font("Arial Black", Font.BOLD, 16));
		button_8.setBounds(481, 275, 56, 35);
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"9";
				passwordField.setText(texto);
				//textField.setText(texto);
			}
		});
		button_9.setForeground(new Color(153, 0, 102));
		button_9.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_9.setBounds(549, 275, 56, 35);
		panel.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String texto=passwordField.getText();
				texto=texto+"0";
				passwordField.setText(texto);
				//textField.setText();
			}
		});
		button_10.setForeground(new Color(153, 0, 102));
		button_10.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_10.setBounds(413, 325, 56, 35);
		panel.add(button_10);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(413, 106, 191, 31);
		panel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\Cadeado.jpg"));
		lblNewLabel.setBounds(250, 197, 100, 100);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial Black", Font.BOLD, 25));
		textField.setForeground(new Color(153, 0, 102));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(209, 4, 370, 35);
		textField.setText(""+c.getIdConta());
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(new Color(153, 0, 102));
		btnCancelar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnCancelar.setBounds(674, 374, 145, 35);
		panel.add(btnCancelar);
		
		JButton btnCorrigir = new JButton("Limpar");
		btnCorrigir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				//textField.setText("");
			}
		});
		btnCorrigir.setForeground(new Color(153, 0, 102));
		btnCorrigir.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnCorrigir.setBounds(482, 325, 123, 35);
		panel.add(btnCorrigir);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_1.setBounds(674, 9, 145, 65);
		panel.add(label_1);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(cli.getSenha().equals(passwordField.getText())) {
					Tela04_Operacoes op=new Tela04_Operacoes(cli);
					op.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Dados senha invalida", "Senha digitada invalida", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEntrar.setForeground(new Color(153, 0, 102));
		btnEntrar.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnEntrar.setBounds(413, 373, 192, 37);
		panel.add(btnEntrar);
	}
	
}
