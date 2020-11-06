package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controller.CarteiraController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuView {

	private JFrame frame;
	private JTextField tfNomeCorretora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem miRendaFixa = new JMenuItem("Renda Fixa");
		miRendaFixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CarteiraController.getCarteira() != null) {
					frame.dispose();
					RendaFixaView rendaFixaView = new RendaFixaView();
					rendaFixaView.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Nenhuma carteira criada!");
				}
				
			}
		});
		mnNewMenu.add(miRendaFixa);
		
		JMenuItem miRendaVariavel = new JMenuItem("Renda Variavel");
		mnNewMenu.add(miRendaVariavel);
		
		JMenu mnNewMenu_1 = new JMenu("Arquivo");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem miJSON = new JMenuItem("JSON");
		mnNewMenu_1.add(miJSON);
		
		JMenuItem miCSV = new JMenuItem("CSV");
		mnNewMenu_1.add(miCSV);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Carteira de Investimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 217, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome da Corretora");
		lblNewLabel_1.setBounds(10, 55, 178, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfNomeCorretora = new JTextField();
		tfNomeCorretora.setBounds(10, 76, 178, 20);
		frame.getContentPane().add(tfNomeCorretora);
		tfNomeCorretora.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarteiraController.criarCarteira(tfNomeCorretora.getText());
				JOptionPane.showMessageDialog(null, "A carteira " + tfNomeCorretora.getText() + " foi criada");
				limpar();
			}
		});
		btnCadastrar.setBounds(10, 132, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
	
	private void limpar() {
		tfNomeCorretora.setText("");
	}
}
