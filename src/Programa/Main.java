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

/**
 * @author luis
 * @version:07/10/23
 */
public class Main {
    public static void main(String[] args) throws IOException{
        AdministradorTxt admintxt=new AdministradorTxt();
        Helpers helper=new Helpers();
        Grafo grafo=new Grafo();
        Lista usuarios =new Lista();
        Lista relaciones=new Lista();
        admintxt.lecturaTxt(usuarios, relaciones);
        grafo.crearUsuarios(usuarios);
        grafo.crearRelaciones(relaciones);
        grafo.printNodos();
        grafo.nuevoUsuario("@gabriel","22");
        }   
    }
        
            
    

