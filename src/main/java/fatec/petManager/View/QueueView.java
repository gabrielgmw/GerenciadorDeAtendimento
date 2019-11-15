package fatec.petManager.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class QueueView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueueView frame = new QueueView();
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
	public QueueView() {
		setTitle("Gerenciador de Atendimento Animal - Exibição de Senhas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPrximoDaFila = new JLabel("Próximo da fila:");
		lblPrximoDaFila.setFont(new Font("Yu Gothic", Font.BOLD, 35));
		lblPrximoDaFila.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPrximoDaFila, BorderLayout.NORTH);
		
		JButton btnPrximo = new JButton("Próximo");
		btnPrximo.setFont(new Font("Yu Gothic", Font.PLAIN, 26));
		contentPane.add(btnPrximo, BorderLayout.EAST);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Yu Gothic", Font.PLAIN, 26));
		contentPane.add(btnAnterior, BorderLayout.WEST);
		
		JLabel lblFila = new JLabel("");
		lblFila.setForeground(Color.RED);
		lblFila.setHorizontalAlignment(SwingConstants.CENTER);
		lblFila.setFont(new Font("Yu Gothic", Font.BOLD, 99));
		contentPane.add(lblFila, BorderLayout.CENTER);
	}

}
