/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author cesar
 */
public class Agregar extends javax.swing.JFrame {
<<<<<<< HEAD
    public static ModificarGrafo v2;
=======
    public static ModificarGrafo v3;
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76

    /**
     * Creates new form Agregar
     */
<<<<<<< HEAD
    public Agregar(ModificarGrafo v2) {
        initComponents();
        this.v2=v2;
        v2.setVisible(false);
=======
    public Agregar(ModificarGrafo v3) {
        initComponents();
        this.v3=v3;
        v3.setVisible(false);
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
<<<<<<< HEAD

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
=======
        AgregarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
<<<<<<< HEAD
        jLabel1.setText("Ingrese las conexiones del usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        NombreUsuario.setBackground(new java.awt.Color(255, 204, 153));
        NombreUsuario.setText("Ingrese el nombre de usuario...");
        jPanel1.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 530, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el nombre de usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 204, 153));
=======
        jLabel1.setText("Ingresa el nombre de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        NombreUsuario.setBackground(new java.awt.Color(255, 255, 204));
        NombreUsuario.setText("Ingrese el nombre");
        jPanel1.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 530, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese las conexiones correspondientes:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

<<<<<<< HEAD
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 600, 150));
=======
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 740, 270));

        AgregarUsuario.setBackground(new java.awt.Color(255, 153, 102));
        AgregarUsuario.setText("AGREGAR");
        AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, -1));
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
    private void AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarUsuarioActionPerformed

>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                new Agregar(v2).setVisible(true);
=======
                new Agregar(v3).setVisible(true);
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
    private javax.swing.JButton AgregarUsuario;
>>>>>>> beef4476d0debc9e5f3e1850efab69ccbfc2ef76
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
