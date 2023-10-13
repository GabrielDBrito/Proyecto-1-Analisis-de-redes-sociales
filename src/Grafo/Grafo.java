/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;

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
    
    /*busqueda por id
    *@param id
    *@return
    */
    public Usuario searchById(String id){
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
                    cont++;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
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
                    cont++;
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
    
    
    
    
    
    

