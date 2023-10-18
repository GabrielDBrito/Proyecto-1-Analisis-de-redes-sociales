/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTxt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import EDD.Lista;
/**
 *
 * @author Gabriel, Luis
 * version 17/10/23
 * Clase encargada del manejo del archivo Txt
 */
public class AdministradorTxt {
    

    public void lecturaTxt(Lista usuarios, Lista relaciones) throws IOException{
          
            // Creamos el JFileChooser
            JFileChooser jfc = new JFileChooser();

            // Abrimos el cuadro de diálogo de selección de archivos
            int seleccion = jfc.showOpenDialog(null);

            // Si el usuario seleccionó un archivo
            if (seleccion == JFileChooser.APPROVE_OPTION) {

                // Obtenemos el archivo seleccionado
                File archivo = jfc.getSelectedFile();

                // Creamos un flujo de entrada para leer el archivo
                FileReader fr = new FileReader(archivo);
                
                // Leemos los datos del archivo
                BufferedReader br = new BufferedReader(fr);
                String linea;
                int contador =0;
                while ((linea = br.readLine()) != null) {

                    // Si la línea es un usuario
                    if (linea.startsWith("usuarios")) {
                        contador=1;
                    }
                    if (linea.startsWith("relaciones")) {
                        contador=2;
                    }
                    if (linea.startsWith("@")) {
                        if (contador==1){
                            // Agregamos la línea a la lista de usuarios
                            usuarios.insertFinal(linea); 
                            
                            }
                        if (contador ==2){
                            // Agregamos la línea a la lista de relaciones
                            relaciones.insertFinal(linea);
                            
                        }
                    }
   
                }

                // Cerramos el flujo de entrada
                br.close();
               
            }
            
    }
}
