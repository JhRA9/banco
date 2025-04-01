import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import models.Usuario;
import utils.FileManager;

public class ESTADO extends javax.swing.JFrame {

    public ESTADO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente", "Inversion", "Nomina" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jButton16.setText("PRESTAMO");
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Navigate to PRESTAMO
                new PRESTAMO().setVisible(true);
                dispose();
            }
        });

        jButton11.setText("CREAR");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Create a new user
                String username = jTextField1.getText();
                String password = jTextField2.getText();
                Usuario usuario = new Usuario(username, password);
                FileManager.saveUser(usuario);
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
            }
        });

        jButton12.setText("TRANFERENCIA");
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Navigate to TRANFERENCIA
                new TRANFERENCIA().setVisible(true);
                dispose();
            }
        });

        jButton13.setText("COMPRAR");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Implement purchase functionality
            }
        });

        jButton14.setText("INVERSION");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Navigate to INVERSION
                new INVERSION().setVisible(true);
                dispose();
            }
        });

        jButton15.setText("ESTADO");
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Refresh account status
            }
        });

        // Layout setup code here...
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESTADO().setVisible(true);
            }
        });
    }
}