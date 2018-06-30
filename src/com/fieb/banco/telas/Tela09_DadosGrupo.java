package com.fieb.banco.telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela09_DadosGrupo extends JFrame {

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
					Tela09_DadosGrupo frame = new Tela09_DadosGrupo();
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
	public Tela09_DadosGrupo() {
		setTitle("Tela Dados do Grupo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParticipantes = new JLabel("Participantes");
		lblParticipantes.setHorizontalAlignment(SwingConstants.CENTER);
		lblParticipantes.setForeground(new Color(153, 0, 102));
		lblParticipantes.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblParticipantes.setBounds(267, 13, 299, 58);
		contentPane.add(lblParticipantes);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label.setBounds(12, 13, 123, 133);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label_1.setBounds(683, 13, 145, 65);
		contentPane.add(label_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(new Color(153, 0, 102));
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnVoltar.setBounds(658, 383, 123, 37);
		contentPane.add(btnVoltar);
		
		TextArea part = new TextArea();
		//part.setWrapStyleWord(true);
		part.setEditable(false);
		part.setText("Nome                               RA\n"
				   + "Alessandro Passetto Neto           000113\n"
				   + "Alexsandro de Jesus                000150\n"
				   + "Bruno Ferreira Gil                 000014\n"
				   + "Danilo Sena                        000130\n"
				   + "Donizeti R. Sales                  000121\n"
				   + "Michel Santos                      000145\n"
				   + "Rodrigo Regio de Araujo            000110\n"
				   + "Savio Pereira                      000151\n"
				   + "Suellen I. M. S. L. Lima           000131");
		part.setBounds(145, 72, 528, 300);
		contentPane.add(part);
	}
}
