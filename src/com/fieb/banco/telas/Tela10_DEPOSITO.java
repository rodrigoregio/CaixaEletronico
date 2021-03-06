package com.fieb.banco.telas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.classes.Depositar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Tela10_DEPOSITO extends JFrame {

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
					Tela10_DEPOSITO frame = new Tela10_DEPOSITO(c);
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
	public Tela10_DEPOSITO(Cliente cli) {
		setTitle("Tela Valor do Deposito");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(12, 13, 123, 133);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_1.setBounds(681, 13, 145, 65);
		contentPane.add(label_1);
		
		JLabel lblValorDoSaque = new JLabel("Valor do Dep\u00F3sito");
		lblValorDoSaque.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDoSaque.setForeground(new Color(153, 0, 102));
		lblValorDoSaque.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblValorDoSaque.setBounds(145, 13, 526, 58);
		contentPane.add(lblValorDoSaque);
		
		JButton button_6 = new JButton("Voltar");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela04_Operacoes tela04 = new Tela04_Operacoes(cli);
				tela04.setVisible(true);
				dispose();
			}
		});
		button_6.setForeground(new Color(153, 0, 102));
		button_6.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_6.setBounds(438, 391, 123, 37);
		contentPane.add(button_6);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(new Color(153, 0, 102));
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSair.setBounds(571, 391, 123, 37);
		contentPane.add(btnSair);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(161, 342, 535, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRealizarSaque = new JButton("Realizar Deposito");
		btnRealizarSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String deposito=Depositar.Deposite(Integer.parseInt(textField.getText()), cli);
				JOptionPane.showMessageDialog(null, deposito, "Sacando - Mensagem", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRealizarSaque.setForeground(new Color(153, 0, 102));
		btnRealizarSaque.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnRealizarSaque.setBounds(161, 391, 267, 37);
		contentPane.add(btnRealizarSaque);
		
		JButton button = new JButton("1");
		button.setForeground(new Color(153, 0, 102));
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"1";
				textField.setText(texto);
			}
		});
		button.setBounds(324, 96, 50, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_1.setForeground(new Color(153, 0, 102));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"2";
				textField.setText(texto);
			}
		});
		button_1.setBounds(384, 96, 50, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setForeground(new Color(153, 0, 102));
		button_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"3";
				textField.setText(texto);
			}
		});
		button_2.setBounds(444, 96, 50, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setForeground(new Color(153, 0, 102));
		button_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"4";
				textField.setText(texto);
			}
		});
		button_3.setBounds(324, 155, 50, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		button_4.setForeground(new Color(153, 0, 102));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"5";
				textField.setText(texto);
			}
		});
		button_4.setBounds(384, 157, 50, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setForeground(new Color(153, 0, 102));
		button_5.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"6";
				textField.setText(texto);
			}
		});
		button_5.setBounds(444, 157, 50, 50);
		contentPane.add(button_5);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_7.setForeground(new Color(153, 0, 102));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto=texto+"7";
				textField.setText(texto);
			}
		});
		button_7.setBounds(324, 216, 50, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setForeground(new Color(153, 0, 102));
		button_8.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"8";
				textField.setText(texto);
			}
		});
		button_8.setBounds(384, 216, 50, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_9.setForeground(new Color(153, 0, 102));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"9";
				textField.setText(texto);
			}
		});
		button_9.setBounds(444, 216, 50, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_10.setForeground(new Color(153, 0, 102));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=textField.getText();
				texto=texto+"0";
				textField.setText(texto);
			}
		});
		button_10.setBounds(444, 277, 50, 50);
		contentPane.add(button_10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnLimpar.setForeground(new Color(153, 0, 102));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto=textField.getText();
				texto="";
				textField.setText(texto);
			}
		});
		btnLimpar.setBounds(324, 277, 110, 50);
		contentPane.add(btnLimpar);
	}
}
