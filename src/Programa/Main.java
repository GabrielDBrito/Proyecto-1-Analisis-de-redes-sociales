/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import EDD.Lista;
import EDD.Nodo;

/**este codigo importando JFilechooser lee el archio txt y los almacenas de dos arrayys de String, una para usuarios y otra para relaciones.Finalmene, imprime el codigo en la consola.
 * @author luis
 * @version:07/10/23
 */
public class Main {
    public static void main(String[] args) throws IOException {

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

                // Declaramos dos listas para almacenar la información
                Lista usuarios=new Lista();
                Lista relaciones=new Lista();

                int i = 0;
                int j = 0;

                // Leemos los datos del archivo
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {

                    // Si la línea es un usuario
                    if (linea.startsWith("usuarios")) {

                        // Agregamos la línea a la lista de usuarios
                        usuarios.insertFinal(linea); 
                        i++;

                    } else {

                        // Agregamos la línea a la lista de relaciones
                        relaciones.insertFinal(linea);
                        //relaciones[j] = linea;
                        j++;
                    }
                }

                // Cerramos el flujo de entrada
                br.close();

                // Imprimimos la información de los usuarios
//                System.out.println("Usuarios:");
                Nodo pointer=usuarios.getHead();
                while (pointer!=null) {
                    //if (pointer != null) {
                    System.out.println(pointer.getElement());
                    pointer=pointer.getNext();
                    
                }

                // Imprimimos la información de las relaciones
//                System.out.println("Relaciones:");
                Nodo pointer2=relaciones.getHead();
                while (pointer2!=null) {
                    //if (pointer2 != null) {
                    System.out.println(pointer2.getElement());
                    pointer2=pointer2.getNext();
                }
            }        
        }
    
    

}
        
    
    

