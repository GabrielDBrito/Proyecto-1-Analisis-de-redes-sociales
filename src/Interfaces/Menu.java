/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Lista;
import EDD.Nodo;
import EDD.NodoG;
import Grafo.Arista;
import Grafo.Grafo;
import Helpers.Helpers;
import ManejoTxt.AdministradorTxt;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;

/**
 *
 * @author cesar
 * version 21/10/23
 */
public class Menu extends javax.swing.JFrame {
    static private Grafo grafo;
    public static ModificarGrafo v0;
    static private File archivo;
    
    
    /**
     * Creates new form Menu
     */
    public Menu(Grafo grafo, File archivo) {
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        if (grafo==null){
        this.grafo=null;
        }else{
            this.grafo=grafo;
        }
        if (archivo==null){
        this.archivo=null;
        }else{
            this.archivo=archivo;
        }
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
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
        CargaArchivo = new javax.swing.JButton();
        CompsFuerteConex = new javax.swing.JButton();
        ModificarGrafo = new javax.swing.JButton();
        ActualizarRepo = new javax.swing.JButton();
        MostrarGrafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        CargaArchivo.setBackground(new java.awt.Color(255, 153, 102));
        CargaArchivo.setText("CARGAR ARCHIVO");
        CargaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaArchivoActionPerformed(evt);
            }
        });

        CompsFuerteConex.setBackground(new java.awt.Color(255, 153, 102));
        CompsFuerteConex.setText("COMPONENTES FUERTEMENTE CONECTADOS");

        ModificarGrafo.setBackground(new java.awt.Color(255, 153, 102));
        ModificarGrafo.setText("MODIFICAR GRAFO");
        ModificarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarGrafoActionPerformed(evt);
            }
        });

        ActualizarRepo.setBackground(new java.awt.Color(255, 153, 102));
        ActualizarRepo.setText("ACTUALIZAR REPOSITORIO");
        ActualizarRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarRepoActionPerformed(evt);
            }
        });

        MostrarGrafo.setBackground(new java.awt.Color(255, 153, 102));
        MostrarGrafo.setText("MOSTRAR GRAFO");
        MostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarGrafoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LGC Social.png"))); // NOI18N
        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(CargaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(ModificarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(ActualizarRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompsFuerteConex, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(CargaArchivo)
                .addGap(6, 6, 6)
                .addComponent(ModificarGrafo)
                .addGap(6, 6, 6)
                .addComponent(ActualizarRepo)
                .addGap(6, 6, 6)
                .addComponent(MostrarGrafo)
                .addGap(6, 6, 6)
                .addComponent(CompsFuerteConex)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /*
    Este metodo se encarga de cargar el archivo txt
    
    */
    private void CargaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaArchivoActionPerformed
        AdministradorTxt admintxt=new AdministradorTxt();
        Helpers helper=new Helpers();
        Grafo grafo=new Grafo();
        Lista usuarios =new Lista();
        Lista relaciones=new Lista();
        try {
            File archivo=admintxt.lecturaTxt(usuarios, relaciones);
            setArchivo(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        grafo.crearUsuarios(usuarios);
        grafo.crearRelaciones(relaciones);
        setGrafo(grafo);
    }//GEN-LAST:event_CargaArchivoActionPerformed
    
    /*
    Este metodo se encarga de mostrar la interfaz de mostrar grafo
    
    */
    private void ModificarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarGrafoActionPerformed
        if (getGrafo().getNodos().getLength()!=0){
        ModificarGrafo v3 = new ModificarGrafo(this,getGrafo(),archivo);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo");
        }
    }//GEN-LAST:event_ModificarGrafoActionPerformed

    /*
    Este metodo se encarga de actualizar el repositorio (sobreescribir txt con los cambios)
    
    */
    private void ActualizarRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarRepoActionPerformed
        AdministradorTxt admintxt=new AdministradorTxt();
        admintxt.escrituraTxt(getGrafo(), getArchivo());
    }//GEN-LAST:event_ActualizarRepoActionPerformed
    
    /*
    Este metodo se encarga de mostrar el grafo
    
    */
    private void displayGraph(Graph graph2) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout()){
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 480);
            }
        };
        frame.setSize(panel.getWidth(), panel.getHeight());
     
        Viewer viewer = new SwingViewer(graph2, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);      
    }
    
    /*
    Este metodo se encarga de crear el grafo con la libreria graphstream para luego ser mostrado
    
    */
    private void MostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGrafoActionPerformed
        if (grafo.getNodos().getLength()==0){
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo");
        }
        else{
        
            try{

            Graph graphLibrary = new MultiGraph("LGC Social");
            System.setProperty("org.graphstream.ui", "swing");
            NodoG auxNodo =getGrafo().getNodos().getHead();      

            graphLibrary.setAttribute("ui.stylesheet", "node{\n" +
                    "    size: 30px, 30px;\n" +
                    "    fill-color: orange;\n" +
                    "    text-mode: normal; \n" +
                    "}");
            //Recorre los nodos y los agrega al grafo
            while(auxNodo!=null){
                String numero=Integer.toString(auxNodo.getUsuario().getNumero());
                String id=auxNodo.getUsuario().getId();

                graphLibrary.addNode(numero);
                graphLibrary.getNode(numero).setAttribute("ui.label", id);
                graphLibrary.getNode(numero).setAttribute("ui.frozen");
                auxNodo=auxNodo.getNext();
            }                

            //Recorre las aristas y las agrega al grafo
            Arista arista=getGrafo().getAristas().getHead();
            while(arista!=null){
                String n1=Integer.toString(arista.getInicio().getUsuario().getNumero());
                String n2=Integer.toString(arista.getObjetivo().getUsuario().getNumero());
                String id=n1+n2;
                graphLibrary.addEdge(id,n1,n2, true);
                arista=arista.getNext();
            }
            this.displayGraph(graphLibrary);
            }
            catch(Exception err){
                    JOptionPane.showMessageDialog(null, err);
            }
    }//GEN-LAST:event_MostrarGrafoActionPerformed
    }   
    
    
    
    
    /**
     *
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(grafo,archivo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarRepo;
    private javax.swing.JButton CargaArchivo;
    private javax.swing.JButton CompsFuerteConex;
    private javax.swing.JButton ModificarGrafo;
    private javax.swing.JButton MostrarGrafo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
