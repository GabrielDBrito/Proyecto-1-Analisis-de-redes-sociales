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
import EDD.NodoG;
import DFS.Kosaraju;

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
       
        grafo.Kosaraju();
        
        
        /*NodoG pointer=grafo.getNodos().getHead();
        
        while(pointer!=null){
            System.out.println("------------------");
            System.out.println("Numero: "+pointer.getUsuario().getNumero());
            System.out.println("Numero de componente: "+pointer.getNumeroComponente());
            System.out.println("------------------");
            pointer=pointer.getNext();
        }
    */
        }   
    }
        
            
    

