package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ControleAnimal;
import dominio.Animal;

public class ConsultaAnimal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControleAnimal controleAnimal = new ControleAnimal();
	private JTextField textNome;
	private JTextField textEspecie;
	private JTextField textRaca;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaAnimal frame = new ConsultaAnimal();
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
	public ConsultaAnimal() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTA DE ANIMAL");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 253, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 115, 107, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ESPÉCIE:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(20, 149, 107, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RAÇA:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(20, 183, 107, 23);
		contentPane.add(lblNewLabel_1_2);
		
		textNome = new JTextField();
		textNome.setBounds(100, 117, 153, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEspecie = new JTextField();
		textEspecie.setBounds(100, 149, 153, 20);
		contentPane.add(textEspecie);
		textEspecie.setColumns(10);
		
		textRaca = new JTextField();
		textRaca.setBounds(100, 183, 153, 20);
		contentPane.add(textRaca);
		textRaca.setColumns(10);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String especie = textEspecie.getText();
				String raca = textRaca.getText();
				int id = Integer.parseInt(textId.getText());
				
				controleAnimal.alterar(id, nome, especie, raca);
				
				JOptionPane.showMessageDialog(null, "Animal alterado com sucesso!");
				
				textNome.setText("");
				textEspecie.setText("");
				textRaca.setText("");
			}
		});
		btnAlterar.setFont(new Font("Arial", Font.BOLD, 14));
		btnAlterar.setBounds(10, 217, 117, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(20, 67, 107, 23);
		contentPane.add(lblNewLabel_1_3);
		
		textId = new JTextField();
		textId.setBounds(100, 69, 41, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 253, 2);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("CONSULTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textId.getText());
				
				Animal animal = controleAnimal.consultar(id);
				
				if(animal.getNome() != null) {
				
					textNome.setText(animal.getNome());
					textEspecie.setText(animal.getEspecie());
					textRaca.setText(animal.getRaca());
				}
				else {
					JOptionPane.showMessageDialog(null, "Animal não encontrado.");
				}
			}
		});
		btnNewButton_1.setBounds(151, 68, 112, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textId.getText());
				
				if(JOptionPane.showConfirmDialog(null, "Deseja excluir o animal?") == 0) {
					controleAnimal.excluir(id);
					JOptionPane.showMessageDialog(null, "Animal excluido com sucesso!");
					
					textNome.setText("");
					textEspecie.setText("");
					textRaca.setText("");
				}
			}
		});
		btnExcluir.setFont(new Font("Arial", Font.BOLD, 14));
		btnExcluir.setBounds(137, 218, 117, 23);
		contentPane.add(btnExcluir);
	}
}
