// filepath: c:\Users\PC-JHON\Documents\Tareas\banco\JavaApplication3\src\INVERSION.java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class INVERSION extends javax.swing.JFrame {

    public INVERSION() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Estado de inversion ");

        jLabel1.setText("Tipo de la inversion");

        jLabel2.setText("Plazo de la inversion");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "renta fija", "Acciones", "Bonos", "Divisas" }));

        jLabel3.setText("Tasa de rendimiento");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "24", "36" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Progreso", "Finalizado", "Solicitando" }));

        jButton11.setText("Guardar Inversión");
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarInversion();
            }
        });

        // Layout setup omitted for brevity

        pack();
    }

    private void guardarInversion() {
        // Logic to save investment details to a file or database
        String tipoInversion = (String) jComboBox1.getSelectedItem();
        String plazoInversion = (String) jComboBox2.getSelectedItem();
        String estadoInversion = (String) jComboBox3.getSelectedItem();

        // Here you would typically write this data to a file or database
        // For example, using FileManager to write to usuarios.txt
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INVERSION().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}