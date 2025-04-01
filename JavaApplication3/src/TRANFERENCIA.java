import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import models.Usuario;
import utils.FileManager;

public class TRANFERENCIA extends javax.swing.JFrame {

    private JComboBox<String> cuentaclienteCombo;
    private JTextField montoinicio;
    private JButton transferButton;

    public TRANFERENCIA() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        cuentaclienteCombo = new JComboBox<>();
        montoinicio = new JTextField();
        transferButton = new JButton("Transferir");

        // Set up the frame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transferencia");

        // Add action listener for the transfer button
        transferButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        // Layout setup (simplified for brevity)
        JPanel panel = new JPanel();
        panel.add(new JLabel("Seleccionar Cuenta:"));
        panel.add(cuentaclienteCombo);
        panel.add(new JLabel("Monto a Transferir:"));
        panel.add(montoinicio);
        panel.add(transferButton);
        add(panel);

        pack();
    }

    private void transferButtonActionPerformed(ActionEvent evt) {
        String selectedAccount = (String) cuentaclienteCombo.getSelectedItem();
        String amountText = montoinicio.getText();
        if (selectedAccount != null && !amountText.isEmpty()) {
            double amount = Double.parseDouble(amountText);
            // Here you would add logic to perform the transfer
            // For example, update the account balance and log the movement

            // Save user data to file
            saveTransferData(selectedAccount, amount);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        }
    }

    private void saveTransferData(String account, double amount) {
        try {
            FileManager fileManager = new FileManager();
            String data = "Transferencia desde " + account + ": " + amount + "\n";
            fileManager.writeToFile("data/usuarios.txt", data);
            JOptionPane.showMessageDialog(this, "Transferencia registrada.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la transferencia: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANFERENCIA().setVisible(true);
            }
        });
    }
}