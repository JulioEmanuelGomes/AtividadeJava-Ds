package PoupancaApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoupancaGUI extends JFrame implements ActionListener {
    private JTextField anosField;
    private JTextField jurosMensaisField;
    private JTextField depositoMensalField;
    private JLabel totalLabel;

    public PoupancaGUI() {
        // Configura a janela principal
        super("Calculadora de Poupança");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Cria o painel de entrada de dados
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel anosLabel = new JLabel("Período (em anos):");
        anosField = new JTextField(10);
        inputPanel.add(anosLabel);
        inputPanel.add(anosField);

        JLabel jurosMensaisLabel = new JLabel("Juros mensais (%):");
        jurosMensaisField = new JTextField(10);
        inputPanel.add(jurosMensaisLabel);
        inputPanel.add(jurosMensaisField);

        JLabel depositoMensalLabel = new JLabel("Depósito mensal:");
        depositoMensalField = new JTextField(10);
        inputPanel.add(depositoMensalLabel);
        inputPanel.add(depositoMensalField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);
        inputPanel.add(new JLabel());
        inputPanel.add(calcularButton);

        // Cria o painel de exibição do resultado
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel totalTextLabel = new JLabel("Valor total acumulado:");
        totalLabel = new JLabel("");
        resultPanel.add(totalTextLabel);
        resultPanel.add(totalLabel);

        // Adiciona os painéis à janela principal
        getContentPane().add(inputPanel, BorderLayout.CENTER);
        getContentPane().add(resultPanel, BorderLayout.SOUTH);

        // Exibe a janela principal
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")) {
            try {
                int anos = Integer.parseInt(anosField.getText());
                double jurosMensais = Double.parseDouble(jurosMensaisField.getText()) / 100;
                double depositoMensal = Double.parseDouble(depositoMensalField.getText());

                Poupanca poupanca = new Poupanca(anos, jurosMensais, depositoMensal);
                double total = poupanca.calculaTotal();

                totalLabel.setText(String.format("R$ %.2f", total));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos em todos os campos.");
            }
        } else if (e.getActionCommand().equals("Limpar")) {
            anosField.setText("");
            jurosMensaisField.setText("");
            depositoMensalField.setText("");
            totalLabel.setText("");
        }
    }

}
