package ConsultaContaApp;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaContaGUI extends JPanel {
	public JTextField cd_agencia;
	public JTextField num_conta;
	public JTextField nome;
	public JTextField endereco;
	public JTextField telefone;
	public JTextField cpf;
	public JButton btnConsultar;
	

	/**
	 * Create the panel.
	 */
	public ConsultaContaGUI() {
		setLayout(null);
		
		JTextArea txtrContaBanco = new JTextArea();
		txtrContaBanco.setEditable(false);
		txtrContaBanco.setBounds(165, 11, 115, 26);
		txtrContaBanco.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrContaBanco.setToolTipText("");
		txtrContaBanco.setForeground(new Color(0, 0, 255));
		txtrContaBanco.setBackground(UIManager.getColor("Button.background"));
		txtrContaBanco.setTabSize(10);
		txtrContaBanco.setText("Conta Banco");
		add(txtrContaBanco);
		
		JLabel lblCodAgencia = new JLabel("Código da Agência");
		lblCodAgencia.setEnabled(false);
		lblCodAgencia.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCodAgencia.setBounds(44, 52, 125, 26);
		add(lblCodAgencia);
		
		JLabel lblNmeroDaConta = new JLabel("Número da Conta");
		lblNmeroDaConta.setEnabled(false);
		lblNmeroDaConta.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmeroDaConta.setBounds(276, 52, 125, 26);
		add(lblNmeroDaConta);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setEnabled(false);
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNome.setBounds(54, 89, 62, 26);
		add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setEnabled(false);
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEndereo.setBounds(53, 124, 74, 26);
		add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setEnabled(false);
		lblTelefone.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblTelefone.setBounds(54, 161, 74, 26);
		add(lblTelefone);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setEnabled(false);
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCpf.setBounds(54, 198, 53, 26);
		add(lblCpf);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Get the data entered by the user
		        String agencia = cd_agencia.getText();
		        String conta = num_conta.getText();
		        String nomeStr = nome.getText();
		        String enderecoStr = endereco.getText();
		        String telefoneStr = telefone.getText();
		        String cpfStr = cpf.getText();

		        // Create a new dialog box to display the data
		        JDialog dialog = new JDialog();
		        dialog.setTitle("Dados da Conta");
		        dialog.setSize(400, 250);
		        dialog.setResizable(false);
		        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		        dialog.setLocationRelativeTo(null);

		        // Create a panel to hold the data
		        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

		        // Add the data to the panel
		        panel.add(new JLabel("Código da Agência:"));
		        panel.add(new JLabel(agencia));
		        panel.add(new JLabel("Número da Conta:"));
		        panel.add(new JLabel(conta));
		        panel.add(new JLabel("Nome:"));
		        panel.add(new JLabel(nomeStr));
		        panel.add(new JLabel("Endereço:"));
		        panel.add(new JLabel(enderecoStr));
		        panel.add(new JLabel("Telefone:"));
		        panel.add(new JLabel(telefoneStr));
		        panel.add(new JLabel("CPF:"));
		        panel.add(new JLabel(cpfStr));

		        // Add the panel to the dialog box
		        dialog.getContentPane().add(panel);

		        // Show the dialog box
		        dialog.setVisible(true);
		    }
		});


		
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConsultar.setForeground(Color.BLUE);
		btnConsultar.setBounds(147, 265, 89, 23);
		add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setForeground(Color.BLUE);
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFechar.setBounds(285, 265, 89, 23);
		add(btnFechar);
		
		cd_agencia = new JTextField();
		lblCodAgencia.setLabelFor(cd_agencia);
		cd_agencia.setBounds(165, 56, 86, 20);
		add(cd_agencia);
		cd_agencia.setColumns(10);
		
		num_conta = new JTextField();
		lblNmeroDaConta.setLabelFor(num_conta);
		num_conta.setColumns(10);
		num_conta.setBounds(397, 56, 86, 20);
		add(num_conta);
		
		nome = new JTextField();
		lblNome.setLabelFor(nome);
		nome.setColumns(10);
		nome.setBounds(126, 93, 221, 20);
		add(nome);
		
		endereco = new JTextField();
		lblEndereo.setLabelFor(endereco);
		endereco.setColumns(10);
		endereco.setBounds(127, 128, 221, 20);
		add(endereco);
		
		telefone = new JTextField();
		lblTelefone.setLabelFor(telefone);
		telefone.setColumns(10);
		telefone.setBounds(127, 165, 109, 20);
		add(telefone);
		
		cpf = new JTextField();
		lblCpf.setLabelFor(cpf);
		cpf.setColumns(10);
		cpf.setBounds(127, 202, 109, 20);
		add(cpf);

	}
}
