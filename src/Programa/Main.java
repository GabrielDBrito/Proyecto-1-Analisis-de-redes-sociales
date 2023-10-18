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
import EDD.Nodo;
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
        System.out.println("todo bien 1");
        grafo.crearRelaciones(relaciones);
        System.out.println("todo bien 2");
        
        
        
        }
        
    }
        
            
    

