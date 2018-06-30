package com.fieb.banco.telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Tela05_TelUteis extends JFrame {

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
					Tela05_TelUteis frame = new Tela05_TelUteis();
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
	public Tela05_TelUteis() {
		setTitle("Tela Telefones \u00DAteis");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelUteis = new JLabel("Telefones \u00DAteis:");
		lblTelUteis.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelUteis.setForeground(new Color(153, 0, 102));
		lblTelUteis.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblTelUteis.setBounds(198, 25, 353, 40);
		contentPane.add(lblTelUteis);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(155, 118, 672, 29);
		lblNewLabel_1.setText("FiEB Prime:");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(155, 256, 672, 29);
		lblNewLabel.setText("Emergencia:");
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\FiebPrimeOriginal2.png"));
		label_2.setBounds(12, 13, 123, 133);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela01_Home tela01 = new Tela01_Home();
				tela01.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(153, 0, 102));
		btnNewButton.setBounds(682, 388, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("F:\\bkp\\EclipseWS\\CaixaEletronico\\Imagens\\logo_FIEB 2017 com slogan.jpg"));
		label.setBounds(682, 13, 145, 65);
		contentPane.add(label);
		
		JLabel lblSecretariaFieb = new JLabel("Secretaria Fieb:  (11) 2078-7810");
		lblSecretariaFieb.setVerticalAlignment(SwingConstants.TOP);
		lblSecretariaFieb.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecretariaFieb.setForeground(new Color(153, 0, 102));
		lblSecretariaFieb.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSecretariaFieb.setBounds(155, 158, 672, 29);
		contentPane.add(lblSecretariaFieb);
		
		JLabel lblFmb = new JLabel("\r\nFMB: (11) 4199-4229");
		lblFmb.setVerticalAlignment(SwingConstants.TOP);
		lblFmb.setHorizontalAlignment(SwingConstants.LEFT);
		lblFmb.setForeground(new Color(153, 0, 102));
		lblFmb.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFmb.setBounds(155, 198, 672, 29);
		contentPane.add(lblFmb);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 238, 815, 7);
		contentPane.add(separator);
		
		JLabel lblBombeiros = new JLabel("\r\nBombeiros: 193");
		lblBombeiros.setVerticalAlignment(SwingConstants.TOP);
		lblBombeiros.setForeground(new Color(153, 0, 102));
		lblBombeiros.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblBombeiros.setBounds(155, 296, 672, 29);
		contentPane.add(lblBombeiros);
		
		JLabel lblPoliciaMilitar = new JLabel("Policia Militar: 190");
		lblPoliciaMilitar.setVerticalAlignment(SwingConstants.TOP);
		lblPoliciaMilitar.setForeground(new Color(153, 0, 102));
		lblPoliciaMilitar.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPoliciaMilitar.setBounds(155, 336, 672, 29);
		contentPane.add(lblPoliciaMilitar);
	}
}
