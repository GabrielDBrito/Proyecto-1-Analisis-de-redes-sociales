/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import javax.swing.JFileChooser;
//import ManejoTxt.AdministradorTxt;
/**
 *
 * @author cesar
 */
/**este codigo importando JFilechooser lee el archio txt y los almacenas de dos arrayys de String, una para usuarios y otra para relaciones.Finalmene, imprime el codigo en la consola.
 * @author luis
 * @version:07/10/23
 */

public class CargaArchivo extends javax.swing.JFrame {
//        public static void main(String[] args) throws IOException {
//
//            // Creamos el JFileChooser
//            JFileChooser jfc = new JFileChooser();
//
//            // Abrimos el cuadro de diálogo de selección de archivos
//            int seleccion = jfc.showOpenDialog(null);
//
//            // Si el usuario seleccionó un archivo
//            if (seleccion == JFileChooser.APPROVE_OPTION) {
//
//                // Obtenemos el archivo seleccionado
//                File archivo = jfc.getSelectedFile();
//
//                // Creamos un flujo de entrada para leer el archivo
//                FileReader fr = new FileReader(archivo);
//
//                // Declaramos dos arrays para almacenar la información
//                String[] usuarios = new String[100];
//                String[] relaciones = new String[100];
//
//                int i = 0;
//                int j = 0;
//
//                // Leemos los datos del archivo
//                BufferedReader br = new BufferedReader(fr);
//                String linea;
//                while ((linea = br.readLine()) != null) {
//
//                    // Si la línea es un usuario
//                    if (linea.startsWith("Usuario")) {
//
//                        // Agregamos la línea al array de usuarios
//                        usuarios[i] = linea;
//                        i++;
//
//                    } else {
//
//                        // Agregamos la línea al array de relaciones
//                        relaciones[j] = linea;
//                        j++;
//                    }
//                }
//
//                // Cerramos el flujo de entrada
//                br.close();
//
//                // Imprimimos la información de los usuarios
//                System.out.println("Usuarios:");
//                for (String usuario : usuarios) {
//                    if (usuario != null) {
//                        System.out.println(usuario);
//                    }
//                }
//
//                // Imprimimos la información de las relaciones
//                System.out.println("Relaciones:");
//                for (String relacion : relaciones) {
//                    if (relacion != null) {
//                        System.out.println(relacion);
//                    }
//                }
//            }
//        }    
    
        public static Menu v1;

        /**
         * Creates new form CargaArchivo
         */
        public CargaArchivo(Menu v1) {
            initComponents();
            this.v1=v1;
            v1.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el archivo TXT:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                java.util.logging.Logger.getLogger(CargaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(CargaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(CargaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(CargaArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CargaArchivo(v1).setVisible(true);
                }
            });

        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
