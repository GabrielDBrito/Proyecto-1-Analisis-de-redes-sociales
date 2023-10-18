/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;
import EDD.Lista;
import EDD.Nodo;
import Helpers.Helpers;
/**
 *
 * @author Gabriel
 * version 04/10/23
 */
public class Grafo {
    private ListaG usuarios;

    public Grafo() {
        ListaG lista=new ListaG();
        this.usuarios=lista;
    }

    public ListaG getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ListaG usuarios) {
        this.usuarios = usuarios;
    }
    
    //imprime todos los ids
    public void printIds() {
        Usuario pointer=usuarios.getHead();
        while (pointer!=null){
            System.out.println(" ["+pointer.getId()+"] " );
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todos los usuarios (nodos del grafo) a partir de una lista que recibe como parametro
    @param usuarios
    */
    
    public void crearUsuarios(Lista usuarios){
        int cont=0;
        Nodo pointer=usuarios.getHead();
        while (pointer!= null){
            String id=pointer.getElement().toString();
            Usuario usuario=new Usuario(id,cont);
            getUsuarios().insertFinal(usuario);
            cont++;
            pointer=pointer.getNext();
        }
    }
    
    public void crearRelaciones(Lista relaciones){
        Nodo pointer = relaciones.getHead();
        Helpers helpers = new Helpers();
        while (pointer!=null){
            Lista lista =helpers.stringSplit(pointer.getElement().toString()); //separacion del string 
            Object id1=lista.getHead().getElement(); // se almacena id1
            Object id2=lista.getHead().getNext().getElement(); // se almacena id2
            Usuario usuario1=searchById(id1.toString()); // se busca el usuario correspondiente al id1 y se almacena en una variable
            Usuario usuario2=searchById(id2.toString()); // se busca el usuario correspondiente al id2 y se almacena en una variable
            usuario1.getRelaciones().insertFinal(usuario2); // se inserta el usuario 2 en la lista de relaciones del usuario 1
            pointer=pointer.getNext();
            System.out.println("flag");
        }
    }
    
    
    /*busqueda por id
    *@param id
    *@return
    */
    public Usuario searchById(String id){
        if (usuarios.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }else{
            Usuario pointer=usuarios.getHead();
            Usuario temp=null;
            while(pointer!=null){
                if (pointer.getId().equals(id)){
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp;
                
            } else{
                System.out.println("El usuario no fue encontrado");
                return null;
            }
        }     
    }
    
    /*borrar nodo por id
    *@param id
    *@return
    */
    public Usuario deleteById(String id){
        if (usuarios.isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;     
        }else{
            Usuario pointer=usuarios.getHead();
            int cont=0;
            Usuario temp=null;
            while(pointer.getNext()!=null){
                if (pointer.getId()==id){
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                usuarios.deleteAtIndex(cont-1);
                return temp;
            } else{
                System.out.println("El elemento que se queria borrar no fue encontrado");
                return null;
            }
        }   
        
    }
}
    
    
    
    
    
    

