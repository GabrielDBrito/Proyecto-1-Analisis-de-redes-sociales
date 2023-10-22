/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;
import EDD.Lista;
import EDD.Nodo;
import EDD.NodoG;
import Helpers.Helpers;

/**
 * @author Gabriel
 * version 04/10/23
 */
public class Grafo {
    private ListaG nodos;

    public Grafo() {
        ListaG lista=new ListaG();
        this.nodos=lista;
    }

    public ListaG getNodos() {
        return nodos;
    }

    public void setNodos(ListaG nodos) {
        this.nodos = nodos;
    }

    //imprime todos los atributos de los nodos
    public void printNodos() {
        NodoG pointer=nodos.getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todos los usuarios a partir de una lista
    @param usuarios
    */
    public void crearUsuarios(Lista usuarios){
        int cont=0; //contador que le otorga el numero a cada usuario
        Nodo pointer=usuarios.getHead();
        while (pointer!= null){
            String id=pointer.getElement().toString();
            Usuario usuario=new Usuario(id,cont);
            getNodos().insertFinal(usuario);
            cont++;
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todas las relaciones a partir de una lista
    @param relaciones
    */
    public void crearRelaciones(Lista relaciones){
        Nodo pointer = relaciones.getHead();
        Helpers helpers = new Helpers();
        while (pointer!=null){
            Lista lista =helpers.stringSplit(pointer.getElement().toString()); //separacion del string 
            Object id1=lista.getHead().getElement(); // se almacena id1 (id del usuario)
            Object id2=lista.getHead().getNext().getElement(); // se almacena id2 (id del usuario)
            NodoG nodo1=searchById(id1.toString()); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id1 y se almacena en una variable
            NodoG nodo2=searchById(id2.toString()); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id2 y se almacena en una variable
            nodo1.getAdyacentes().insertFinal(nodo2.getUsuario()); // se inserta el nodo 2 en la lista de relaciones del nodo 1
            pointer=pointer.getNext();
        }
    }
    
    /*busqueda por id
    *@param id
    *@return
    */
    public NodoG searchById(String id){
        if (nodos.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }else{
            NodoG pointer=nodos.getHead();
            NodoG temp=null;
            while(pointer!=null){
                if (pointer.getUsuario().getId().equals(id)){ //si la entrada id corresponde al id del usuario
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp; // retorna el nodoG correspondiente
                
            } else{
                //System.out.println("El usuario no fue encontrado");
                return null;
            }
        }     
    }
    
    /*borrar nodo por id
    *@param id
    *@return
    */
    public NodoG deleteById(String id){
        if (nodos.isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;     
        }else{
            NodoG pointer=nodos.getHead();
            int cont=0;
            NodoG temp=null;
            while(pointer!=null){
                if (pointer.getUsuario().getId().equalsIgnoreCase(id)){ //si el id coincide el nodo correspondiente se almacena en la variable temp
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                nodos.deleteAtIndex(cont); //se borra el nodo del grafo
                NodoG pointer1=nodos.getHead();
                while (pointer1!=null){
                    pointer1.getAdyacentes().deleteById(id); //se recorre la lista de los adyacentes de cada nodo y se borra el nodo correspondiente al id
                    pointer1=pointer1.getNext();
                }
                return temp;
                } 
                else{
                System.out.println("El nodo no fue encontrado");
                return null;
            }
        }     
    }  
    public Usuario nuevoUsuario(String id, String numero){
        Helpers helpers=new Helpers();
        String ID=helpers.verificarId(id, this);
        Integer NUMERO=helpers.verificarNumero(numero, this);
        if (ID==null || NUMERO==null){
            return null;
        }
        else{
            Usuario usuario=new Usuario(ID,NUMERO);
            getNodos().insertFinal(usuario);
            //faltan los adyacentes
            return usuario;
        }
    }
}
    
    
    
    
    
    

