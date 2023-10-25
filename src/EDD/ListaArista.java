/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Arista;
/**
 *
 * @author Gabriel
 */
public class ListaArista {
    private Arista head;
    private int length;

    public ListaArista() {
        this.head = null;
        this.length = 0;
    }
    
    
    public Arista getHead() {
        return head;
    }

    public void setHead(Arista head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void insertFinal(Arista arista) {
        if (isEmpty()){
            setHead(arista);
        }
        else{
            Arista pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(arista);
        }
        length++;
    }
    
    public Arista deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Arista temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }
    
    
    public Arista deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Arista pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            Arista temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    
    public Arista deleteAtIndex(int index) {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            if (index==0){
                return deleteBegin();
            }
            else{
                if (index<getLength()){
                    Arista pointer=getHead();
                    int cont=0;
                    while(cont<index-1){
                        pointer=pointer.getNext();
                        cont++;
                    }
                    Arista temp=pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                    return temp;    
                }
                else{
                    if (index==getLength()-1){
                        return deleteFinal();
                    } 
                    else{
                        System.out.println("Index not valid");
                        return null;
                    }
                    
                }
            }
        }
    }
    
    public boolean isEmpty() {
            return getHead()==null;    
    }
    
    public Arista deleteByIds(String id1, String id2){
        if (isEmpty()){
            return null;     
        }else{
            Arista pointer=getHead();
            int cont=0;
            Arista temp=null;
            while(pointer!=null){
                if (pointer.getInicio().getUsuario().getId().equalsIgnoreCase(id1) && pointer.getObjetivo().getUsuario().getId().equalsIgnoreCase(id2)){
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                deleteAtIndex(cont);
                return temp;
            } else{
                return null;
            }
        }     
    }
}

