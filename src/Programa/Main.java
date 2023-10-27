/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa;
import java.io.IOException;
import Interfaces.Menu;
import Grafo.Grafo;

/**
 * @author luis
 * @version:07/10/23
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Grafo grafo= new Grafo();
        Menu ventana = new Menu(grafo);
        ventana.setVisible(true);
        
        
        }   

    }
        
            
    

