/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa;
import ManejoTxt.AdministradorTxt;
import EDD.Lista;
import java.io.IOException;
import Helpers.Helpers;
import Grafo.Grafo;
import Grafo.Usuario;
import EDD.NodoG;
import EDD.ListaG;

/**
 * @author luis
 * @version:07/10/23
 */
public class Main {
    public static void main(String[] args) throws IOException{
        AdministradorTxt admintxt=new AdministradorTxt();
        Grafo grafo=new Grafo();
        Helpers helpers=new Helpers();
        Lista usuarios =new Lista();
        Lista relaciones=new Lista();
        admintxt.lecturaTxt(usuarios, relaciones);
        grafo.crearUsuarios(usuarios);
        grafo.crearRelaciones(relaciones);
        grafo.printNodos();
        }   
    }
        
            
    

