package com.fieb.banco.telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.classes.Sacar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Tela06_Saque extends JFrame {
	static Cliente cli=new Cliente();
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
					Tela06_Saque frame = new Tela06_Saque(cli);
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
	public Tela06_Saque(Cliente c) {
		setTitle("Tela Saque");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 873, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(24, 23, 123, 133);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_1.setBounds(673, 23, 145, 65);
		contentPane.add(label_1);
		
		JLabel lblSaque = new JLabel("Saque");
		lblSaque.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaque.setForeground(new Color(153, 0, 102));
		lblSaque.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblSaque.setBounds(289, 23, 258, 58);
		contentPane.add(lblSaque);
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela04_Operacoes tela04 = new Tela04_Operacoes(c);
				tela04.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(153, 0, 102));
		button_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_1.setBounds(562, 422, 123, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Sair");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(new Color(153, 0, 102));
		button_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_2.setBounds(695, 422, 123, 37);
		contentPane.add(button_2);
		
		JButton button = new JButton("1");
		button.setForeground(new Color(153, 0, 102));
		button.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto= texto+"1";
				textField.setText(texto);
			}
		});
		button.setBounds(339, 92, 50, 50);
		contentPane.add(button);
		
		JButton button_3 = new JButton("2");
		button_3.setForeground(new Color(153, 0, 102));
		button_3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto= texto+"2";
				textField.setText(texto);
			}
		});
		button_3.setBounds(399, 92, 50, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setForeground(new Color(153, 0, 102));
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"3";
				textField.setText(texto);
			}
		});
		button_4.setBounds(459, 92, 50, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setForeground(new Color(153, 0, 102));
		button_5.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"4";
				textField.setText(texto);
			}
		});
		button_5.setBounds(339, 153, 50, 50);
		contentPane.add(button_5);
		
		JButton button5 = new JButton("5");
		button5.setForeground(new Color(153, 0, 102));
		button5.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"5";
				textField.setText(texto);
			}
		});
		button5.setBounds(399, 153, 50, 50);
		contentPane.add(button5);
		
		JButton button_6 = new JButton("6");
		button_6.setForeground(new Color(153, 0, 102));
		button_6.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"6";
				textField.setText(texto);
			}
		});
		button_6.setBounds(459, 153, 50, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setForeground(new Color(153, 0, 102));
		button_7.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"7";
				textField.setText(texto);
			}
		});
		button_7.setBounds(339, 214, 50, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setForeground(new Color(153, 0, 102));
		button_8.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"8";
				textField.setText(texto);
			}
		});
		button_8.setBounds(399, 214, 50, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setForeground(new Color(153, 0, 102));
		button_9.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"9";
				textField.setText(texto);
			}
		});
		button_9.setBounds(459, 214, 50, 50);
		contentPane.add(button_9);
		
		JButton btnX = new JButton("Limpar");
		btnX.setForeground(new Color(153, 0, 102));
		btnX.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnX.setBounds(339, 275, 110, 50);
		contentPane.add(btnX);
		
		JButton button_10 = new JButton("0");
		button_10.setForeground(new Color(153, 0, 102));
		button_10.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto= texto+"0";
				textField.setText(texto);
			}
		});
		button_10.setBounds(459, 275, 50, 50);
		contentPane.add(button_10);
		
		JButton btnV = new JButton("Sacar");
		btnV.setForeground(new Color(153, 0, 102));
		btnV.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String saque=Sacar.Saque(Integer.parseInt(textField.getText()), c);
				JOptionPane.showMessageDialog(null, saque, "Sacando - Mensagem", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnV.setBounds(424, 422, 123, 37);
		contentPane.add(btnV);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(339, 336, 170, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValorASacar = new JLabel("Valor a sacar");
		lblValorASacar.setForeground(new Color(153, 0, 102));
		lblValorASacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorASacar.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblValorASacar.setBounds(24, 336, 305, 50);
		contentPane.add(lblValorASacar);
	}
}
