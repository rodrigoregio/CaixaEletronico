package com.fieb.banco.telas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.fieb.banco.Objetos.Cliente;
import com.fieb.banco.classes.Extrato;

import java.awt.TextArea;
public class Tela08_Extrato extends JFrame {
	static Cliente cli=new Cliente();
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
					Tela08_Extrato frame = new Tela08_Extrato(cli);
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
	public Tela08_Extrato(Cliente c) {
		setTitle("Tela Extrato");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(27, 25, 123, 133);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_1.setBounds(668, 25, 145, 65);
		contentPane.add(label_1);
		
		JLabel lblExtrato = new JLabel("Extrato");
		lblExtrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtrato.setForeground(new Color(153, 0, 102));
		lblExtrato.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblExtrato.setBounds(299, 32, 258, 58);
		contentPane.add(lblExtrato);
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela04_Operacoes tela04 = new Tela04_Operacoes(c);
				tela04.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(153, 0, 102));
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.setBounds(557, 381, 123, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Sair");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(153, 0, 102));
		button_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_1.setBounds(690, 381, 123, 37);
		contentPane.add(button_1);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setFont(new Font("Arial", Font.PLAIN, 13));
		textArea.setBounds(160, 101, 653, 266);
		contentPane.add(textArea);
		
		JButton btnGerarArquivo = new JButton("Gerar Extrato");
		btnGerarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(Extrato.extrair(c));
			}
		});
		btnGerarArquivo.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnGerarArquivo.setForeground(new Color(153, 0, 102));
		btnGerarArquivo.setBounds(160, 381, 387, 37);
		contentPane.add(btnGerarArquivo);
	}
}
