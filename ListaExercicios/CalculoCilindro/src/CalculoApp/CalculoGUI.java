package CalculoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculoGUI extends JFrame {

    // Declaring UI elements
    private JLabel lblRaio, lblAltura, lblAreaLateral, lblVolume;
    private JTextField txtRaio, txtAltura, txtAreaLateral, txtVolume;
    private JButton btnCalcular, btnLimpar;

    // Constructor to set up the UI
    public CalculoGUI() {
        // Setting up the JFrame
        super("Cálculo de Cilindro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        // Creating the JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Creating UI elements
        lblRaio = new JLabel("Raio:");
        lblAltura = new JLabel("Altura:");
        lblAreaLateral = new JLabel("Área Lateral:");
        lblVolume = new JLabel("Volume:");

        txtRaio = new JTextField(10);
        txtAltura = new JTextField(10);
        txtAreaLateral = new JTextField(10);
        txtAreaLateral.setEditable(false);
        txtVolume = new JTextField(10);
        txtVolume.setEditable(false);

        btnCalcular = new JButton("Calcular");
        btnLimpar = new JButton("Limpar");

        // Adding elements to the panel
        panel.add(lblRaio);
        panel.add(txtRaio);
        panel.add(lblAltura);
        panel.add(txtAltura);
        panel.add(lblAreaLateral);
        panel.add(txtAreaLateral);
        panel.add(lblVolume);
        panel.add(txtVolume);
        panel.add(btnCalcular);
        panel.add(btnLimpar);

        // Adding the panel to the JFrame
        getContentPane().add(panel);

        // Action listener for the "Calcular" button
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Getting input values
                double raio = Double.parseDouble(txtRaio.getText());
                double altura = Double.parseDouble(txtAltura.getText());

                // Calculating area lateral and volume
                double areaLateral = 2 * Math.PI * raio * altura;
                double volume = Math.PI * raio * raio * altura;

                // Formatting the output
                DecimalFormat df = new DecimalFormat("#.##");
                txtAreaLateral.setText(df.format(areaLateral));
                txtVolume.setText(df.format(volume));
            }
        });

        // Action listener for the "Limpar" button
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clearing input and output fields
                txtRaio.setText("");
                txtAltura.setText("");
                txtAreaLateral.setText("");
                txtVolume.setText("");
            }
        });
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating and displaying the JFrame
        CalculoGUI calcGUI = new CalculoGUI();
        calcGUI.setVisible(true);
    }
}
