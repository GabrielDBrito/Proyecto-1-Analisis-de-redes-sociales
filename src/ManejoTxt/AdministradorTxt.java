/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTxt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import EDD.Lista;
import EDD.NodoG;
import EDD.Nodo;
import Grafo.Grafo;
import Grafo.Arista;
/**
 *
 * @author Gabriel, Luis
 * version 25/10/23
 * Clase encargada del manejo del archivo Txt
 */
public class AdministradorTxt {
    
    /*
    Este metodo le permite al usuario seleccionar un archivo txt, posteoriormente lee el archivo y carga la informacion en el grafo
    @param usuarios, relaciones
    @ return
    */
    public File lecturaTxt(Lista usuarios, Lista relaciones) throws IOException{

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
                
                JOptionPane.showMessageDialog(null, "Este programa necesita guardar en el archivo los datos cargados en memoria");
                
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
                return archivo;
            }
            return null;
    }
    
    public void escrituraTxt(Grafo grafo, File archivo){
        String textoTxt="";
        Lista ListaTexto=new Lista();
        ListaTexto.insertFinal("usuarios");
        NodoG pointer =grafo.getNodos().getHead();
        while(pointer!=null){
            ListaTexto.insertFinal(pointer.getUsuario().getId());
            pointer=pointer.getNext();
        }
        ListaTexto.insertFinal("relaciones");
        Arista pointer1 =grafo.getAristas().getHead();
        while(pointer1!=null){
            String texto1=pointer1.getInicio().getUsuario().getId();
            String texto2=pointer1.getObjetivo().getUsuario().getId();
            String textoArista=texto1+", "+texto2;
            ListaTexto.insertFinal(textoArista);
            pointer1=pointer1.getNext();
        }
        Nodo nodo=ListaTexto.getHead();
        for(int i=0; i<ListaTexto.getLength();i++){
            textoTxt+=nodo.getElement().toString()+"\n";
            nodo=nodo.getNext();       
            }
        
        try{
            PrintWriter pw = new PrintWriter(archivo);
            pw.print(textoTxt);
            pw.close();
            JOptionPane.showMessageDialog(null, "Repositorio Actualizado");
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(null, err);
        }
        }
    }


