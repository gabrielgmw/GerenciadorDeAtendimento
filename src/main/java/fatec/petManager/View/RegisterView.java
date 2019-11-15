package fatec.petManager.View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView frame = new RegisterView();
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
	public RegisterView() {
		setResizable(false);
		setTitle("Gerenciador de Atendimento Animal - Triagem");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGerenciadorDeAtendimento = new JLabel("Gerenciador de Atendimento Animal - Processo de Triagem");
		lblGerenciadorDeAtendimento.setFont(new Font("Yu Gothic", Font.BOLD, 26));
		
		JRadioButton rdbtnClinicaGeral = new JRadioButton("Clínica Geral");
		rdbtnClinicaGeral.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		JRadioButton rdbtnFratura = new JRadioButton("Fratura");
		rdbtnFratura.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		JRadioButton rdbtnVacinacao = new JRadioButton("Vacinação");
		rdbtnVacinacao.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		JRadioButton rdbtnCirurgia = new JRadioButton("Cirurgia");
		rdbtnCirurgia.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		final JLabel lbl_nome = new JLabel("Nome do Pet:");
		lbl_nome.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		final JLabel lbl_tipo = new JLabel("Espécie/Raça:");
		lbl_tipo.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		final JLabel lbl_peso = new JLabel("Peso:");
		lbl_peso.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		final JLabel lbl_idade = new JLabel("Idade:");
		lbl_idade.setFont(new Font("Yu Gothic", Font.ITALIC, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic", Font.ITALIC, 14));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic", Font.ITALIC, 14));
		textField_3.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir na Fila");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = lbl_nome.getText();
				String tipo = lbl_tipo.getText();
				String pes = lbl_peso.getText();
				String idad = lbl_idade.getText();
				
				int peso = Integer.parseInt(pes);
				int idade = Integer.parseInt(idad);
				
				System.out.println(nome + "; " + tipo + "; "+ peso + "; " + idade);
				
				
			}
		});
		btnInserir.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		
		JButton btnIniciarAtendimento = new JButton("Iniciar Atendimento");
		
		btnIniciarAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QueueView exibir = new QueueView();
				exibir.setVisible(true);
				
				
			}
		});
		btnIniciarAtendimento.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblTipoDeAtendimento = new JLabel("Tipo de Atendimento");
		lblTipoDeAtendimento.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblInformacoesAnimal = new JLabel("Informações do Pet");
		lblInformacoesAnimal.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnClinicaGeral, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnFratura, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnVacinacao, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnCirurgia, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbl_nome)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbl_tipo, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lbl_idade, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lbl_peso, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblTipoDeAtendimento, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
									.addGap(112)
									.addComponent(lblInformacoesAnimal, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblGerenciadorDeAtendimento))))
					.addGap(21))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(255)
					.addComponent(btnIniciarAtendimento)
					.addContainerGap(256, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(118)
					.addComponent(btnInserir)
					.addContainerGap(473, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblGerenciadorDeAtendimento, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipoDeAtendimento)
						.addComponent(lblInformacoesAnimal, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnClinicaGeral)
						.addComponent(lbl_nome)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnFratura, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_tipo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnVacinacao, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbl_peso, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnCirurgia, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_idade, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnInserir)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(btnIniciarAtendimento)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
