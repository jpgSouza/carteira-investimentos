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

import controller.ArquivoController;
import controller.CarteiraController;
import model.arquivos.CsvStrategy;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RendaFixaView {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfData;
	private JTextField tfRendimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RendaFixaView window = new RendaFixaView();
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
	public RendaFixaView() {
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

		JMenuItem mntmNewMenuItem = new JMenuItem("Renda Fixa");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Renda Variavel");
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_1 = new JMenu("Arquivo");
		menuBar.add(mnNewMenu_1);

		JMenuItem miJSON = new JMenuItem("JSON");
		miJSON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArquivoController.gerar();
			}
		});
		mnNewMenu_1.add(miJSON);

		JMenuItem miCSV = new JMenuItem("CSV");
		miCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArquivoController.getArquivo().setArquivoStrategy(new CsvStrategy());
				ArquivoController.gerar();
			}
		});
		mnNewMenu_1.add(miCSV);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Renda Fixa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 224, 31);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		tfNome = new JTextField();
		tfNome.setBounds(10, 68, 120, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o");
		lblNewLabel_2.setBounds(10, 99, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		tfPreco = new JTextField();
		tfPreco.setBounds(10, 122, 120, 20);
		frame.getContentPane().add(tfPreco);
		tfPreco.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setBounds(10, 153, 120, 14);
		frame.getContentPane().add(lblNewLabel_3);

		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(10, 173, 120, 20);
		frame.getContentPane().add(tfQuantidade);
		tfQuantidade.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Data de Vencimento");
		lblNewLabel_4.setBounds(203, 49, 114, 14);
		frame.getContentPane().add(lblNewLabel_4);

		tfData = new JTextField();
		tfData.setBounds(203, 68, 120, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Rendimento");
		lblNewLabel_5.setBounds(203, 99, 114, 14);
		frame.getContentPane().add(lblNewLabel_5);

		tfRendimento = new JTextField();
		tfRendimento.setBounds(203, 122, 120, 20);
		frame.getContentPane().add(tfRendimento);
		tfRendimento.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarteiraController.criarRendaFixa(tfNome.getText(), Double.parseDouble(tfPreco.getText()),
						Double.parseDouble(tfQuantidade.getText()), tfData.getText(),
						Double.parseDouble(tfRendimento.getText()));
				JOptionPane.showMessageDialog(null, "Renda fixa criada!");
				limpar();
			}
		});
		btnCadastrar.setBounds(203, 172, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
	
	private void limpar() {
		tfNome.setText("");
		tfPreco.setText("");
		tfQuantidade.setText("");
		tfData.setText("");
		tfRendimento.setText("");
	}
	
}
