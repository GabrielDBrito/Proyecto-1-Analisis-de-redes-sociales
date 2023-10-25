/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;
import EDD.Lista;
import javax.swing.JOptionPane;
import Grafo.Grafo;
import EDD.NodoG;

/**
 *
 * @author Gabriel
 * version 18/10/2023
 */
public class Helpers {

    public Helpers() {
    }
    
   /*
    Divide un string en 2, la primera parte hasta que encuentre ", " y la segunda parte el resto del string
    
    @param string
    @return lista
    
    */
   public Lista stringSplit(String string){
        String[] partes = string.split(", ");
        String parte1 = partes[0]; // parte del string anterior a ", "
        String parte2 = partes[1]; // parte del string posterior a ", "
       
        Lista lista = new Lista();
        lista.insertFinal(parte1);
        lista.insertFinal(parte2);
        return lista;
   }
   
   /**
     * Verifica si el parametro es un numero entero y los castea a int
     * 
     * @param numString
     * @return
     */
    public Integer valorNumero(String numString) {
        int numero;
        try {
            numero = Integer.parseInt(numString);
            if (numero > 0) {
                return numero;

            } else {
                JOptionPane.showMessageDialog(null, "Numnero invalido. ");
                return null;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numnero invalido. ");
        }

        return null;
    }
    
    /**
     * verifica si el primer caracter del id es @.
     * 
     * @param id
     * @return
     */
    
    public String arroba(String id) {

        String b = "@";

        char primero = id.charAt(0);
        String chart = Character.toString(primero);

        if (chart.equalsIgnoreCase(b)) {
            if (id.length() == 1) {
                JOptionPane.showMessageDialog(null, "Nombre de usuario invalido. ");
                return "no";

            } else {
                return id;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario invalido. ");
            return "no";
        }
    }   
    
    /**
     * verifica si el id ingresado por parametro es valido (empieza con @ y no esta siendo utilizado por otro usuario).
     * 
     * @param id, grafo
     * @return
     */
    public String verificarId(String id, Grafo grafo){
        String verificacion=arroba(id);
        String verifiacion1="no";
        if(verificacion.equalsIgnoreCase(verifiacion1)){
            return null;
            } 
        else {
        NodoG temp=grafo.searchById(id);
        if (temp!=null){
            JOptionPane.showMessageDialog(null, "Nombre de usuario invalido. ");
            return null;
        }
        else {
            return id;
             }
        }
      }
    
    
    /**
     * verifica si el numero ingresado por parametro es valido (es realmente un numero y no esta siendo utilizado por otro usuario).
     * 
     * @param id
     * @return
     */
     public Integer verificarNumero(String numString, Grafo grafo){
        Integer verificacion=valorNumero(numString);
        if (verificacion!=null){
            NodoG pointer=grafo.getNodos().getHead();
            int igual=0;
            while(pointer!=null){
                if (pointer.getUsuario().getNumero()==verificacion){
                    igual=1;
                }
                pointer=pointer.getNext();  
            }
            if (igual==0){
                return verificacion;
            }
            else{
                JOptionPane.showMessageDialog(null, "Numero invalido. ");
                return null;
            }
            
        } else{
            return null;
        }   
    }   
}
    
   

