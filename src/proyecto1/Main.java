/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import Interfaces.Menu;
/**
 * este codigo importando JFilechooser lee el archio txt y los almacenas de dos ariables ArrayList, una para usuarios y otra para relaciones.Finalmene, imprime el codigo en la consola.
 * @author luis
 * @version:04/10/23
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    ArrayList <String> usuarios = new ArrayList<>();
    static ArrayList <String> relaciones = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Menu ventana = new Menu();
        ventana.setVisible(true);

        // Creamos el JFileChooser
        JFileChooser jfc = new JFileChooser();

        // Abrimos el cuadro de diálogo de selección de archivos
        int seleccion = jfc.showOpenDialog(null);

        // Si el usuario selecciona un archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            // Obtenemos el archivo seleccionado
            File archivo = jfc.getSelectedFile();

            FileReader fr= new FileReader (archivo);
            BufferedReader br = new  BufferedReader(fr);
            String linea;
            ArrayList <String> usuarios = new ArrayList();
            while ((linea = br. readLine())!= null){
//                usuarios.add(linea);
                  if (linea.startsWith( "u")){
                      usuarios.add(linea);
                  }else {
                      relaciones.add(linea);
                  }

       
            }

            // Cerramos el archivo
            br.close();
//            System.out.println("Usuarios");
            for (String usuario: usuarios){
                System.out.println(usuarios);
            }
//            System.out.println();
//            System.out.println("Relaciones");
            for (String relacion: relaciones){
                System.out.println(relacion);
            }
        }
        
    }

}
        
    
    

